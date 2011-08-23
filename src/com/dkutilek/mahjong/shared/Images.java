package com.dkutilek.mahjong.shared;

import java.util.HashMap;

import com.google.gwt.user.client.ui.Image;

public class Images {
	// IMAGE DIRECTORY
	public static final String IMAGE_DIR = "images";
	public static final String JPG = ".jpg";
	public static final String EMPTY = IMAGE_DIR + "/empty" + JPG;
	
	private HashMap<String,HashMap<String,Image>> images;
	
	public static String[] tileTypeList = {"Bam", "Crack", "Dot",
		"Dragon","Flower", "Wind"};
	public static String[] numberList = {"1", "2", "3", "4", "5",
		"6", "7", "8", "9"};
	public static String[] dragonList = {"Green", "Red", "White"};
	public static String[] windList = {"East", "North", "South", "West"};
	
	public static String getImagePath(String type, String subType) {
		return IMAGE_DIR + "/" + type + "/" + subType + JPG;
	}
	
	public Images() {
		images = new HashMap<String,HashMap<String,Image>>();
		for (int i = 0; i < tileTypeList.length; i++) {
			String path = IMAGE_DIR + "/" + tileTypeList[i] + "/";
			HashMap<String,Image> hashMap = new HashMap<String,Image>();
			switch (i) {
			case 0:
			case 1:
			case 2:
				for (String number : numberList) {
					String numberPath = path + number+ JPG;
					Image image = new Image(numberPath);
					hashMap.put(number, image);
				}
				break;
			case 3:
				for (String dragon : dragonList) {
					String dragonPath = path + dragon + JPG;
					Image image = new Image(dragonPath);
					hashMap.put(dragon, image);
				}
				break;
			case 4:
				for (int j = 0; j < 8; j++) {
					String numberPath = path + numberList[j] + JPG;
					Image image = new Image(numberPath);
					hashMap.put(numberList[j], image);
				}
				break;
			case 5:
				for (String wind : windList) {
					String windPath = path + wind + JPG;
					Image image = new Image(windPath);
					hashMap.put(wind, image);
				}
				break;
			}
			images.put(tileTypeList[i], hashMap);
		}
	}

	public HashMap<String, HashMap<String, Image>> getImages() {
		return images;
	}

	public void setImages(HashMap<String, HashMap<String, Image>> images) {
		this.images = images;
	}
	
}
