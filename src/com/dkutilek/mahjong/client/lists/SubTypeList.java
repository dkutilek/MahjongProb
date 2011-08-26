package com.dkutilek.mahjong.client.lists;

import com.google.gwt.user.client.ui.ListBox;

public class SubTypeList extends ListBox {
	SubTypeList() {
		super();
	}

	/**
	 * Get the selected text of the Sub Type List
	 * @return the text selected.
	 */
	public String getSelectedText() {
		return getItemText(getSelectedIndex());
	}
}
