package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListDragons extends SubTypeList {
	public ListDragons() {
		super();
		for (String item : Images.dragonList)
			addItem(item);
	}
}
