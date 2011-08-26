package com.dkutilek.mahjong.client.tiles;

import java.util.HashMap;

import com.dkutilek.mahjong.shared.Images;

public class AllTiles {
	
	private HashMap<String,HashMap<String,Integer>> tiles;
	
	/**
	 * Constructor for All Tiles
	 */
	public AllTiles() {
		initHashMap();
	}
	
	/**
	 * Initialize the hash map
	 */
	private void initHashMap() {
		tiles = new HashMap<String,HashMap<String,Integer>>();
		for (int i = 0; i < Images.tileTypeList.length; i++) {
			HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
			switch (i) {
			case 0:
			case 1:
			case 2:
				for (String number : Images.numberList) {
					int zero = 0;
					hashMap.put(number, zero);
				}
				break;
			case 3:
				for (String dragon : Images.dragonList) {
					int zero = 0;
					hashMap.put(dragon, zero);
				}
				break;
			case 4:
				{
					int zero = 0;
					String flower = Images.tileTypeList[4];
					hashMap.put(flower, zero);
				}
				break;
			case 5:
				{
					int zero = 0;
					String joker = Images.tileTypeList[5];
					hashMap.put(joker, zero);
				}
				break;
			case 8:
				for (String wind : Images.windList) {
					int zero = 0;
					hashMap.put(wind, zero);
				}
				break;
			}
			tiles.put(Images.tileTypeList[i], hashMap);
		}
	}
	
	/**
	 * Checks if the specified tile has any more in the deck
	 * @param type - type of the tile
	 * @param subType - sub-type of the tile
	 * @return true or false
	 */
	public boolean isAvailable(String type, String subType) {
		Integer num = get(type, subType);
		if (num == null)
			return false;
		if (type.equals(Images.tileTypeList[4]) ||
			type.equals(Images.tileTypeList[5])) {
			if (num < 8) {
				return true;
			}
		}
		else {
			if (num < 4) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check if the specified type of tile has any more in the deck
	 * @param type - type of the tile
	 * @return true or false
	 */
	public boolean isAvailable(String type) {
		if (type.equals(Images.tileTypeList[0]) ||
			type.equals(Images.tileTypeList[1]) ||
			type.equals(Images.tileTypeList[2])) {
			for (String subType : Images.numberList) {
				if (isAvailable(type, subType))
					return true;
			}
		}
		else if (type.equals(Images.tileTypeList[3])) {
			for (String subType : Images.dragonList) {
				if (isAvailable(type, subType))
					return true;
			}
		}
		else if (type.equals(Images.tileTypeList[4]) ||
				 type.equals(Images.tileTypeList[5])) {
			return isAvailable(type,type);
		}
		else if (type.equals(Images.tileTypeList[6])) {
			for (String subType : Images.windList) {
				if (isAvailable(type, subType))
					return true;
			}
		}
		return false;
	}
	
	/**
	 * Add a tile to the visible list.
	 * @param type - type of the tile
	 * @param subType - sub-type of the tile
	 */
	public void add(String type, String subType) {
		Integer num = get(type, subType);
		if (num == null)
			return;
		if (type.equals(Images.tileTypeList[4]) ||
			type.equals(Images.tileTypeList[5])) {
			if (num < 8) {
				set(num+1, type, subType);
			}
		}
		else {
			if (num < 4) {
				set(num+1, type, subType);
			}
		}
	}
	
	/**
	 * Helper method to set new values in the hash map
	 * @param num
	 * @param type
	 * @param subType
	 */
	private void set(int num, String type, String subType) {
		tiles.get(type).remove(subType);
		tiles.get(type).put(subType, num);
	}
	
	/**
	 * Get the number of visible tiles of the specified tile
	 * @param type - type of the tile
	 * @param subType - sub-type of the tile
	 * @return the number of visible tiles
	 */
	public int get(String type, String subType) {
		return tiles.get(type).get(subType);
	}
	
	/**
	 * Get the number of tiles still available or "hidden" in
	 * the deck.
	 * @param type - type of the tile
	 * @param subType - sub-type of the tile
	 * @return number of tiles still available
	 */
	public int getAvailable(String type, String subType) {
		Integer num = get(type, subType);
		if (num == null) {
			return -1;
		}
		if (type.equals(Images.tileTypeList[4]) ||
			type.equals(Images.tileTypeList[5])) {
			return 8 - num;
		}
		else {
			return 4 - num;
		}
	}
}
