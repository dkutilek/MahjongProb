package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListOneToNine extends SubTypeList {
	public ListOneToNine() {
		super();
		for (String item : Images.numberList)
			addItem(item);
	}
}
