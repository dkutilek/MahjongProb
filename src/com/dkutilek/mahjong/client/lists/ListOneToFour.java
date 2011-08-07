package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListOneToFour extends SubTypeList {
	public ListOneToFour() {
		super();
		for (int i = 0; i < 4; i++)
			addItem(Images.numberList[i]);
	}
}
