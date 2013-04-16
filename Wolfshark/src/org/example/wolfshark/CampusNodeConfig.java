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
		graph.addBufferNeighbor("path_362", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_135", null, "campus_nw");
		graph.setBufferXYAttributes(1148, 1198);
		graph.addBufferNeighbor("path_133", 26);
		graph.addBufferNeighbor("path_360", 59);
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
		graph.addBufferNeighbor("path_175", 26);
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
		graph.setBufferTextAttributes("zin_8", null, "campus_sw");
		graph.setBufferXYAttributes(284, 1277);
		graph.addBufferNeighbor("path_213", 93);
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
		graph.setBufferTextAttributes("zin_5", null, "campus_nw");
		graph.setBufferXYAttributes(239, 1128);
		graph.addBufferNeighbor("path_19", 13);
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
		graph.setBufferTextAttributes("bouj_1", null, "campus_se");
		graph.setBufferXYAttributes(1595, 1806);
		graph.addBufferNeighbor("path_201", 175);
		graph.addBufferNeighbor("path_202", 164);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_housing", null, "campus_nw");
		graph.setBufferXYAttributes(392, 1148);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("facilities", null, "campus_ne");
		graph.setBufferXYAttributes(2126, 1033);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commons", null, "campus_nw");
		graph.setBufferXYAttributes(1136, 1087);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("bacon", null, "campus_sw");
		graph.setBufferXYAttributes(830, 1337);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("jump", null, "campus_nw");
		graph.setBufferXYAttributes(1021, 1092);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_369", null, "campus_sw");
		graph.setBufferXYAttributes(538, 1463);
		graph.addBufferNeighbor("mccabe", 19);
		graph.addBufferNeighbor("path_370", 42);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_368", null, "campus_sw");
		graph.setBufferXYAttributes(680, 1536);
		graph.addBufferNeighbor("path_367", 60);
		graph.addBufferNeighbor("rec_1", 71);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_365", null, "campus_sw");
		graph.setBufferXYAttributes(1143, 1891);
		graph.addBufferNeighbor("path_314", 24);
		graph.addBufferNeighbor("path_366", 1205);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_364", null, "campus_sw");
		graph.setBufferXYAttributes(941, 1450);
		graph.addBufferNeighbor("path_128", 259);
		graph.addBufferNeighbor("path_246", 153);
		graph.addBufferNeighbor("path_363", 247);
		graph.addBufferNeighbor("stevenson_3", 237);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_367", null, "campus_sw");
		graph.setBufferXYAttributes(709, 1483);
		graph.addBufferNeighbor("path_257", 81);
		graph.addBufferNeighbor("path_368", 60);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_366", null, "campus_sw");
		graph.setBufferXYAttributes(1198, 1887);
		graph.addBufferNeighbor("path_365", 1205);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_361", null, "campus_sw");
		graph.setBufferXYAttributes(1140, 1314);
		graph.addBufferNeighbor("path_358", 32);
		graph.addBufferNeighbor("path_359", 51);
		graph.addBufferNeighbor("salazar_2", 84);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_360", null, "campus_sw");
		graph.setBufferXYAttributes(1181, 1247);
		graph.addBufferNeighbor("path_135", 59);
		graph.addBufferNeighbor("path_194", 27);
		graph.addBufferNeighbor("path_359", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_363", null, "campus_sw");
		graph.setBufferXYAttributes(1041, 1224);
		graph.addBufferNeighbor("path_362", 38);
		graph.addBufferNeighbor("path_364", 247);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_362", null, "campus_sw");
		graph.setBufferXYAttributes(1079, 1226);
		graph.addBufferNeighbor("path_134", 38);
		graph.addBufferNeighbor("path_359", 100);
		graph.addBufferNeighbor("path_363", 38);
		graph.addBufferNeighbor("path_375", 80);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("toast", null, "campus_sw");
		graph.setBufferXYAttributes(886, 1330);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pub", null, "campus_nw");
		graph.setBufferXYAttributes(1008, 1094);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_318", null, "campus_sw");
		graph.setBufferXYAttributes(1047, 1766);
		graph.addBufferNeighbor("path_317", 32);
		graph.addBufferNeighbor("path_319", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_319", null, "campus_sw");
		graph.setBufferXYAttributes(1028, 1738);
		graph.addBufferNeighbor("path_318", 33);
		graph.addBufferNeighbor("path_320", 10);
		graph.addBufferNeighbor("person_1", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("south_entrance", null, "campus_sw");
		graph.setBufferXYAttributes(357, 2239);
		graph.addBufferNeighbor("path_280", 98);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_310", null, "campus_sw");
		graph.setBufferXYAttributes(906, 1831);
		graph.addBufferNeighbor("path_305", 53);
		graph.addBufferNeighbor("path_309", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_311", null, "campus_sw");
		graph.setBufferXYAttributes(752, 1836);
		graph.addBufferNeighbor("path_307", 116);
		graph.addBufferNeighbor("path_312", 57);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_312", null, "campus_sw");
		graph.setBufferXYAttributes(751, 1779);
		graph.addBufferNeighbor("path_306", 117);
		graph.addBufferNeighbor("path_311", 57);
		graph.addBufferNeighbor("path_313", 60);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_313", null, "campus_sw");
		graph.setBufferXYAttributes(693, 1762);
		graph.addBufferNeighbor("path_274", 30);
		graph.addBufferNeighbor("path_312", 60);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_314", null, "campus_sw");
		graph.setBufferXYAttributes(1119, 1888);
		graph.addBufferNeighbor("path_313", 444);
		graph.addBufferNeighbor("path_315", 29);
		graph.addBufferNeighbor("path_365", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_315", null, "campus_sw");
		graph.setBufferXYAttributes(1118, 1859);
		graph.addBufferNeighbor("path_314", 29);
		graph.addBufferNeighbor("path_316", 90);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_316", null, "campus_sw");
		graph.setBufferXYAttributes(1120, 1769);
		graph.addBufferNeighbor("path_315", 90);
		graph.addBufferNeighbor("path_317", 42);
		graph.addBufferNeighbor("path_344", 88);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_317", null, "campus_sw");
		graph.setBufferXYAttributes(1078, 1776);
		graph.addBufferNeighbor("path_316", 42);
		graph.addBufferNeighbor("path_318", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_178", null, "campus_ne");
		graph.setBufferXYAttributes(1728, 1137);
		graph.addBufferNeighbor("path_177", 18);
		graph.addBufferNeighbor("path_179", 229);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_179", null, "campus_ne");
		graph.setBufferXYAttributes(1957, 1138);
		graph.addBufferNeighbor("path_178", 229);
		graph.addBufferNeighbor("facilities_1", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_174", null, "campus_ne");
		graph.setBufferXYAttributes(1286, 1184);
		graph.addBufferNeighbor("path_175", 81);
		graph.addBufferNeighbor("path_173", 123);
		graph.addBufferNeighbor("path_193", 71);
		graph.addBufferNeighbor("pe_1", 28);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_175", null, "campus_ne");
		graph.setBufferXYAttributes(1208, 1159);
		graph.addBufferNeighbor("path_174", 81);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_176", null, "campus_ne");
		graph.setBufferXYAttributes(1691, 1140);
		graph.addBufferNeighbor("path_168", 62);
		graph.addBufferNeighbor("path_177", 19);
		graph.addBufferNeighbor("path_180", 57);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_177", null, "campus_ne");
		graph.setBufferXYAttributes(1710, 1139);
		graph.addBufferNeighbor("path_176", 19);
		graph.addBufferNeighbor("path_178", 18);
		graph.addBufferNeighbor("path_181", 58);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_170", null, "campus_ne");
		graph.setBufferXYAttributes(1501, 1062);
		graph.addBufferNeighbor("path_171", 159);
		graph.addBufferNeighbor("pool_1", 182);
		graph.addBufferNeighbor("path_169", 244);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_171", null, "campus_ne");
		graph.setBufferXYAttributes(1455, 1062);
		graph.addBufferNeighbor("path_173", 164);
		graph.addBufferNeighbor("path_172", 33);
		graph.addBufferNeighbor("path_170", 159);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_172", null, "campus_ne");
		graph.setBufferXYAttributes(1456, 1029);
		graph.addBufferNeighbor("garden_1", 97);
		graph.addBufferNeighbor("path_171", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_173", null, "campus_ne");
		graph.setBufferXYAttributes(1291, 1061);
		graph.addBufferNeighbor("path_174", 123);
		graph.addBufferNeighbor("path_171", 164);
		graph.addBufferNeighbor("path_222", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_273", null, "campus_sw");
		graph.setBufferXYAttributes(648, 1723);
		graph.addBufferNeighbor("path_265", 251);
		graph.addBufferNeighbor("path_272", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_272", null, "campus_sw");
		graph.setBufferXYAttributes(633, 1737);
		graph.addBufferNeighbor("path_271", 121);
		graph.addBufferNeighbor("path_273", 20);
		graph.addBufferNeighbor("path_274", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_271", null, "campus_sw");
		graph.setBufferXYAttributes(512, 1745);
		graph.addBufferNeighbor("path_269", 131);
		graph.addBufferNeighbor("path_272", 121);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_270", null, "campus_sw");
		graph.setBufferXYAttributes(433, 1845);
		graph.addBufferNeighbor("path_269", 22);
		graph.addBufferNeighbor("path_288", 235);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_277", null, "campus_sw");
		graph.setBufferXYAttributes(360, 1890);
		graph.addBufferNeighbor("path_276", 16);
		graph.addBufferNeighbor("path_276", 16);
		graph.addBufferNeighbor("path_279", 95);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_276", null, "campus_sw");
		graph.setBufferXYAttributes(369, 1876);
		graph.addBufferNeighbor("path_275", 8);
		graph.addBufferNeighbor("path_277", 16);
		graph.addBufferNeighbor("ameci_1", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_275", null, "campus_sw");
		graph.setBufferXYAttributes(375, 1870);
		graph.addBufferNeighbor("path_266", 121);
		graph.addBufferNeighbor("path_269", 53);
		graph.addBufferNeighbor("path_285", 144);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_274", null, "campus_sw");
		graph.setBufferXYAttributes(668, 1744);
		graph.addBufferNeighbor("path_272", 35);
		graph.addBufferNeighbor("path_313", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_279", null, "campus_sw");
		graph.setBufferXYAttributes(361, 1985);
		graph.addBufferNeighbor("path_277", 95);
		graph.addBufferNeighbor("path_280", 156);
		graph.addBufferNeighbor("sauv_1", 50);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_278", null, "campus_sw");
		graph.setBufferXYAttributes(336, 1890);
		graph.addBufferNeighbor("path_277", 24);
		graph.addBufferNeighbor("ameci_1", 13);
		graph.addBufferNeighbor("coop_1", 39);
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
		graph.setBufferTextAttributes("zin_pool", null, "campus_nw");
		graph.setBufferXYAttributes(340, 1118);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("multiculturalcenter", null, "campus_nw");
		graph.setBufferXYAttributes(983, 1065);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_153", null, "campus_nw");
		graph.setBufferXYAttributes(1199, 1033);
		graph.addBufferNeighbor("path_152", 53);
		graph.addBufferNeighbor("path_221", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("south_1", null, "campus_sw");
		graph.setBufferXYAttributes(911, 2217);
		graph.addBufferNeighbor("path_295", 311);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("south_2", null, "campus_sw");
		graph.setBufferXYAttributes(965, 2216);
		graph.addBufferNeighbor("path_296", 311);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_253", null, "campus_sw");
		graph.setBufferXYAttributes(851, 1367);
		graph.addBufferNeighbor("path_245", 69);
		graph.addBufferNeighbor("path_249", 93);
		graph.addBufferNeighbor("path_254", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("arbor", null, "campus_nw");
		graph.setBufferXYAttributes(1067, 842);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_32", null, "campus_nw");
		graph.setBufferXYAttributes(272, 1142);
		graph.addBufferNeighbor("path_19", 33);
		graph.addBufferNeighbor("path_20", 16);
		graph.addBufferNeighbor("path_21", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("bouj_lake", null, "campus_se");
		graph.setBufferXYAttributes(1680, 1628);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("student_union", null, "campus_nw");
		graph.setBufferXYAttributes(988, 1102);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commons_2", null, "campus_nw");
		graph.setBufferXYAttributes(1136, 1112);
		graph.addBufferNeighbor("path_136", 29);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commons_1", null, "campus_nw");
		graph.setBufferXYAttributes(1080, 1070);
		graph.addBufferNeighbor("path_121", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_252", null, "campus_sw");
		graph.setBufferXYAttributes(931, 1438);
		graph.addBufferNeighbor("path_250", 11);
		graph.addBufferNeighbor("darwin_1", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_354", null, "campus_sw");
		graph.setBufferXYAttributes(1166, 1455);
		graph.addBufferNeighbor("path_352", 50);
		graph.addBufferNeighbor("path_353", 32);
		graph.addBufferNeighbor("path_355", 30);
		graph.addBufferNeighbor("salazar_3", 110);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_355", null, "campus_sw");
		graph.setBufferXYAttributes(1162, 1425);
		graph.addBufferNeighbor("path_354", 30);
		graph.addBufferNeighbor("path_356", 53);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_356", null, "campus_sw");
		graph.setBufferXYAttributes(1181, 1375);
		graph.addBufferNeighbor("path_192", 25);
		graph.addBufferNeighbor("path_355", 53);
		graph.addBufferNeighbor("path_357", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_357", null, "campus_sw");
		graph.setBufferXYAttributes(1174, 1353);
		graph.addBufferNeighbor("path_356", 23);
		graph.addBufferNeighbor("path_358", 34);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_350", null, "campus_sw");
		graph.setBufferXYAttributes(1175, 1531);
		graph.addBufferNeighbor("path_352", 27);
		graph.addBufferNeighbor("ives_3", 12);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_352", null, "campus_sw");
		graph.setBufferXYAttributes(1167, 1505);
		graph.addBufferNeighbor("path_335", 45);
		graph.addBufferNeighbor("path_350", 27);
		graph.addBufferNeighbor("path_353", 22);
		graph.addBufferNeighbor("path_354", 50);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_353", null, "campus_sw");
		graph.setBufferXYAttributes(1178, 1485);
		graph.addBufferNeighbor("path_352", 22);
		graph.addBufferNeighbor("path_354", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_358", null, "campus_sw");
		graph.setBufferXYAttributes(1172, 1319);
		graph.addBufferNeighbor("path_357", 34);
		graph.addBufferNeighbor("path_359", 48);
		graph.addBufferNeighbor("path_361", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_359", null, "campus_sw");
		graph.setBufferXYAttributes(1169, 1271);
		graph.addBufferNeighbor("path_358", 48);
		graph.addBufferNeighbor("path_360", 26);
		graph.addBufferNeighbor("path_361", 51);
		graph.addBufferNeighbor("path_362", 100);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_201", null, "campus_se");
		graph.setBufferXYAttributes(1595, 1631);
		graph.addBufferNeighbor("path_200", 38);
		graph.addBufferNeighbor("bouj_1", 175);
		graph.pushNode();


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
		graph.setBufferTextAttributes("path_239", null, "campus_sw");
		graph.setBufferXYAttributes(689, 1353);
		graph.addBufferNeighbor("path_236", 24);
		graph.addBufferNeighbor("path_240", 26);
		graph.addBufferNeighbor("path_258", 61);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_238", null, "campus_sw");
		graph.setBufferXYAttributes(645, 1360);
		graph.addBufferNeighbor("path_237", 27);
		graph.addBufferNeighbor("library_2", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_237", null, "campus_sw");
		graph.setBufferXYAttributes(643, 1333);
		graph.addBufferNeighbor("path_236", 36);
		graph.addBufferNeighbor("path_238", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_236", null, "campus_sw");
		graph.setBufferXYAttributes(679, 1331);
		graph.addBufferNeighbor("path_235", 16);
		graph.addBufferNeighbor("path_237", 36);
		graph.addBufferNeighbor("path_239", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("tuscany_1", null, "campus_se");
		graph.setBufferXYAttributes(1431, 1941);
		graph.addBufferNeighbor("path_202", 134);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_234", null, "campus_sw");
		graph.setBufferXYAttributes(633, 1279);
		graph.addBufferNeighbor("path_218", 58);
		graph.addBufferNeighbor("path_233", 36);
		graph.addBufferNeighbor("path_235", 61);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_233", null, "campus_sw");
		graph.setBufferXYAttributes(659, 1254);
		graph.addBufferNeighbor("path_230", 37);
		graph.addBufferNeighbor("path_234", 36);
		graph.addBufferNeighbor("path_242", 48);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_232", null, "campus_sw");
		graph.setBufferXYAttributes(632, 1201);
		graph.addBufferNeighbor("path_72", 62);
		graph.addBufferNeighbor("path_231", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_231", null, "campus_sw");
		graph.setBufferXYAttributes(628, 1209);
		graph.addBufferNeighbor("path_220", 25);
		graph.addBufferNeighbor("path_230", 20);
		graph.addBufferNeighbor("path_232", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_230", null, "campus_sw");
		graph.setBufferXYAttributes(646, 1219);
		graph.addBufferNeighbor("path_231", 20);
		graph.addBufferNeighbor("path_233", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("building_49", null, "campus_ne");
		graph.setBufferXYAttributes(2100, 1096);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cooperage", null, "campus_sw");
		graph.setBufferXYAttributes(270, 1887);
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
		graph.setBufferTextAttributes("cab_2", null, "campus_nw");
		graph.setBufferXYAttributes(242, 936);
		graph.addBufferNeighbor("path_8", 25);
		graph.addBufferNeighbor("path_1", 38);
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
		graph.setBufferTextAttributes("path_282", null, "campus_sw");
		graph.setBufferXYAttributes(631, 2142);
		graph.addBufferNeighbor("path_281", 157);
		graph.addBufferNeighbor("path_283", 113);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_283", null, "campus_sw");
		graph.setBufferXYAttributes(631, 2029);
		graph.addBufferNeighbor("path_282", 113);
		graph.addBufferNeighbor("path_283", 0);
		graph.addBufferNeighbor("sauv_3", 46);
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
		graph.addBufferNeighbor("path_364", 259);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_286", null, "campus_sw");
		graph.setBufferXYAttributes(695, 1871);
		graph.addBufferNeighbor("path_284", 64);
		graph.addBufferNeighbor("path_287", 20);
		graph.addBufferNeighbor("path_289", 28);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_287", null, "campus_sw");
		graph.setBufferXYAttributes(694, 1851);
		graph.addBufferNeighbor("path_286", 20);
		graph.addBufferNeighbor("path_288", 26);
		graph.addBufferNeighbor("path_290", 68);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_284", null, "campus_sw");
		graph.setBufferXYAttributes(631, 1870);
		graph.addBufferNeighbor("path_283", 159);
		graph.addBufferNeighbor("path_285", 112);
		graph.addBufferNeighbor("path_286", 64);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_285", null, "campus_sw");
		graph.setBufferXYAttributes(519, 1870);
		graph.addBufferNeighbor("path_275", 144);
		graph.addBufferNeighbor("path_284", 112);
		graph.addBufferNeighbor("sauv_4", 50);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cb_2", null, "campus_sw");
		graph.setBufferXYAttributes(521, 1417);
		graph.addBufferNeighbor("path_260", 6);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cb_1", null, "campus_sw");
		graph.setBufferXYAttributes(559, 1405);
		graph.addBufferNeighbor("path_258", 83);
		graph.addBufferNeighbor("path_259", 22);
		graph.addBufferNeighbor("library_1", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_198", null, "campus_se");
		graph.setBufferXYAttributes(1675, 1597);
		graph.addBufferNeighbor("path_197", 27);
		graph.addBufferNeighbor("path_199", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_199", null, "campus_se");
		graph.setBufferXYAttributes(1655, 1613);
		graph.addBufferNeighbor("path_198", 25);
		graph.addBufferNeighbor("path_200", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_196", null, "campus_se");
		graph.setBufferXYAttributes(1705, 1553);
		graph.addBufferNeighbor("path_195", 33);
		graph.addBufferNeighbor("path_197", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_197", null, "campus_se");
		graph.setBufferXYAttributes(1692, 1576);
		graph.addBufferNeighbor("path_196", 26);
		graph.addBufferNeighbor("path_198", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_194", null, "campus_se");
		graph.setBufferXYAttributes(1208, 1250);
		graph.addBufferNeighbor("path_193", 99);
		graph.addBufferNeighbor("path_360", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_195", null, "campus_se");
		graph.setBufferXYAttributes(1710, 1520);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_192", null, "campus_se");
		graph.setBufferXYAttributes(1206, 1376);
		graph.addBufferNeighbor("path_191", 55);
		graph.addBufferNeighbor("path_356", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_193", null, "campus_se");
		graph.setBufferXYAttributes(1307, 1252);
		graph.addBufferNeighbor("path_174", 71);
		graph.addBufferNeighbor("path_190", 108);
		graph.addBufferNeighbor("path_194", 99);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_190", null, "campus_se");
		graph.setBufferXYAttributes(1307, 1360);
		graph.addBufferNeighbor("path_189", 29);
		graph.addBufferNeighbor("path_191", 48);
		graph.addBufferNeighbor("path_193", 108);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_191", null, "campus_se");
		graph.setBufferXYAttributes(1261, 1376);
		graph.addBufferNeighbor("path_190", 48);
		graph.addBufferNeighbor("path_192", 55);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("darwin_1", null, "campus_sw");
		graph.setBufferXYAttributes(932, 1408);
		graph.addBufferNeighbor("path_252", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("darwin_2", null, "campus_sw");
		graph.setBufferXYAttributes(825, 1376);
		graph.addBufferNeighbor("path_254", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("darwin_3", null, "campus_sw");
		graph.setBufferXYAttributes(723, 1403);
		graph.addBufferNeighbor("path_257", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_pool_1", null, "campus_nw");
		graph.setBufferXYAttributes(359, 1120);
		graph.addBufferNeighbor("path_30", 40);
		graph.addBufferNeighbor("path_29", 12);
		graph.addBufferNeighbor("path_25", 34);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("butterfly_garden", null, "campus_ne");
		graph.setBufferXYAttributes(1501, 1063);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_307", null, "campus_sw");
		graph.setBufferXYAttributes(868, 1836);
		graph.addBufferNeighbor("path_306", 56);
		graph.addBufferNeighbor("path_308", 27);
		graph.addBufferNeighbor("path_311", 116);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_309", null, "campus_sw");
		graph.setBufferXYAttributes(908, 1861);
		graph.addBufferNeighbor("path_294", 33);
		graph.addBufferNeighbor("path_308", 40);
		graph.addBufferNeighbor("path_310", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_308", null, "campus_sw");
		graph.setBufferXYAttributes(868, 1863);
		graph.addBufferNeighbor("path_290", 107);
		graph.addBufferNeighbor("path_307", 27);
		graph.addBufferNeighbor("path_309", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_303", null, "campus_sw");
		graph.setBufferXYAttributes(944, 1747);
		graph.addBufferNeighbor("path_302", 33);
		graph.addBufferNeighbor("path_304", 46);
		graph.addBufferNeighbor("path_329", 168);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_302", null, "campus_sw");
		graph.setBufferXYAttributes(977, 1749);
		graph.addBufferNeighbor("path_301", 72);
		graph.addBufferNeighbor("path_303", 33);
		graph.addBufferNeighbor("path_321", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_301", null, "campus_sw");
		graph.setBufferXYAttributes(981, 1821);
		graph.addBufferNeighbor("path_300", 112);
		graph.addBufferNeighbor("path_302", 72);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_300", null, "campus_sw");
		graph.setBufferXYAttributes(970, 1933);
		graph.addBufferNeighbor("path_299", 73);
		graph.addBufferNeighbor("path_301", 112);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zinfandel", null, "campus_nw");
		graph.setBufferXYAttributes(245, 1097);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_306", null, "campus_sw");
		graph.setBufferXYAttributes(868, 1780);
		graph.addBufferNeighbor("path_305", 30);
		graph.addBufferNeighbor("path_307", 56);
		graph.addBufferNeighbor("path_312", 117);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_305", null, "campus_sw");
		graph.setBufferXYAttributes(898, 1778);
		graph.addBufferNeighbor("path_304", 31);
		graph.addBufferNeighbor("path_306", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_304", null, "campus_sw");
		graph.setBufferXYAttributes(898, 1747);
		graph.addBufferNeighbor("path_303", 46);
		graph.addBufferNeighbor("path_305", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_169", null, "campus_ne");
		graph.setBufferXYAttributes(1691, 1063);
		graph.addBufferNeighbor("path_168", 15);
		graph.addBufferNeighbor("path_170", 244);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_168", null, "campus_ne");
		graph.setBufferXYAttributes(1691, 1078);
		graph.addBufferNeighbor("path_167", 33);
		graph.addBufferNeighbor("path_169", 15);
		graph.addBufferNeighbor("path_176", 62);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_167", null, "campus_ne");
		graph.setBufferXYAttributes(1724, 1077);
		graph.addBufferNeighbor("path_166", 143);
		graph.addBufferNeighbor("path_168", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_166", null, "campus_ne");
		graph.setBufferXYAttributes(1724, 934);
		graph.addBufferNeighbor("path_165", 15);
		graph.addBufferNeighbor("path_167", 143);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_165", null, "campus_ne");
		graph.setBufferXYAttributes(1739, 932);
		graph.addBufferNeighbor("path_164", 88);
		graph.addBufferNeighbor("path_166", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_164", null, "campus_ne");
		graph.setBufferXYAttributes(1739, 844);
		graph.addBufferNeighbor("path_163", 95);
		graph.addBufferNeighbor("path_165", 88);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_163", null, "campus_ne");
		graph.setBufferXYAttributes(1731, 749);
		graph.addBufferNeighbor("path_162", 87);
		graph.addBufferNeighbor("path_164", 95);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_162", null, "campus_ne");
		graph.setBufferXYAttributes(1729, 662);
		graph.addBufferNeighbor("path_161", 60);
		graph.addBufferNeighbor("path_163", 87);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_161", null, "campus_ne");
		graph.setBufferXYAttributes(1669, 661);
		graph.addBufferNeighbor("path_160", 12);
		graph.addBufferNeighbor("path_162", 60);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_160", null, "campus_ne");
		graph.setBufferXYAttributes(1669, 649);
		graph.addBufferNeighbor("path_159", 63);
		graph.addBufferNeighbor("path_161", 12);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_246", null, "campus_sw");
		graph.setBufferXYAttributes(943, 1297);
		graph.addBufferNeighbor("path_245", 93);
		graph.addBufferNeighbor("path_247", 14);
		graph.addBufferNeighbor("path_364", 153);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_247", null, "campus_sw");
		graph.setBufferXYAttributes(943, 1311);
		graph.addBufferNeighbor("path_246", 14);
		graph.addBufferNeighbor("path_248", 28);
		graph.addBufferNeighbor("path_249", 54);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_244", null, "campus_sw");
		graph.setBufferXYAttributes(825, 1299);
		graph.addBufferNeighbor("path_243", 28);
		graph.addBufferNeighbor("path_245", 25);
		graph.addBufferNeighbor("stevenson_2", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_245", null, "campus_sw");
		graph.setBufferXYAttributes(850, 1298);
		graph.addBufferNeighbor("path_244", 25);
		graph.addBufferNeighbor("path_246", 93);
		graph.addBufferNeighbor("path_253", 69);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_242", null, "campus_sw");
		graph.setBufferXYAttributes(707, 1245);
		graph.addBufferNeighbor("path_73", 66);
		graph.addBufferNeighbor("path_76", 67);
		graph.addBufferNeighbor("path_233", 48);
		graph.addBufferNeighbor("path_241", 54);
		graph.addBufferNeighbor("stevenson_4", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_243", null, "campus_sw");
		graph.setBufferXYAttributes(797, 1298);
		graph.addBufferNeighbor("path_241", 90);
		graph.addBufferNeighbor("path_244", 28);
		graph.addBufferNeighbor("path_255", 69);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_240", null, "campus_sw");
		graph.setBufferXYAttributes(711, 1367);
		graph.addBufferNeighbor("path_239", 26);
		graph.addBufferNeighbor("path_255", 87);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_241", null, "campus_sw");
		graph.setBufferXYAttributes(707, 1299);
		graph.addBufferNeighbor("path_235", 28);
		graph.addBufferNeighbor("path_242", 54);
		graph.addBufferNeighbor("path_243", 90);
		graph.addBufferNeighbor("path_257", 103);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_248", null, "campus_sw");
		graph.setBufferXYAttributes(971, 1313);
		graph.addBufferNeighbor("path_247", 28);
		graph.addBufferNeighbor("path_249", 58);
		graph.addBufferNeighbor("path_376", 54);
		graph.addBufferNeighbor("salazar_1", 66);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_249", null, "campus_sw");
		graph.setBufferXYAttributes(944, 1365);
		graph.addBufferNeighbor("path_247", 54);
		graph.addBufferNeighbor("path_248", 58);
		graph.addBufferNeighbor("path_250", 73);
		graph.addBufferNeighbor("path_253", 93);
		graph.addBufferNeighbor("salazar_1", 32);
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
		graph.setBufferTextAttributes("parking_info", null, "campus_ne");
		graph.setBufferXYAttributes(1690, 366);
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
		graph.setBufferTextAttributes("person", null, "campus_sw");
		graph.setBufferXYAttributes(1064, 1709);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commencement_lake", null, "campus_nw");
		graph.setBufferXYAttributes(1187, 952);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pe_1", null, "campus_ne");
		graph.setBufferXYAttributes(1314, 1182);
		graph.addBufferNeighbor("path_174", 28);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("track", null, "campus_se");
		graph.setBufferXYAttributes(2127, 1971);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("salazar_1", null, "campus_sw");
		graph.setBufferXYAttributes(973, 1379);
		graph.addBufferNeighbor("path_248", 66);
		graph.addBufferNeighbor("path_249", 32);
		graph.addBufferNeighbor("path_250", 66);
		graph.addBufferNeighbor("path_251", 75);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("salazar_2", null, "campus_sw");
		graph.setBufferXYAttributes(1056, 1311);
		graph.addBufferNeighbor("path_376", 31);
		graph.addBufferNeighbor("path_361", 84);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("salazar_3", null, "campus_sw");
		graph.setBufferXYAttributes(1056, 1455);
		graph.addBufferNeighbor("path_331", 38);
		graph.addBufferNeighbor("path_354", 110);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_299", null, "campus_sw");
		graph.setBufferXYAttributes(970, 1860);
		graph.addBufferNeighbor("path_297", 33);
		graph.addBufferNeighbor("path_300", 73);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_298", null, "campus_sw");
		graph.setBufferXYAttributes(982, 1889);
		graph.addBufferNeighbor("path_297", 10);
		graph.addBufferNeighbor("path_313", 315);
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
		graph.setBufferTextAttributes("arbor_1", null, "campus_nw");
		graph.setBufferXYAttributes(1102, 860);
		graph.addBufferNeighbor("path_150", 164);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_294", null, "campus_sw");
		graph.setBufferXYAttributes(905, 1894);
		graph.addBufferNeighbor("path_293", 13);
		graph.addBufferNeighbor("path_295", 13);
		graph.addBufferNeighbor("path_297", 67);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_297", null, "campus_sw");
		graph.setBufferXYAttributes(972, 1893);
		graph.addBufferNeighbor("path_294", 67);
		graph.addBufferNeighbor("path_296", 13);
		graph.addBufferNeighbor("path_298", 10);
		graph.addBufferNeighbor("path_299", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_296", null, "campus_sw");
		graph.setBufferXYAttributes(967, 1905);
		graph.addBufferNeighbor("path_297", 13);
		graph.addBufferNeighbor("south_2", 311);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("tuscany_mail", null, "campus_se");
		graph.setBufferXYAttributes(1675, 2153);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_291", null, "campus_sw");
		graph.setBufferXYAttributes(776, 1892);
		graph.addBufferNeighbor("path_289", 62);
		graph.addBufferNeighbor("path_292", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_290", null, "campus_sw");
		graph.setBufferXYAttributes(761, 1863);
		graph.addBufferNeighbor("path_287", 68);
		graph.addBufferNeighbor("path_308", 107);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_293", null, "campus_sw");
		graph.setBufferXYAttributes(894, 1887);
		graph.addBufferNeighbor("path_292", 94);
		graph.addBufferNeighbor("path_294", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("person_1", null, "campus_sw");
		graph.setBufferXYAttributes(1028, 1730);
		graph.addBufferNeighbor("path_319", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_1", null, "campus_nw");
		graph.setBufferXYAttributes(280, 929);
		graph.addBufferNeighbor("path_2", 39);
		graph.addBufferNeighbor("cab_2", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_347", null, "campus_sw");
		graph.setBufferXYAttributes(1199, 1671);
		graph.addBufferNeighbor("path_210", 5);
		graph.addBufferNeighbor("path_346", 63);
		graph.addBufferNeighbor("path_349", 40);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_346", null, "campus_sw");
		graph.setBufferXYAttributes(1171, 1728);
		graph.addBufferNeighbor("path_345", 36);
		graph.addBufferNeighbor("path_347", 63);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_345", null, "campus_sw");
		graph.setBufferXYAttributes(1152, 1697);
		graph.addBufferNeighbor("path_344", 24);
		graph.addBufferNeighbor("path_346", 36);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_344", null, "campus_sw");
		graph.setBufferXYAttributes(1133, 1681);
		graph.addBufferNeighbor("path_316", 88);
		graph.addBufferNeighbor("path_343", 8);
		graph.addBufferNeighbor("path_345", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_343", null, "campus_sw");
		graph.setBufferXYAttributes(1125, 1677);
		graph.addBufferNeighbor("path_342", 35);
		graph.addBufferNeighbor("path_344", 8);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_342", null, "campus_sw");
		graph.setBufferXYAttributes(1109, 1645);
		graph.addBufferNeighbor("path_326", 61);
		graph.addBufferNeighbor("path_340", 57);
		graph.addBufferNeighbor("path_341", 77);
		graph.addBufferNeighbor("path_343", 35);
		graph.addBufferNeighbor("path_348", 67);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_341", null, "campus_sw");
		graph.setBufferXYAttributes(1053, 1591);
		graph.addBufferNeighbor("path_328", 27);
		graph.addBufferNeighbor("path_339", 1210);
		graph.addBufferNeighbor("path_342", 77);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_340", null, "campus_sw");
		graph.setBufferXYAttributes(1112, 1588);
		graph.addBufferNeighbor("path_339", 1207);
		graph.addBufferNeighbor("path_342", 57);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_349", null, "campus_sw");
		graph.setBufferXYAttributes(1193, 1631);
		graph.addBufferNeighbor("path_347", 40);
		graph.addBufferNeighbor("path_348", 18);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_348", null, "campus_sw");
		graph.setBufferXYAttributes(1175, 1630);
		graph.addBufferNeighbor("path_342", 67);
		graph.addBufferNeighbor("path_349", 18);
		graph.addBufferNeighbor("ives_1", 17);
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
		graph.setBufferTextAttributes("path_202", null, "campus_se");
		graph.setBufferXYAttributes(1431, 1807);
		graph.addBufferNeighbor("bouj_1", 164);
		graph.addBufferNeighbor("tuscany_1", 134);
		graph.addBufferNeighbor("path_202", 0);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_203", null, "campus_se");
		graph.setBufferXYAttributes(1421, 1780);
		graph.addBufferNeighbor("path_202", 28);
		graph.addBufferNeighbor("path_204", 32);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_200", null, "campus_se");
		graph.setBufferXYAttributes(1632, 1621);
		graph.addBufferNeighbor("path_199", 24);
		graph.addBufferNeighbor("path_201", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("observatory", null, "campus_se");
		graph.setBufferXYAttributes(2184, 2152);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_206", null, "campus_se");
		graph.setBufferXYAttributes(1357, 1734);
		graph.addBufferNeighbor("path_205", 21);
		graph.addBufferNeighbor("path_207", 104);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_207", null, "campus_se");
		graph.setBufferXYAttributes(1253, 1730);
		graph.addBufferNeighbor("path_206", 104);
		graph.addBufferNeighbor("path_208", 18);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_204", null, "campus_se");
		graph.setBufferXYAttributes(1398, 1757);
		graph.addBufferNeighbor("path_203", 32);
		graph.addBufferNeighbor("path_205", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_205", null, "campus_se");
		graph.setBufferXYAttributes(1377, 1742);
		graph.addBufferNeighbor("path_204", 25);
		graph.addBufferNeighbor("path_206", 21);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_208", null, "campus_se");
		graph.setBufferXYAttributes(1249, 1712);
		graph.addBufferNeighbor("path_207", 18);
		graph.addBufferNeighbor("path_209", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_209", null, "campus_se");
		graph.setBufferXYAttributes(1226, 1691);
		graph.addBufferNeighbor("path_208", 31);
		graph.addBufferNeighbor("path_210", 29);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("baseball_diamond", null, "campus_se");
		graph.setBufferXYAttributes(2160, 1383);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("chalkhill", null, "campus_nw");
		graph.setBufferXYAttributes(383, 907);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("sauv_2", null, "campus_sw");
		graph.setBufferXYAttributes(474, 2095);
		graph.addBufferNeighbor("path_281", 46);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("sauv_3", null, "campus_sw");
		graph.setBufferXYAttributes(585, 2029);
		graph.addBufferNeighbor("path_283", 46);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("sauv_1", null, "campus_sw");
		graph.setBufferXYAttributes(411, 1985);
		graph.addBufferNeighbor("path_279", 50);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("art", null, "campus_nw");
		graph.setBufferXYAttributes(846, 909);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("sauv_4", null, "campus_sw");
		graph.setBufferXYAttributes(519, 1920);
		graph.addBufferNeighbor("path_285", 50);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("sauv_5", null, "campus_sw");
		graph.setBufferXYAttributes(250, 1752);
		graph.addBufferNeighbor("path_266", 129);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("tuscany_fountain", null, "campus_se");
		graph.setBufferXYAttributes(1675, 1870);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_235", null, "campus_sw");
		graph.setBufferXYAttributes(683, 1315);
		graph.addBufferNeighbor("path_234", 61);
		graph.addBufferNeighbor("path_236", 16);
		graph.addBufferNeighbor("path_241", 28);
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
		graph.setBufferTextAttributes("path_119", null, "campus_nw");
		graph.setBufferXYAttributes(1034, 1033);
		graph.addBufferNeighbor("path_118", 15);
		graph.addBufferNeighbor("path_120", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("athletic_fields", null, "campus_se");
		graph.setBufferXYAttributes(1894, 1612);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("field_house_1", null, "campus_se");
		graph.setBufferXYAttributes(1368, 1323);
		graph.addBufferNeighbor("path_186", 343);
		graph.addBufferNeighbor("path_187", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("gmc_1", null, "campus_ne");
		graph.setBufferXYAttributes(1786, 503);
		graph.addBufferNeighbor("path_157", 80);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_181", null, "campus_ne");
		graph.setBufferXYAttributes(1710, 1197);
		graph.addBufferNeighbor("path_177", 58);
		graph.addBufferNeighbor("courts_1", 56);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_180", null, "campus_ne");
		graph.setBufferXYAttributes(1690, 1197);
		graph.addBufferNeighbor("path_176", 57);
		graph.addBufferNeighbor("path_182", 52);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_182", null, "campus_se");
		graph.setBufferXYAttributes(1690, 1249);
		graph.addBufferNeighbor("courts_1", 21);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_185", null, "campus_se");
		graph.setBufferXYAttributes(1689, 1350);
		graph.addBufferNeighbor("path_182", 101);
		graph.addBufferNeighbor("path_185", 0);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_187", null, "campus_se");
		graph.setBufferXYAttributes(1346, 1334);
		graph.addBufferNeighbor("field_house_1", 24);
		graph.addBufferNeighbor("path_189", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_186", null, "campus_se");
		graph.setBufferXYAttributes(1710, 1350);
		graph.addBufferNeighbor("courts_1", 97);
		graph.addBufferNeighbor("path_195", 170);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_189", null, "campus_se");
		graph.setBufferXYAttributes(1335, 1351);
		graph.addBufferNeighbor("path_187", 20);
		graph.addBufferNeighbor("path_190", 29);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pool_1", null, "campus_ne");
		graph.setBufferXYAttributes(1497, 1091);
		graph.addBufferNeighbor("path_170", 182);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_295", null, "campus_sw");
		graph.setBufferXYAttributes(911, 1906);
		graph.addBufferNeighbor("path_294", 13);
		graph.addBufferNeighbor("south_1", 311);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_info_1", null, "campus_ne");
		graph.setBufferXYAttributes(1677, 366);
		graph.addBufferNeighbor("path_155", 122);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("field_house", null, "campus_se");
		graph.setBufferXYAttributes(1370, 1286);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pe", null, "campus_ne");
		graph.setBufferXYAttributes(1369, 1177);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_338", null, "campus_sw");
		graph.setBufferXYAttributes(1086, 1511);
		graph.addBufferNeighbor("path_333", 17);
		graph.addBufferNeighbor("path_337", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_339", null, "campus_sw");
		graph.setBufferXYAttributes(1100, 1581);
		graph.addBufferNeighbor("path_337", 1138);
		graph.addBufferNeighbor("path_340", 1207);
		graph.addBufferNeighbor("path_341", 1210);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_336", null, "campus_sw");
		graph.setBufferXYAttributes(1110, 1516);
		graph.addBufferNeighbor("path_337", 12);
		graph.addBufferNeighbor("path_335", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_337", null, "campus_sw");
		graph.setBufferXYAttributes(1098, 1519);
		graph.addBufferNeighbor("path_336", 12);
		graph.addBufferNeighbor("path_338", 14);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_334", null, "campus_sw");
		graph.setBufferXYAttributes(1103, 1493);
		graph.addBufferNeighbor("path_333", 24);
		graph.addBufferNeighbor("path_335", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_335", null, "campus_sw");
		graph.setBufferXYAttributes(1122, 1506);
		graph.addBufferNeighbor("path_334", 23);
		graph.addBufferNeighbor("path_336", 15);
		graph.addBufferNeighbor("path_352", 45);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_332", null, "campus_sw");
		graph.setBufferXYAttributes(1022, 1465);
		graph.addBufferNeighbor("path_331", 9);
		graph.addBufferNeighbor("path_333", 64);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_333", null, "campus_sw");
		graph.setBufferXYAttributes(1079, 1495);
		graph.addBufferNeighbor("path_332", 64);
		graph.addBufferNeighbor("path_334", 24);
		graph.addBufferNeighbor("path_338", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_330", null, "campus_sw");
		graph.setBufferXYAttributes(943, 1489);
		graph.addBufferNeighbor("path_250", 51);
		graph.addBufferNeighbor("path_328", 123);
		graph.addBufferNeighbor("path_329", 90);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_331", null, "campus_sw");
		graph.setBufferXYAttributes(1018, 1456);
		graph.addBufferNeighbor("path_251", 46);
		graph.addBufferNeighbor("path_332", 9);
		graph.addBufferNeighbor("salazar_3", 38);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("coop_1", null, "campus_sw");
		graph.setBufferXYAttributes(297, 1891);
		graph.addBufferNeighbor("path_278", 39);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("ameci", null, "campus_sw");
		graph.setBufferXYAttributes(322, 1872);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_259", null, "campus_sw");
		graph.setBufferXYAttributes(573, 1423);
		graph.addBufferNeighbor("path_258", 75);
		graph.addBufferNeighbor("path_260", 52);
		graph.addBufferNeighbor("library_1", 27);
		graph.addBufferNeighbor("cb_1", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_258", null, "campus_sw");
		graph.setBufferXYAttributes(641, 1391);
		graph.addBufferNeighbor("path_239", 61);
		graph.addBufferNeighbor("path_256", 28);
		graph.addBufferNeighbor("path_259", 75);
		graph.addBufferNeighbor("library_1", 64);
		graph.addBufferNeighbor("cb_1", 83);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_150", null, "campus_nw");
		graph.setBufferXYAttributes(1170, 1010);
		graph.addBufferNeighbor("path_149", 110);
		graph.addBufferNeighbor("arbor_1", 164);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_156", null, "campus_ne");
		graph.setBufferXYAttributes(1677, 505);
		graph.addBufferNeighbor("path_155", 17);
		graph.addBufferNeighbor("path_157", 29);
		graph.addBufferNeighbor("path_158", 15);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_157", null, "campus_ne");
		graph.setBufferXYAttributes(1706, 505);
		graph.addBufferNeighbor("path_156", 29);
		graph.addBufferNeighbor("gmc_1", 80);
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
		graph.setBufferTextAttributes("path_155", null, "campus_ne");
		graph.setBufferXYAttributes(1677, 488);
		graph.addBufferNeighbor("parking_info_1", 122);
		graph.addBufferNeighbor("path_156", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_251", null, "campus_sw");
		graph.setBufferXYAttributes(972, 1454);
		graph.addBufferNeighbor("path_250", 34);
		graph.addBufferNeighbor("path_331", 46);
		graph.addBufferNeighbor("salazar_1", 75);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_250", null, "campus_sw");
		graph.setBufferXYAttributes(942, 1438);
		graph.addBufferNeighbor("path_249", 73);
		graph.addBufferNeighbor("path_251", 34);
		graph.addBufferNeighbor("path_252", 11);
		graph.addBufferNeighbor("salazar_1", 66);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_158", null, "campus_ne");
		graph.setBufferXYAttributes(1668, 518);
		graph.addBufferNeighbor("path_156", 15);
		graph.addBufferNeighbor("path_159", 68);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_159", null, "campus_ne");
		graph.setBufferXYAttributes(1670, 586);
		graph.addBufferNeighbor("path_158", 68);
		graph.addBufferNeighbor("path_160", 63);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_255", null, "campus_sw");
		graph.setBufferXYAttributes(798, 1367);
		graph.addBufferNeighbor("path_240", 87);
		graph.addBufferNeighbor("path_243", 69);
		graph.addBufferNeighbor("path_254", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_254", null, "campus_sw");
		graph.setBufferXYAttributes(825, 1367);
		graph.addBufferNeighbor("path_253", 26);
		graph.addBufferNeighbor("path_255", 27);
		graph.addBufferNeighbor("darwin_2", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_257", null, "campus_sw");
		graph.setBufferXYAttributes(707, 1402);
		graph.addBufferNeighbor("path_240", 35);
		graph.addBufferNeighbor("path_256", 40);
		graph.addBufferNeighbor("path_367", 81);
		graph.addBufferNeighbor("darwin_3", 16);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_256", null, "campus_sw");
		graph.setBufferXYAttributes(667, 1402);
		graph.addBufferNeighbor("path_257", 40);
		graph.addBufferNeighbor("path_258", 28);
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
		graph.setBufferTextAttributes("art_lake", null, "campus_nw");
		graph.setBufferXYAttributes(943, 915);
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
		graph.setBufferTextAttributes("path_325", null, "campus_sw");
		graph.setBufferXYAttributes(1035, 1667);
		graph.addBufferNeighbor("path_324", 22);
		graph.addBufferNeighbor("path_326", 20);
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
		graph.setBufferTextAttributes("path_292", null, "campus_sw");
		graph.setBufferXYAttributes(800, 1886);
		graph.addBufferNeighbor("path_291", 24);
		graph.addBufferNeighbor("path_293", 94);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("mccabe", null, "campus_sw");
		graph.setBufferXYAttributes(531, 1445);
		graph.addBufferNeighbor("path_260", 24);
		graph.addBufferNeighbor("path_369", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_south", null, "campus_sw");
		graph.setBufferXYAttributes(947, 1800);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_373", null, "campus_sw");
		graph.setBufferXYAttributes(421, 1573);
		graph.addBufferNeighbor("path_372", 1222);
		graph.addBufferNeighbor("path_374", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("boiler_plant", null, "campus_sw");
		graph.setBufferXYAttributes(834, 1743);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_288", null, "campus_sw");
		graph.setBufferXYAttributes(668, 1844);
		graph.addBufferNeighbor("path_270", 235);
		graph.addBufferNeighbor("path_287", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_289", null, "campus_sw");
		graph.setBufferXYAttributes(714, 1892);
		graph.addBufferNeighbor("path_286", 28);
		graph.addBufferNeighbor("path_291", 62);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_372", null, "campus_sw");
		graph.setBufferXYAttributes(460, 1551);
		graph.addBufferNeighbor("path_373", 1222);
		graph.addBufferNeighbor("path_371", 1176);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_127", null, "campus_nw");
		graph.setBufferXYAttributes(924, 1153);
		graph.addBufferNeighbor("path_154", 98);
		graph.addBufferNeighbor("path_126", 21);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_370", null, "campus_sw");
		graph.setBufferXYAttributes(507, 1492);
		graph.addBufferNeighbor("path_371", 42);
		graph.addBufferNeighbor("path_369", 42);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_371", null, "campus_sw");
		graph.setBufferXYAttributes(483, 1527);
		graph.addBufferNeighbor("path_370", 42);
		graph.addBufferNeighbor("path_372", 1176);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_376", null, "campus_sw");
		graph.setBufferXYAttributes(1025, 1312);
		graph.addBufferNeighbor("path_248", 54);
		graph.addBufferNeighbor("path_375", 21);
		graph.addBufferNeighbor("salazar_2", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_374", null, "campus_sw");
		graph.setBufferXYAttributes(397, 1578);
		graph.addBufferNeighbor("path_262", 155);
		graph.addBufferNeighbor("path_265", 146);
		graph.addBufferNeighbor("path_373", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_375", null, "campus_sw");
		graph.setBufferXYAttributes(1031, 1291);
		graph.addBufferNeighbor("path_362", 80);
		graph.addBufferNeighbor("path_376", 21);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("campus_prints", null, "campus_nw");
		graph.setBufferXYAttributes(1008, 1082);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cab_1", null, "campus_nw");
		graph.setBufferXYAttributes(298, 871);
		graph.addBufferNeighbor("path_4", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_280", null, "campus_sw");
		graph.setBufferXYAttributes(360, 2141);
		graph.addBufferNeighbor("path_279", 156);
		graph.addBufferNeighbor("path_281", 114);
		graph.addBufferNeighbor("south_entrance", 98);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("childrens_school_1", null, "campus_nw");
		graph.setBufferXYAttributes(456, 1018);
		graph.addBufferNeighbor("path_44", 74);
		graph.addBufferNeighbor("path_46", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_281", null, "campus_sw");
		graph.setBufferXYAttributes(474, 2141);
		graph.addBufferNeighbor("path_280", 114);
		graph.addBufferNeighbor("path_282", 157);
		graph.addBufferNeighbor("sauv_2", 46);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_215", null, "campus_sw");
		graph.setBufferXYAttributes(447, 1287);
		graph.addBufferNeighbor("path_214", 33);
		graph.addBufferNeighbor("path_216", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_214", null, "campus_sw");
		graph.setBufferXYAttributes(415, 1277);
		graph.addBufferNeighbor("path_212", 35);
		graph.addBufferNeighbor("path_215", 33);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_217", null, "campus_sw");
		graph.setBufferXYAttributes(473, 1280);
		graph.addBufferNeighbor("path_216", 10);
		graph.addBufferNeighbor("path_218", 102);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_216", null, "campus_sw");
		graph.setBufferXYAttributes(466, 1288);
		graph.addBufferNeighbor("path_215", 19);
		graph.addBufferNeighbor("path_217", 10);
		graph.addBufferNeighbor("path_261", 134);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_211", null, "campus_sw");
		graph.setBufferXYAttributes(434, 1204);
		graph.addBufferNeighbor("path_36", 27);
		graph.addBufferNeighbor("path_212", 60);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_cafe", null, "campus_nw");
		graph.setBufferXYAttributes(422, 1025);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_213", null, "campus_sw");
		graph.setBufferXYAttributes(377, 1273);
		graph.addBufferNeighbor("path_212", 28);
		graph.addBufferNeighbor("path_263", 150);
		graph.addBufferNeighbor("zin_8", 93);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_212", null, "campus_sw");
		graph.setBufferXYAttributes(393, 1249);
		graph.addBufferNeighbor("path_211", 60);
		graph.addBufferNeighbor("path_213", 28);
		graph.addBufferNeighbor("path_214", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("stevenson_1", null, "campus_nw");
		graph.setBufferXYAttributes(824, 1162);
		graph.addBufferNeighbor("path_154", 9);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("stevenson_3", null, "campus_sw");
		graph.setBufferXYAttributes(923, 1213);
		graph.addBufferNeighbor("path_364", 237);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("stevenson_2", null, "campus_sw");
		graph.setBufferXYAttributes(825, 1286);
		graph.addBufferNeighbor("path_244", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_219", null, "campus_sw");
		graph.setBufferXYAttributes(582, 1235);
		graph.addBufferNeighbor("path_218", 44);
		graph.addBufferNeighbor("path_220", 31);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_218", null, "campus_sw");
		graph.setBufferXYAttributes(575, 1279);
		graph.addBufferNeighbor("path_217", 102);
		graph.addBufferNeighbor("path_219", 44);
		graph.addBufferNeighbor("path_234", 58);
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
		graph.setBufferTextAttributes("su_1", null, "campus_nw");
		graph.setBufferXYAttributes(989, 1112);
		graph.addBufferNeighbor("path_124", 37);
		graph.addBufferNeighbor("path_125", 46);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("childrens_school", null, "campus_nw");
		graph.setBufferXYAttributes(461, 972);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("softball_diamond", null, "campus_se");
		graph.setBufferXYAttributes(1633, 1433);
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
		graph.setBufferTextAttributes("path_260", null, "campus_sw");
		graph.setBufferXYAttributes(521, 1423);
		graph.addBufferNeighbor("path_259", 52);
		graph.addBufferNeighbor("path_261", 54);
		graph.addBufferNeighbor("cb_2", 6);
		graph.addBufferNeighbor("mccabe", 24);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_261", null, "campus_sw");
		graph.setBufferXYAttributes(467, 1422);
		graph.addBufferNeighbor("path_216", 134);
		graph.addBufferNeighbor("path_260", 54);
		graph.addBufferNeighbor("path_262", 70);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_262", null, "campus_sw");
		graph.setBufferXYAttributes(397, 1423);
		graph.addBufferNeighbor("path_261", 70);
		graph.addBufferNeighbor("path_263", 19);
		graph.addBufferNeighbor("path_274", 420);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_263", null, "campus_sw");
		graph.setBufferXYAttributes(378, 1423);
		graph.addBufferNeighbor("path_213", 150);
		graph.addBufferNeighbor("path_262", 19);
		graph.addBufferNeighbor("verdot_1", 54);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_264", null, "campus_sw");
		graph.setBufferXYAttributes(379, 1720);
		graph.addBufferNeighbor("verdot_1", 243);
		graph.addBufferNeighbor("path_265", 18);
		graph.addBufferNeighbor("path_266", 29);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_265", null, "campus_sw");
		graph.setBufferXYAttributes(397, 1724);
		graph.addBufferNeighbor("path_264", 18);
		graph.addBufferNeighbor("path_267", 77);
		graph.addBufferNeighbor("path_273", 251);
		graph.addBufferNeighbor("path_274", 271);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_266", null, "campus_sw");
		graph.setBufferXYAttributes(379, 1749);
		graph.addBufferNeighbor("path_264", 29);
		graph.addBufferNeighbor("path_275", 121);
		graph.addBufferNeighbor("sauv_5", 129);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_267", null, "campus_sw");
		graph.setBufferXYAttributes(397, 1801);
		graph.addBufferNeighbor("path_265", 77);
		graph.addBufferNeighbor("path_268", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_268", null, "campus_sw");
		graph.setBufferXYAttributes(402, 1818);
		graph.addBufferNeighbor("path_267", 17);
		graph.addBufferNeighbor("path_269", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_269", null, "campus_sw");
		graph.setBufferXYAttributes(414, 1833);
		graph.addBufferNeighbor("path_268", 19);
		graph.addBufferNeighbor("path_270", 22);
		graph.addBufferNeighbor("path_271", 131);
		graph.addBufferNeighbor("path_275", 53);
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
		graph.addBufferNeighbor("path_211", 27);
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
		graph.setBufferTextAttributes("courts_1", null, "campus_se");
		graph.setBufferXYAttributes(1711, 1253);
		graph.addBufferNeighbor("path_181", 56);
		graph.addBufferNeighbor("path_182", 21);
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
		graph.setBufferTextAttributes("verdot_1", null, "campus_sw");
		graph.setBufferXYAttributes(377, 1477);
		graph.addBufferNeighbor("path_263", 54);
		graph.addBufferNeighbor("path_264", 243);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_149", null, "campus_nw");
		graph.setBufferXYAttributes(1154, 901);
		graph.addBufferNeighbor("path_148", 29);
		graph.addBufferNeighbor("path_150", 110);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("vineyard", null, "campus_sw");
		graph.setBufferXYAttributes(243, 1250);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("rec_1", null, "campus_sw");
		graph.setBufferXYAttributes(751, 1535);
		graph.addBufferNeighbor("path_368", 71);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("cabernet", null, "campus_nw");
		graph.setBufferXYAttributes(194, 875);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_148", null, "campus_nw");
		graph.setBufferXYAttributes(1133, 922);
		graph.addBufferNeighbor("path_147", 34);
		graph.addBufferNeighbor("path_148", 0);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_222", null, "campus_ne");
		graph.setBufferXYAttributes(1291, 1039);
		graph.addBufferNeighbor("path_221", 60);
		graph.addBufferNeighbor("path_173", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("tennis_courts", null, "campus_se");
		graph.setBufferXYAttributes(1818, 1254);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_courtyard", null, "campus_nw");
		graph.setBufferXYAttributes(423, 1114);
		graph.addBufferNeighbor("path_38", 22);
		graph.addBufferNeighbor("path_34", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("bookstore", null, "campus_ne");
		graph.setBufferXYAttributes(1222, 1133);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("ameci_1", null, "campus_sw");
		graph.setBufferXYAttributes(338, 1877);
		graph.addBufferNeighbor("path_276", 31);
		graph.addBufferNeighbor("path_278", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("facilities_1", null, "campus_ne");
		graph.setBufferXYAttributes(1956, 1108);
		graph.addBufferNeighbor("path_179", 30);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("garden_1", null, "campus_ne");
		graph.setBufferXYAttributes(1456, 932);
		graph.addBufferNeighbor("path_172", 97);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("ives_3", null, "campus_sw");
		graph.setBufferXYAttributes(1175, 1543);
		graph.addBufferNeighbor("path_350", 12);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("ives_1", null, "campus_sw");
		graph.setBufferXYAttributes(1175, 1613);
		graph.addBufferNeighbor("path_348", 17);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_210", null, "campus_se");
		graph.setBufferXYAttributes(1204, 1672);
		graph.addBufferNeighbor("path_209", 29);
		graph.addBufferNeighbor("path_347", 5);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("nichols_1", null, "campus_nw");
		graph.setBufferXYAttributes(686, 1139);
		graph.addBufferNeighbor("path_80", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_220", null, "campus_sw");
		graph.setBufferXYAttributes(613, 1230);
		graph.addBufferNeighbor("path_219", 31);
		graph.addBufferNeighbor("path_231", 25);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_321", null, "campus_sw");
		graph.setBufferXYAttributes(1009, 1729);
		graph.addBufferNeighbor("path_302", 37);
		graph.addBufferNeighbor("path_320", 13);
		graph.addBufferNeighbor("path_322", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_320", null, "campus_sw");
		graph.setBufferXYAttributes(1018, 1739);
		graph.addBufferNeighbor("path_319", 10);
		graph.addBufferNeighbor("path_321", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_323", null, "campus_sw");
		graph.setBufferXYAttributes(1019, 1691);
		graph.addBufferNeighbor("path_322", 28);
		graph.addBufferNeighbor("path_324", 13);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_322", null, "campus_sw");
		graph.setBufferXYAttributes(1018, 1719);
		graph.addBufferNeighbor("path_321", 13);
		graph.addBufferNeighbor("path_323", 28);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_152", null, "campus_nw");
		graph.setBufferXYAttributes(1183, 1084);
		graph.addBufferNeighbor("path_143", 75);
		graph.addBufferNeighbor("path_153", 53);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_324", null, "campus_sw");
		graph.setBufferXYAttributes(1032, 1689);
		graph.addBufferNeighbor("path_323", 13);
		graph.addBufferNeighbor("path_325", 22);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_327", null, "campus_sw");
		graph.setBufferXYAttributes(1031, 1609);
		graph.addBufferNeighbor("path_326", 45);
		graph.addBufferNeighbor("path_328", 35);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_326", null, "campus_sw");
		graph.setBufferXYAttributes(1048, 1651);
		graph.addBufferNeighbor("path_325", 20);
		graph.addBufferNeighbor("path_327", 45);
		graph.addBufferNeighbor("path_342", 61);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_329", null, "campus_sw");
		graph.setBufferXYAttributes(946, 1579);
		graph.addBufferNeighbor("path_303", 168);
		graph.addBufferNeighbor("path_328", 86);
		graph.addBufferNeighbor("path_330", 90);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_328", null, "campus_sw");
		graph.setBufferXYAttributes(1032, 1574);
		graph.addBufferNeighbor("path_327", 35);
		graph.addBufferNeighbor("path_329", 86);
		graph.addBufferNeighbor("path_330", 123);
		graph.addBufferNeighbor("path_341", 27);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("stevenson_4", null, "campus_sw");
		graph.setBufferXYAttributes(726, 1241);
		graph.addBufferNeighbor("path_242", 19);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("zin_marketplace", null, "campus_nw");
		graph.setBufferXYAttributes(391, 1120);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("library_1", null, "campus_sw");
		graph.setBufferXYAttributes(577, 1396);
		graph.addBufferNeighbor("path_258", 64);
		graph.addBufferNeighbor("path_259", 27);
		graph.addBufferNeighbor("cb_1", 20);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("library_2", null, "campus_sw");
		graph.setBufferXYAttributes(619, 1376);
		graph.addBufferNeighbor("path_238", 30);
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
		graph.setBufferTextAttributes("path_146", null, "campus_nw");
		graph.setBufferXYAttributes(1088, 989);
		graph.addBufferNeighbor("path_139", 30);
		graph.addBufferNeighbor("path_147", 45);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_141", null, "campus_nw");
		graph.setBufferXYAttributes(1133, 1012);
		graph.addBufferNeighbor("path_142", 24);
		graph.addBufferNeighbor("path_140", 26);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_140", null, "campus_nw");
		graph.setBufferXYAttributes(1107, 1015);
		graph.addBufferNeighbor("path_139", 37);
		graph.addBufferNeighbor("path_141", 26);
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
		graph.setBufferTextAttributes("pub_1", null, "campus_nw");
		graph.setBufferXYAttributes(1005, 1111);
		graph.addBufferNeighbor("path_123", 37);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_221", null, "campus_ne");
		graph.setBufferXYAttributes(1231, 1035);
		graph.addBufferNeighbor("path_153", 32);
		graph.addBufferNeighbor("path_222", 60);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("pool", null, "campus_ne");
		graph.setBufferXYAttributes(1529, 1170);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("soccer_field", null, "campus_se");
		graph.setBufferXYAttributes(1435, 1534);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_g", null, "campus_ne");
		graph.setBufferXYAttributes(1549, 984);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_l", null, "campus_ne");
		graph.setBufferXYAttributes(1343, 909);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_m", null, "campus_ne");
		graph.setBufferXYAttributes(1265, 566);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_n", null, "campus_ne");
		graph.setBufferXYAttributes(1332, 317);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_o", null, "campus_ne");
		graph.setBufferXYAttributes(1565, 344);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("parking_h", null, "campus_ne");
		graph.setBufferXYAttributes(1789, 993);
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
		graph.setBufferTextAttributes("path_72", null, "campus_nw");
		graph.setBufferXYAttributes(612, 1142);
		graph.addBufferNeighbor("path_71", 19);
		graph.addBufferNeighbor("path_69", 28);
		graph.addBufferNeighbor("path_232", 62);
		graph.addBufferNeighbor("carson_1", 23);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("path_73", null, "campus_nw");
		graph.setBufferXYAttributes(677, 1186);
		graph.addBufferNeighbor("path_66", 41);
		graph.addBufferNeighbor("path_74", 13);
		graph.addBufferNeighbor("path_242", 66);
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
		graph.addBufferNeighbor("path_242", 67);
		graph.pushNode();


		graph.newNode();
		graph.setBufferTextAttributes("commencement", null, "campus_nw");
		graph.setBufferXYAttributes(1040, 945);
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
