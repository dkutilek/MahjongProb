package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.shared.Images;

public class ListWinds extends SubTypeList {
	public ListWinds() {
		super();
		for (String item : Images.windList)
			addItem(item);
	}
}
