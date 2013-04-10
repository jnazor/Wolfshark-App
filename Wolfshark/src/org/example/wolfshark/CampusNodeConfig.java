
package org.example.wolfshark; 
import java.util.ArrayList;

import android.util.Log;
 

class CampusNodeConfig{

	NodeGraph graph;

	CampusNodeConfig(){
		graph = new NodeGraph();
	}

	public NodeGraph populate(){ //populates the node graph with nodes, hard coded below:

		graph.newNode();
		graph.setBufferTextAttributes("path_18", null, "campus_nw");
		graph.setBufferXYAttributes(285, 1103);
		graph.addBufferNeighbor("path_17", 40);
		graph.addBufferNeighbor("path_20", 31);
		graph.addBufferNeighbor("zin_4", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_19", null, "campus_nw");
		graph.setBufferXYAttributes(239, 1141);
		graph.addBufferNeighbor("zin_5", 13);
		graph.addBufferNeighbor("path_32", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_14", null, "campus_nw");
		graph.setBufferXYAttributes(327, 1047);
		graph.addBufferNeighbor("path_14", 0);
		graph.addBufferNeighbor("path_13", 30);
		graph.addBufferNeighbor("path_16", 36);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_15", null, "campus_nw");
		graph.setBufferXYAttributes(371, 1040);
		graph.addBufferNeighbor("path_13", 31);
		graph.addBufferNeighbor("path_16", 21);
		graph.addBufferNeighbor("path_46", 57);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_16", null, "campus_nw");
		graph.setBufferXYAttributes(361, 1059);
		graph.addBufferNeighbor("path_14", 36);
		graph.addBufferNeighbor("path_14", 36);
		graph.addBufferNeighbor("path_30", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_17", null, "campus_nw");
		graph.setBufferXYAttributes(293, 1063);
		graph.addBufferNeighbor("path_14", 37);
		graph.addBufferNeighbor("path_18", 40);
		graph.addBufferNeighbor("zin_3", 41);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_10", null, "campus_nw");
		graph.setBufferXYAttributes(333, 932);
		graph.addBufferNeighbor("path_2", 22);
		graph.addBufferNeighbor("path_11", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_11", null, "campus_nw");
		graph.setBufferXYAttributes(343, 950);
		graph.addBufferNeighbor("path_10", 20);
		graph.addBufferNeighbor("path_12", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_12", null, "campus_nw");
		graph.setBufferXYAttributes(344, 973);
		graph.addBufferNeighbor("path_11", 23);
		graph.addBufferNeighbor("path_13", 49);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_13", null, "campus_nw");
		graph.setBufferXYAttributes(345, 1022);
		graph.addBufferNeighbor("path_12", 49);
		graph.addBufferNeighbor("path_14", 30);
		graph.addBufferNeighbor("path_15", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_94", null, "campus_nw");
		graph.setBufferXYAttributes(728, 896);
		graph.addBufferNeighbor("path_93", 7);
		graph.addBufferNeighbor("path_95", 29);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_95", null, "campus_nw");
		graph.setBufferXYAttributes(755, 884);
		graph.addBufferNeighbor("path_94", 29);
		graph.addBufferNeighbor("path_96", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_96", null, "campus_nw");
		graph.setBufferXYAttributes(790, 877);
		graph.addBufferNeighbor("path_95", 35);
		graph.addBufferNeighbor("art_1", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_97", null, "campus_nw");
		graph.setBufferXYAttributes(790, 906);
		graph.addBufferNeighbor("path_96", 29);
		graph.addBufferNeighbor("path_98", 18);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_90", null, "campus_nw");
		graph.setBufferXYAttributes(694, 992);
		graph.addBufferNeighbor("path_89", 40);
		graph.addBufferNeighbor("path_91", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_91", null, "campus_nw");
		graph.setBufferXYAttributes(691, 972);
		graph.addBufferNeighbor("path_56", 62);
		graph.addBufferNeighbor("path_90", 20);
		graph.addBufferNeighbor("path_92", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_92", null, "campus_nw");
		graph.setBufferXYAttributes(721, 972);
		graph.addBufferNeighbor("path_91", 30);
		graph.addBufferNeighbor("path_93", 76);
		graph.addBufferNeighbor("path_101", 63);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_93", null, "campus_nw");
		graph.setBufferXYAttributes(721, 896);
		graph.addBufferNeighbor("path_92", 76);
		graph.addBufferNeighbor("path_94", 7);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_post_office", null, "campus_nw");
		graph.setBufferXYAttributes(391, 1102);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_119", null, "campus_nw");
		graph.setBufferXYAttributes(1034, 1033);
		graph.addBufferNeighbor("path_118", 15);
		graph.addBufferNeighbor("path_120", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_98", null, "campus_nw");
		graph.setBufferXYAttributes(798, 923);
		graph.addBufferNeighbor("path_97", 18);
		graph.addBufferNeighbor("path_99", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_99", null, "campus_nw");
		graph.setBufferXYAttributes(813, 935);
		graph.addBufferNeighbor("path_98", 19);
		graph.addBufferNeighbor("path_100", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_130", null, "campus_nw");
		graph.setBufferXYAttributes(910, 1116);
		graph.addBufferNeighbor("path_111", 34);
		graph.addBufferNeighbor("path_129", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_131", null, "campus_nw");
		graph.setBufferXYAttributes(1106, 1149);
		graph.addBufferNeighbor("path_122", 52);
		graph.addBufferNeighbor("path_132", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_132", null, "campus_nw");
		graph.setBufferXYAttributes(1136, 1150);
		graph.addBufferNeighbor("path_136", 9);
		graph.addBufferNeighbor("path_133", 28);
		graph.addBufferNeighbor("path_131", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_133", null, "campus_nw");
		graph.setBufferXYAttributes(1131, 1178);
		graph.addBufferNeighbor("path_134", 32);
		graph.addBufferNeighbor("path_135", 26);
		graph.addBufferNeighbor("path_132", 28);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_134", null, "campus_nw");
		graph.setBufferXYAttributes(1106, 1198);
		graph.addBufferNeighbor("path_133", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_135", null, "campus_nw");
		graph.setBufferXYAttributes(1148, 1198);
		graph.addBufferNeighbor("path_133", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_136", null, "campus_nw");
		graph.setBufferXYAttributes(1136, 1141);
		graph.addBufferNeighbor("path_137", 34);
		graph.addBufferNeighbor("path_132", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_137", null, "campus_nw");
		graph.setBufferXYAttributes(1170, 1142);
		graph.addBufferNeighbor("path_136", 34);
		graph.addBufferNeighbor("path_138", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_138", null, "campus_nw");
		graph.setBufferXYAttributes(1182, 1155);
		graph.addBufferNeighbor("path_137", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_139", null, "campus_nw");
		graph.setBufferXYAttributes(1070, 1013);
		graph.addBufferNeighbor("path_120", 26);
		graph.addBufferNeighbor("path_140", 37);
		graph.addBufferNeighbor("path_146", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("environment", null, "campus_nw");
		graph.setBufferXYAttributes(438, 763);
		graph.addBufferNeighbor("path_60", 126);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_7", null, "campus_nw");
		graph.setBufferXYAttributes(361, 1179);
		graph.addBufferNeighbor("path_24", 38);
		graph.addBufferNeighbor("path_26", 12);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_6", null, "campus_nw");
		graph.setBufferXYAttributes(273, 1173);
		graph.addBufferNeighbor("path_21", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_140", null, "campus_nw");
		graph.setBufferXYAttributes(1107, 1015);
		graph.addBufferNeighbor("path_139", 37);
		graph.addBufferNeighbor("path_141", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_4", null, "campus_nw");
		graph.setBufferXYAttributes(262, 1101);
		graph.addBufferNeighbor("path_18", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_3", null, "campus_nw");
		graph.setBufferXYAttributes(253, 1054);
		graph.addBufferNeighbor("path_17", 41);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_2", null, "campus_nw");
		graph.setBufferXYAttributes(320, 972);
		graph.addBufferNeighbor("path_12", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_1", null, "campus_nw");
		graph.setBufferXYAttributes(239, 993);
		graph.addBufferNeighbor("path_9", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_29", null, "campus_nw");
		graph.setBufferXYAttributes(371, 1120);
		graph.addBufferNeighbor("zin_pool_1", 12);
		graph.addBufferNeighbor("path_25", 33);
		graph.addBufferNeighbor("path_30", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_21", null, "campus_nw");
		graph.setBufferXYAttributes(279, 1161);
		graph.addBufferNeighbor("path_32", 20);
		graph.addBufferNeighbor("path_22", 23);
		graph.addBufferNeighbor("path_24", 46);
		graph.addBufferNeighbor("zin_6", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_20", null, "campus_nw");
		graph.setBufferXYAttributes(286, 1134);
		graph.addBufferNeighbor("path_32", 16);
		graph.addBufferNeighbor("path_22", 19);
		graph.addBufferNeighbor("path_18", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_23", null, "campus_nw");
		graph.setBufferXYAttributes(339, 1156);
		graph.addBufferNeighbor("path_22", 40);
		graph.addBufferNeighbor("path_25", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_22", null, "campus_nw");
		graph.setBufferXYAttributes(299, 1149);
		graph.addBufferNeighbor("path_21", 23);
		graph.addBufferNeighbor("path_20", 19);
		graph.addBufferNeighbor("path_24", 30);
		graph.addBufferNeighbor("path_23", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_25", null, "campus_nw");
		graph.setBufferXYAttributes(370, 1153);
		graph.addBufferNeighbor("path_23", 31);
		graph.addBufferNeighbor("path_26", 21);
		graph.addBufferNeighbor("path_29", 33);
		graph.addBufferNeighbor("zin_pool_1", 34);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_24", null, "campus_nw");
		graph.setBufferXYAttributes(325, 1165);
		graph.addBufferNeighbor("path_22", 30);
		graph.addBufferNeighbor("path_21", 46);
		graph.addBufferNeighbor("zin_7", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_27", null, "campus_nw");
		graph.setBufferXYAttributes(387, 1181);
		graph.addBufferNeighbor("path_26", 16);
		graph.addBufferNeighbor("path_35", 52);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_26", null, "campus_nw");
		graph.setBufferXYAttributes(372, 1174);
		graph.addBufferNeighbor("zin_7", 12);
		graph.addBufferNeighbor("path_25", 21);
		graph.addBufferNeighbor("path_27", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("campus_prints", null, "campus_nw");
		graph.setBufferXYAttributes(1008, 1082);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_housing", null, "campus_nw");
		graph.setBufferXYAttributes(392, 1148);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cab_2", null, "campus_nw");
		graph.setBufferXYAttributes(242, 936);
		graph.addBufferNeighbor("path_8", 25);
		graph.addBufferNeighbor("path_1", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_123", null, "campus_nw");
		graph.setBufferXYAttributes(1005, 1148);
		graph.addBufferNeighbor("path_124", 6);
		graph.addBufferNeighbor("path_122", 49);
		graph.addBufferNeighbor("pub_1", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_122", null, "campus_nw");
		graph.setBufferXYAttributes(1054, 1150);
		graph.addBufferNeighbor("path_123", 49);
		graph.addBufferNeighbor("path_121", 79);
		graph.addBufferNeighbor("path_131", 52);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_121", null, "campus_nw");
		graph.setBufferXYAttributes(1053, 1071);
		graph.addBufferNeighbor("path_121", 0);
		graph.addBufferNeighbor("commons_1", 27);
		graph.addBufferNeighbor("path_122", 79);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_120", null, "campus_nw");
		graph.setBufferXYAttributes(1049, 1029);
		graph.addBufferNeighbor("path_119", 15);
		graph.addBufferNeighbor("path_139", 26);
		graph.addBufferNeighbor("path_121", 42);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_127", null, "campus_nw");
		graph.setBufferXYAttributes(924, 1153);
		graph.addBufferNeighbor("path_154", 98);
		graph.addBufferNeighbor("path_126", 21);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_126", null, "campus_nw");
		graph.setBufferXYAttributes(945, 1153);
		graph.addBufferNeighbor("path_128", 38);
		graph.addBufferNeighbor("path_127", 21);
		graph.addBufferNeighbor("path_125", 15);
		graph.addBufferNeighbor("path_129", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_125", null, "campus_nw");
		graph.setBufferXYAttributes(959, 1147);
		graph.addBufferNeighbor("path_126", 15);
		graph.addBufferNeighbor("path_124", 40);
		graph.addBufferNeighbor("su_1", 46);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_124", null, "campus_nw");
		graph.setBufferXYAttributes(999, 1148);
		graph.addBufferNeighbor("path_154", 173);
		graph.addBufferNeighbor("path_126", 54);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("student_union", null, "campus_nw");
		graph.setBufferXYAttributes(988, 1102);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_129", null, "campus_nw");
		graph.setBufferXYAttributes(924, 1135);
		graph.addBufferNeighbor("path_130", 23);
		graph.addBufferNeighbor("path_126", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_128", null, "campus_nw");
		graph.setBufferXYAttributes(945, 1191);
		graph.addBufferNeighbor("path_126", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commons", null, "campus_nw");
		graph.setBufferXYAttributes(1136, 1087);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("chalkhill", null, "campus_nw");
		graph.setBufferXYAttributes(383, 907);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("art_lake", null, "campus_nw");
		graph.setBufferXYAttributes(943, 915);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("art", null, "campus_nw");
		graph.setBufferXYAttributes(846, 909);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("jump", null, "campus_nw");
		graph.setBufferXYAttributes(1021, 1092);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_cafe", null, "campus_nw");
		graph.setBufferXYAttributes(422, 1025);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("stevenson_1", null, "campus_nw");
		graph.setBufferXYAttributes(824, 1162);
		graph.addBufferNeighbor("path_154", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_116", null, "campus_nw");
		graph.setBufferXYAttributes(972, 1000);
		graph.addBufferNeighbor("path_117", 14);
		graph.addBufferNeighbor("path_115", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_117", null, "campus_nw");
		graph.setBufferXYAttributes(986, 1005);
		graph.addBufferNeighbor("path_116", 14);
		graph.addBufferNeighbor("path_118", 44);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_114", null, "campus_nw");
		graph.setBufferXYAttributes(938, 1037);
		graph.addBufferNeighbor("path_113", 11);
		graph.addBufferNeighbor("path_126", 116);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_115", null, "campus_nw");
		graph.setBufferXYAttributes(939, 1003);
		graph.addBufferNeighbor("path_107", 19);
		graph.addBufferNeighbor("path_113", 23);
		graph.addBufferNeighbor("path_116", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_112", null, "campus_nw");
		graph.setBufferXYAttributes(903, 1068);
		graph.addBufferNeighbor("path_111", 15);
		graph.addBufferNeighbor("path_113", 54);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_113", null, "campus_nw");
		graph.setBufferXYAttributes(937, 1026);
		graph.addBufferNeighbor("path_115", 23);
		graph.addBufferNeighbor("path_114", 11);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_8", null, "campus_nw");
		graph.setBufferXYAttributes(225, 955);
		graph.addBufferNeighbor("path_9", 20);
		graph.addBufferNeighbor("cab_2", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_9", null, "campus_nw");
		graph.setBufferXYAttributes(233, 974);
		graph.addBufferNeighbor("zin_1", 19);
		graph.addBufferNeighbor("path_8", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_6", null, "campus_nw");
		graph.setBufferXYAttributes(357, 902);
		graph.addBufferNeighbor("path_5", 14);
		graph.addBufferNeighbor("path_7", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_7", null, "campus_nw");
		graph.setBufferXYAttributes(365, 890);
		graph.addBufferNeighbor("chalkhill_1", 12);
		graph.addBufferNeighbor("path_6", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_4", null, "campus_nw");
		graph.setBufferXYAttributes(299, 884);
		graph.addBufferNeighbor("cab_1", 13);
		graph.addBufferNeighbor("path_3", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_5", null, "campus_nw");
		graph.setBufferXYAttributes(343, 904);
		graph.addBufferNeighbor("path_3", 25);
		graph.addBufferNeighbor("path_6", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_2", null, "campus_nw");
		graph.setBufferXYAttributes(317, 916);
		graph.addBufferNeighbor("path_1", 39);
		graph.addBufferNeighbor("path_10", 22);
		graph.addBufferNeighbor("path_3", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_3", null, "campus_nw");
		graph.setBufferXYAttributes(318, 908);
		graph.addBufferNeighbor("path_4", 30);
		graph.addBufferNeighbor("path_2", 8);
		graph.addBufferNeighbor("path_5", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_118", null, "campus_nw");
		graph.setBufferXYAttributes(1019, 1035);
		graph.addBufferNeighbor("path_117", 44);
		graph.addBufferNeighbor("path_119", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_1", null, "campus_nw");
		graph.setBufferXYAttributes(280, 929);
		graph.addBufferNeighbor("path_2", 39);
		graph.addBufferNeighbor("cab_2", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("childrens_school", null, "campus_nw");
		graph.setBufferXYAttributes(461, 972);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cab_1", null, "campus_nw");
		graph.setBufferXYAttributes(298, 871);
		graph.addBufferNeighbor("path_4", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pub_1", null, "campus_nw");
		graph.setBufferXYAttributes(1005, 1111);
		graph.addBufferNeighbor("path_123", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_pool_1", null, "campus_nw");
		graph.setBufferXYAttributes(359, 1120);
		graph.addBufferNeighbor("path_30", 40);
		graph.addBufferNeighbor("path_29", 12);
		graph.addBufferNeighbor("path_25", 34);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_109", null, "campus_nw");
		graph.setBufferXYAttributes(868, 1028);
		graph.addBufferNeighbor("path_110", 54);
		graph.addBufferNeighbor("path_104", 48);
		graph.addBufferNeighbor("path_108", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_108", null, "campus_nw");
		graph.setBufferXYAttributes(896, 1011);
		graph.addBufferNeighbor("path_109", 32);
		graph.addBufferNeighbor("path_107", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pub", null, "campus_nw");
		graph.setBufferXYAttributes(1008, 1094);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_101", null, "campus_nw");
		graph.setBufferXYAttributes(784, 974);
		graph.addBufferNeighbor("path_100", 35);
		graph.addBufferNeighbor("path_102", 23);
		graph.addBufferNeighbor("path_92", 63);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_100", null, "campus_nw");
		graph.setBufferXYAttributes(809, 949);
		graph.addBufferNeighbor("path_99", 14);
		graph.addBufferNeighbor("path_101", 35);
		graph.addBufferNeighbor("path_103", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_103", null, "campus_nw");
		graph.setBufferXYAttributes(822, 978);
		graph.addBufferNeighbor("path_100", 31);
		graph.addBufferNeighbor("path_102", 16);
		graph.addBufferNeighbor("path_104", 55);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_102", null, "campus_nw");
		graph.setBufferXYAttributes(806, 981);
		graph.addBufferNeighbor("path_101", 23);
		graph.addBufferNeighbor("path_103", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_105", null, "campus_nw");
		graph.setBufferXYAttributes(894, 968);
		graph.addBufferNeighbor("path_104", 20);
		graph.addBufferNeighbor("path_107", 42);
		graph.addBufferNeighbor("path_106", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_104", null, "campus_nw");
		graph.setBufferXYAttributes(877, 980);
		graph.addBufferNeighbor("path_109", 48);
		graph.addBufferNeighbor("path_105", 20);
		graph.addBufferNeighbor("path_103", 55);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_107", null, "campus_nw");
		graph.setBufferXYAttributes(920, 1002);
		graph.addBufferNeighbor("path_105", 42);
		graph.addBufferNeighbor("path_115", 19);
		graph.addBufferNeighbor("path_108", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_106", null, "campus_nw");
		graph.setBufferXYAttributes(896, 928);
		graph.addBufferNeighbor("art_2", 17);
		graph.addBufferNeighbor("path_105", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_145", null, "campus_nw");
		graph.setBufferXYAttributes(1127, 966);
		graph.addBufferNeighbor("path_147", 18);
		graph.addBufferNeighbor("path_144", 36);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_144", null, "campus_nw");
		graph.setBufferXYAttributes(1154, 991);
		graph.addBufferNeighbor("path_145", 36);
		graph.addBufferNeighbor("path_143", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_147", null, "campus_nw");
		graph.setBufferXYAttributes(1115, 952);
		graph.addBufferNeighbor("path_148", 34);
		graph.addBufferNeighbor("path_145", 18);
		graph.addBufferNeighbor("path_146", 45);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("carson_hall", null, "campus_nw");
		graph.setBufferXYAttributes(647, 1082);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_36", null, "campus_nw");
		graph.setBufferXYAttributes(449, 1181);
		graph.addBufferNeighbor("path_35", 12);
		graph.addBufferNeighbor("path_37", 53);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_37", null, "campus_nw");
		graph.setBufferXYAttributes(483, 1140);
		graph.addBufferNeighbor("path_34", 45);
		graph.addBufferNeighbor("path_39", 22);
		graph.addBufferNeighbor("path_36", 53);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_34", null, "campus_nw");
		graph.setBufferXYAttributes(438, 1134);
		graph.addBufferNeighbor("zin_courtyard", 25);
		graph.addBufferNeighbor("path_35", 40);
		graph.addBufferNeighbor("path_37", 45);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_35", null, "campus_nw");
		graph.setBufferXYAttributes(439, 1174);
		graph.addBufferNeighbor("path_27", 52);
		graph.addBufferNeighbor("path_36", 12);
		graph.addBufferNeighbor("path_34", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_32", null, "campus_nw");
		graph.setBufferXYAttributes(272, 1142);
		graph.addBufferNeighbor("path_19", 33);
		graph.addBufferNeighbor("path_20", 16);
		graph.addBufferNeighbor("path_21", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_30", null, "campus_nw");
		graph.setBufferXYAttributes(373, 1082);
		graph.addBufferNeighbor("path_16", 25);
		graph.addBufferNeighbor("path_20", 101);
		graph.addBufferNeighbor("zin_pool_1", 40);
		graph.addBufferNeighbor("path_31", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_31", null, "campus_nw");
		graph.setBufferXYAttributes(383, 1093);
		graph.addBufferNeighbor("path_30", 14);
		graph.addBufferNeighbor("path_38", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commencement_lake", null, "campus_nw");
		graph.setBufferXYAttributes(1187, 952);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_38", null, "campus_nw");
		graph.setBufferXYAttributes(406, 1099);
		graph.addBufferNeighbor("path_31", 23);
		graph.addBufferNeighbor("zin_courtyard", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_39", null, "campus_nw");
		graph.setBufferXYAttributes(504, 1131);
		graph.addBufferNeighbor("path_37", 22);
		graph.addBufferNeighbor("path_61", 20);
		graph.addBufferNeighbor("path_40", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_143", null, "campus_nw");
		graph.setBufferXYAttributes(1170, 1010);
		graph.addBufferNeighbor("path_144", 24);
		graph.addBufferNeighbor("path_152", 75);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_142", null, "campus_nw");
		graph.setBufferXYAttributes(1157, 1015);
		graph.addBufferNeighbor("path_141", 24);
		graph.addBufferNeighbor("path_143", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_146", null, "campus_nw");
		graph.setBufferXYAttributes(1088, 989);
		graph.addBufferNeighbor("path_139", 30);
		graph.addBufferNeighbor("path_147", 45);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("childrens_school_1", null, "campus_nw");
		graph.setBufferXYAttributes(456, 1018);
		graph.addBufferNeighbor("path_44", 74);
		graph.addBufferNeighbor("path_46", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cabernet", null, "campus_nw");
		graph.setBufferXYAttributes(194, 875);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zinfandel", null, "campus_nw");
		graph.setBufferXYAttributes(245, 1097);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_43", null, "campus_nw");
		graph.setBufferXYAttributes(530, 1052);
		graph.addBufferNeighbor("path_42", 31);
		graph.addBufferNeighbor("path_44", 36);
		graph.addBufferNeighbor("path_47", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_42", null, "campus_nw");
		graph.setBufferXYAttributes(530, 1083);
		graph.addBufferNeighbor("path_41", 16);
		graph.addBufferNeighbor("path_43", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_41", null, "campus_nw");
		graph.setBufferXYAttributes(527, 1099);
		graph.addBufferNeighbor("path_40", 17);
		graph.addBufferNeighbor("path_42", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_40", null, "campus_nw");
		graph.setBufferXYAttributes(518, 1114);
		graph.addBufferNeighbor("path_39", 22);
		graph.addBufferNeighbor("path_41", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_47", null, "campus_nw");
		graph.setBufferXYAttributes(554, 1053);
		graph.addBufferNeighbor("path_65", 35);
		graph.addBufferNeighbor("path_41", 53);
		graph.addBufferNeighbor("path_48", 12);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_46", null, "campus_nw");
		graph.setBufferXYAttributes(428, 1039);
		graph.addBufferNeighbor("path_15", 57);
		graph.addBufferNeighbor("childrens_school_1", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_44", null, "campus_nw");
		graph.setBufferXYAttributes(530, 1016);
		graph.addBufferNeighbor("path_43", 36);
		graph.addBufferNeighbor("childrens_school_1", 74);
		graph.addBufferNeighbor("path_58", 44);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_49", null, "campus_nw");
		graph.setBufferXYAttributes(554, 1028);
		graph.addBufferNeighbor("path_48", 13);
		graph.addBufferNeighbor("path_50", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_48", null, "campus_nw");
		graph.setBufferXYAttributes(554, 1041);
		graph.addBufferNeighbor("path_47", 12);
		graph.addBufferNeighbor("path_51", 24);
		graph.addBufferNeighbor("path_49", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_courtyard", null, "campus_nw");
		graph.setBufferXYAttributes(423, 1114);
		graph.addBufferNeighbor("path_38", 22);
		graph.addBufferNeighbor("path_34", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_5", null, "campus_nw");
		graph.setBufferXYAttributes(239, 1128);
		graph.addBufferNeighbor("path_19", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_pool", null, "campus_nw");
		graph.setBufferXYAttributes(340, 1118);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("multiculturalcenter", null, "campus_nw");
		graph.setBufferXYAttributes(983, 1065);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_50", null, "campus_nw");
		graph.setBufferXYAttributes(568, 1018);
		graph.addBufferNeighbor("path_49", 17);
		graph.addBufferNeighbor("path_53", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_51", null, "campus_nw");
		graph.setBufferXYAttributes(578, 1039);
		graph.addBufferNeighbor("path_48", 24);
		graph.addBufferNeighbor("path_52", 10);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_52", null, "campus_nw");
		graph.setBufferXYAttributes(584, 1031);
		graph.addBufferNeighbor("path_51", 10);
		graph.addBufferNeighbor("path_53", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_53", null, "campus_nw");
		graph.setBufferXYAttributes(584, 1017);
		graph.addBufferNeighbor("path_50", 16);
		graph.addBufferNeighbor("path_52", 14);
		graph.addBufferNeighbor("path_54", 18);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_54", null, "campus_nw");
		graph.setBufferXYAttributes(595, 1002);
		graph.addBufferNeighbor("path_53", 18);
		graph.addBufferNeighbor("path_55", 39);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_55", null, "campus_nw");
		graph.setBufferXYAttributes(629, 981);
		graph.addBufferNeighbor("path_54", 39);
		graph.addBufferNeighbor("path_56", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_56", null, "campus_nw");
		graph.setBufferXYAttributes(629, 972);
		graph.addBufferNeighbor("path_55", 9);
		graph.addBufferNeighbor("path_57", 66);
		graph.addBufferNeighbor("path_91", 62);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_57", null, "campus_nw");
		graph.setBufferXYAttributes(563, 972);
		graph.addBufferNeighbor("path_56", 66);
		graph.addBufferNeighbor("path_58", 34);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_58", null, "campus_nw");
		graph.setBufferXYAttributes(529, 972);
		graph.addBufferNeighbor("path_44", 44);
		graph.addBufferNeighbor("path_57", 34);
		graph.addBufferNeighbor("path_59", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_59", null, "campus_nw");
		graph.setBufferXYAttributes(530, 932);
		graph.addBufferNeighbor("path_58", 40);
		graph.addBufferNeighbor("path_50", 94);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("nichols_1", null, "campus_nw");
		graph.setBufferXYAttributes(686, 1139);
		graph.addBufferNeighbor("path_80", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("art_gallery", null, "campus_nw");
		graph.setBufferXYAttributes(866, 910);
		graph.addBufferNeighbor("art_2", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("carson_3", null, "campus_nw");
		graph.setBufferXYAttributes(711, 1059);
		graph.addBufferNeighbor("path_88", 10);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("carson_2", null, "campus_nw");
		graph.setBufferXYAttributes(685, 1107);
		graph.addBufferNeighbor("path_82", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("carson_1", null, "campus_nw");
		graph.setBufferXYAttributes(622, 1121);
		graph.addBufferNeighbor("path_72", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_152", null, "campus_nw");
		graph.setBufferXYAttributes(1183, 1084);
		graph.addBufferNeighbor("path_143", 75);
		graph.addBufferNeighbor("path_153", 53);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_153", null, "campus_nw");
		graph.setBufferXYAttributes(1199, 1033);
		graph.addBufferNeighbor("path_152", 53);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_150", null, "campus_nw");
		graph.setBufferXYAttributes(1170, 1010);
		graph.addBufferNeighbor("path_149", 110);
		graph.addBufferNeighbor("arbor_1", 164);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_151", null, "campus_nw");
		graph.setBufferXYAttributes(1102, 860);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_154", null, "campus_nw");
		graph.setBufferXYAttributes(826, 1153);
		graph.addBufferNeighbor("path_110", 77);
		graph.addBufferNeighbor("path_85", 58);
		graph.addBufferNeighbor("path_127", 98);
		graph.addBufferNeighbor("stevenson_1", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("arbor", null, "campus_nw");
		graph.setBufferXYAttributes(1067, 842);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("art_2", null, "campus_nw");
		graph.setBufferXYAttributes(896, 911);
		graph.addBufferNeighbor("path_106", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("art_1", null, "campus_nw");
		graph.setBufferXYAttributes(814, 868);
		graph.addBufferNeighbor("path_96", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_marketplace", null, "campus_nw");
		graph.setBufferXYAttributes(391, 1120);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("chalkhill_1", null, "campus_nw");
		graph.setBufferXYAttributes(376, 885);
		graph.addBufferNeighbor("path_7", 12);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_69", null, "campus_nw");
		graph.setBufferXYAttributes(584, 1143);
		graph.addBufferNeighbor("path_67", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_68", null, "campus_nw");
		graph.setBufferXYAttributes(570, 1159);
		graph.addBufferNeighbor("health_2", 13);
		graph.addBufferNeighbor("path_67", 12);
		graph.addBufferNeighbor("path_70", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_65", null, "campus_nw");
		graph.setBufferXYAttributes(553, 1088);
		graph.addBufferNeighbor("path_64", 22);
		graph.addBufferNeighbor("path_47", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_64", null, "campus_nw");
		graph.setBufferXYAttributes(549, 1110);
		graph.addBufferNeighbor("path_63", 35);
		graph.addBufferNeighbor("path_65", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_67", null, "campus_nw");
		graph.setBufferXYAttributes(567, 1147);
		graph.addBufferNeighbor("path_63", 17);
		graph.addBufferNeighbor("path_68", 12);
		graph.addBufferNeighbor("path_69", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_66", null, "campus_nw");
		graph.setBufferXYAttributes(636, 1188);
		graph.addBufferNeighbor("path_71", 37);
		graph.addBufferNeighbor("path_73", 41);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_61", null, "campus_nw");
		graph.setBufferXYAttributes(520, 1144);
		graph.addBufferNeighbor("path_39", 20);
		graph.addBufferNeighbor("path_62", 22);
		graph.addBufferNeighbor("health_1", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_60", null, "campus_nw");
		graph.setBufferXYAttributes(530, 850);
		graph.addBufferNeighbor("environment", 126);
		graph.addBufferNeighbor("path_59", 82);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_63", null, "campus_nw");
		graph.setBufferXYAttributes(550, 1145);
		graph.addBufferNeighbor("health_1", 16);
		graph.addBufferNeighbor("path_62", 8);
		graph.addBufferNeighbor("path_67", 17);
		graph.addBufferNeighbor("path_64", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_62", null, "campus_nw");
		graph.setBufferXYAttributes(542, 1145);
		graph.addBufferNeighbor("health_1", 14);
		graph.addBufferNeighbor("path_61", 22);
		graph.addBufferNeighbor("path_63", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("health_2", null, "campus_nw");
		graph.setBufferXYAttributes(558, 1165);
		graph.addBufferNeighbor("path_68", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("health_1", null, "campus_nw");
		graph.setBufferXYAttributes(542, 1159);
		graph.addBufferNeighbor("path_61", 26);
		graph.addBufferNeighbor("path_62", 14);
		graph.addBufferNeighbor("path_63", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_87", null, "campus_nw");
		graph.setBufferXYAttributes(727, 1099);
		graph.addBufferNeighbor("path_82", 15);
		graph.addBufferNeighbor("path_86", 37);
		graph.addBufferNeighbor("path_88", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_86", null, "campus_nw");
		graph.setBufferXYAttributes(753, 1126);
		graph.addBufferNeighbor("path_85", 30);
		graph.addBufferNeighbor("path_87", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_85", null, "campus_nw");
		graph.setBufferXYAttributes(768, 1152);
		graph.addBufferNeighbor("path_84", 25);
		graph.addBufferNeighbor("path_86", 30);
		graph.addBufferNeighbor("path_154", 58);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_84", null, "campus_nw");
		graph.setBufferXYAttributes(743, 1153);
		graph.addBufferNeighbor("path_77", 37);
		graph.addBufferNeighbor("path_80", 45);
		graph.addBufferNeighbor("path_81", 42);
		graph.addBufferNeighbor("path_85", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_141", null, "campus_nw");
		graph.setBufferXYAttributes(1133, 1012);
		graph.addBufferNeighbor("path_142", 24);
		graph.addBufferNeighbor("path_140", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_82", null, "campus_nw");
		graph.setBufferXYAttributes(715, 1109);
		graph.addBufferNeighbor("carson_2", 30);
		graph.addBufferNeighbor("path_81", 15);
		graph.addBufferNeighbor("path_87", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_81", null, "campus_nw");
		graph.setBufferXYAttributes(712, 1124);
		graph.addBufferNeighbor("path_80", 21);
		graph.addBufferNeighbor("path_82", 15);
		graph.addBufferNeighbor("path_84", 42);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_80", null, "campus_nw");
		graph.setBufferXYAttributes(699, 1141);
		graph.addBufferNeighbor("nichols_1", 13);
		graph.addBufferNeighbor("path_77", 25);
		graph.addBufferNeighbor("path_81", 21);
		graph.addBufferNeighbor("path_84", 45);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commons_2", null, "campus_nw");
		graph.setBufferXYAttributes(1136, 1112);
		graph.addBufferNeighbor("path_136", 29);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("su_1", null, "campus_nw");
		graph.setBufferXYAttributes(989, 1112);
		graph.addBufferNeighbor("path_124", 37);
		graph.addBufferNeighbor("path_125", 46);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commons_1", null, "campus_nw");
		graph.setBufferXYAttributes(1080, 1070);
		graph.addBufferNeighbor("path_121", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_149", null, "campus_nw");
		graph.setBufferXYAttributes(1154, 901);
		graph.addBufferNeighbor("path_148", 29);
		graph.addBufferNeighbor("path_150", 110);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_148", null, "campus_nw");
		graph.setBufferXYAttributes(1133, 922);
		graph.addBufferNeighbor("path_147", 34);
		graph.addBufferNeighbor("path_148", 0);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_89", null, "campus_nw");
		graph.setBufferXYAttributes(723, 1020);
		graph.addBufferNeighbor("path_88", 39);
		graph.addBufferNeighbor("path_90", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_88", null, "campus_nw");
		graph.setBufferXYAttributes(721, 1059);
		graph.addBufferNeighbor("path_87", 40);
		graph.addBufferNeighbor("path_89", 39);
		graph.addBufferNeighbor("carson_3", 10);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_110", null, "campus_nw");
		graph.setBufferXYAttributes(846, 1078);
		graph.addBufferNeighbor("path_109", 54);
		graph.addBufferNeighbor("path_154", 77);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_111", null, "campus_nw");
		graph.setBufferXYAttributes(900, 1083);
		graph.addBufferNeighbor("path_112", 15);
		graph.addBufferNeighbor("path_130", 34);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commencement", null, "campus_nw");
		graph.setBufferXYAttributes(1040, 945);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("arbor_1", null, "campus_nw");
		graph.setBufferXYAttributes(1102, 860);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_72", null, "campus_nw");
		graph.setBufferXYAttributes(612, 1142);
		graph.addBufferNeighbor("path_71", 19);
		graph.addBufferNeighbor("path_69", 28);
		graph.addBufferNeighbor("carson_1", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_73", null, "campus_nw");
		graph.setBufferXYAttributes(677, 1186);
		graph.addBufferNeighbor("path_66", 41);
		graph.addBufferNeighbor("path_74", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_70", null, "campus_nw");
		graph.setBufferXYAttributes(600, 1162);
		graph.addBufferNeighbor("path_71", 10);
		graph.addBufferNeighbor("path_68", 30);
		graph.addBufferNeighbor("path_69", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_71", null, "campus_nw");
		graph.setBufferXYAttributes(610, 1161);
		graph.addBufferNeighbor("path_70", 10);
		graph.addBufferNeighbor("path_66", 37);
		graph.addBufferNeighbor("path_72", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_76", null, "campus_nw");
		graph.setBufferXYAttributes(709, 1178);
		graph.addBufferNeighbor("path_77", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_77", null, "campus_nw");
		graph.setBufferXYAttributes(708, 1165);
		graph.addBufferNeighbor("path_74", 25);
		graph.addBufferNeighbor("path_76", 13);
		graph.addBufferNeighbor("path_80", 25);
		graph.addBufferNeighbor("path_84", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_74", null, "campus_nw");
		graph.setBufferXYAttributes(684, 1174);
		graph.addBufferNeighbor("path_73", 13);
		graph.addBufferNeighbor("path_77", 25);
		graph.pushNode();

		return graph;
	}
}



//OLD VERSION

/*package org.example.wolfshark; 
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
 */
/*
class CampusNodeConfig{
	
	NodeGraph graph;
	
	CampusNodeConfig(){
		
		
		graph = new NodeGraph();
	}
	*/
	/*
	public NodeGraph populate(Context context){ //populates the node graph with nodes, hard coded below:
		
		AssetManager am = context.getAssets();
		
		InputStream is;
		
		try {
			is = am.open("mainCampusNodes");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String input;
		
		//while(input != null)
		{
			
		}
		*/
		/*
		
		graph.newNode();
		graph.setBufferTextAttributes("Darwin Hall", "Darwin Hall", "main");
		graph.setBufferXYAttributes(1000, 1000);
		graph.pushNode();
		
		
		
		graph.newNode();
		graph.setBufferTextAttributes("Stevenson Hall", "Stevenson Hall", "main");
		graph.setBufferXYAttributes(1500,1000);
		graph.addBufferNeighbor("Darwin Hall");
		graph.pushNode();
		
		graph.makeNode("Student Union", "Student Union", "main", 1000, 1200, "Stevenson Hall");
		
		
		/*
		graph.newNode();
		graph.setBufferTextAttributes("Salazar Hall", "Salazar Hall", "main");
		graph.setBufferXYAttributes(200, 225);
		graph.addBufferNeighbor("Darwin Hall");
		graph.pushNode();
		*/
		
		/*
		graph.makeNode("Darwin Hall", "Darwin Hall", "main", 1000, 1000, "none");
		graph.makeNode("path_1", "", "main", 1000, 1100, "Darwin Hall");
		graph.makeNode("Student Union", "Student Union", "main", 1000, 1200, "path_1");//name, displayname, x, x, 1 neighbor
		
		
		
		
		
		return graph;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/
