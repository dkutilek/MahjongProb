package com.dkutilek.mahjong.shared;

import java.util.HashMap;

import com.google.gwt.user.client.ui.Image;

public class Images {

	public static final String IMAGE_DIR = "images";
	public static final String JPG = ".jpg";
	public static final String EMPTY = IMAGE_DIR + "/empty" + JPG;
	
	public static final String BAM = "Bam";
	public static final String CRACK = "Crack";
	public static final String DOT = "Dot";
	public static final String DRAGON = "Dragon";
	public static final String FLOWER = "Flower";
	public static final String JOKER = "Joker";
	public static final String WIND = "Wind";
	
	public static final String GREEN = "Green";
	public static final String RED = "Red";
	public static final String WHITE = "White";
	
	public static final String EAST = "East";
	public static final String NORTH = "North";
	public static final String SOUTH = "South";
	public static final String WEST = "West";
	
	public static final String[] tileTypeList = {BAM, CRACK, DOT,
		DRAGON, FLOWER, JOKER, WIND};
	public static final String[] numberList = {"1", "2", "3", "4", "5",
		"6", "7", "8", "9"};
	public static final String[] dragonList = {GREEN, RED, WHITE};
	public static final String[] windList = {EAST, NORTH, SOUTH, WEST};
	
	public static String getImagePath(String type, String subType) {
		return IMAGE_DIR + "/" + type + "/" + subType + JPG;
	}
	
	private HashMap<String,HashMap<String,Image>> images;
	
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
				String jokerPath = path + tileTypeList[i] + JPG;
				Image jokerImage = new Image(jokerPath);
				hashMap.put(tileTypeList[i], jokerImage);
				break;
			case 6:
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
