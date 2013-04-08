#!/usr/bin/python
import csv, os
from optparse import OptionParser
import math
import re

def distance(x1, y1, x2, y2):
    return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)

parser = OptionParser(description='parse csv file for nodes on campus map, dump to Java Code')
parser.add_option('-c','--csv',dest='csv_file',default=os.path.abspath('./wolfshark.csv'),
                  help='specify path to csv file, default: %s'%os.path.abspath('./wolfshark.csv'), metavar='PATH TO CSV FILE')

p_args = parser.parse_args()[0]

node_dict = {}
with open(p_args.csv_file,'r') as csvfile:
    csvreader = csv.reader(csvfile, delimiter=',', quotechar='"')
    for line in csvreader:
        try:
            x = int(re.search('(\d*)', line[4]).group(1))
            y = int(re.search('(\d*)', line[5]).group(1))
        except:
            continue
        try:
            neighbors = [neighbor.strip(',') for neighbor in  line[6].strip('[').strip(']').split()]
            node_dict[line[1]] = {'node_name': line[1], 'image_name': line[0], 'map_id': line[3], 'mapAnchorX': x, 'mapAnchorY': y, 'neighbors': neighbors}
        except:
            node_dict[line[1]] = {'node_name': line[1], 'image_name': line[0], 'map_id': line[3], 'mapAnchorX': x, 'mapAnchorY': y, 'neighbors': []}

#print node_dict['path_91']['node_name'], 'coordinates: %s, %s'%(node_dict['path_91']['mapAnchorX'], node_dict['path_91']['mapAnchorY'])

java_code = open('./.preamble.txt','r').read()
for node in node_dict.keys():
    x = node_dict[node]['mapAnchorX']
    y = node_dict[node]['mapAnchorY']

    java_code += '''
		graph.newNode();
		graph.setBufferTextAttributes("%(node_name)s", null, "%(map_id)s");
		graph.setBufferXYAttributes(%(mapAnchorX)s, %(mapAnchorY)s);
'''%node_dict[node]

    for neighbor in node_dict[node]['neighbors']:
        try:
            java_code+='''		graph.addBufferNeighbor("%s", %d);\n'''%(node_dict[neighbor]['node_name'], distance(x,y,
														 node_dict[neighbor]['mapAnchorX'],node_dict[neighbor]['mapAnchorY']))
        except:
            continue
    java_code += "		graph.pushNode();\n\n"

#    print node_dict[neighbor]['node_name'], 'coordinates: %s, %s'%(node_dict[neighbor]['mapAnchorX'], node_dict[neighbor]['mapAnchorY'])
#    print 'distance: %d'%(distance(x,y,node_dict[neighbor]['mapAnchorX'],node_dict[neighbor]['mapAnchorY']))


java_code += open('./.postamble.txt','r').read()
print java_code
