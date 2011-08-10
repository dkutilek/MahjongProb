package com.dkutilek.mahjong.client.lists;

import com.google.gwt.user.client.ui.ListBox;

public class SubTypeList extends ListBox {
	SubTypeList() {
		super();
	}

	public String getSelectedText() {
		return getItemText(getSelectedIndex());
	}
}
