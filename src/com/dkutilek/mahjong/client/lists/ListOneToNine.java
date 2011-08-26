package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListOneToNine extends SubTypeList {
	
	/**
	 * Constructor for List One To Nine
	 */
	public ListOneToNine() {
		super();
		for (String item : Images.numberList)
			addItem(item);
	}
}
