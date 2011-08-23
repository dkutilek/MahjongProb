package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListOneToEight extends SubTypeList {
	public ListOneToEight() {
		super();
		for (int i = 0; i < 8; i++)
			addItem(Images.numberList[i]);
	}
}
