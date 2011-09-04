package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.client.MahjongProb;
import com.dkutilek.mahjong.shared.Images;

public class ListOneToNine extends SubTypeList {
	
	/**
	 * Constructor for List One To Nine
	 */
	public ListOneToNine(String type) {
		super();
		for (String item : Images.numberList) {
			if (MahjongProb.getAllTiles().isAvailable(type, item))
				addItem(item);
		}
	}
}
