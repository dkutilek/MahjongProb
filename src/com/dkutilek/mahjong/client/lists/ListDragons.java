package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.client.MahjongProb;
import com.dkutilek.mahjong.shared.Images;

public class ListDragons extends SubTypeList {
	
	/**
	 * Constructor for List Dragons
	 */
	public ListDragons() {
		super();
		for (String item : Images.dragonList) {
			if (MahjongProb.getAllTiles().isAvailable(Images.DRAGON, item))
				addItem(item);
		}
	}
}
