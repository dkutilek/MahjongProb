package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListDragons extends SubTypeList {
	
	/**
	 * Constructor for List Dragons
	 */
	public ListDragons() {
		super();
		for (String item : Images.dragonList)
			addItem(item);
	}
}
