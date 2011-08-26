package com.dkutilek.mahjong.client.lists;


public class ListEmpty extends SubTypeList {
	
	String subType;
	
	/**
	 * Constructor for List Empty
	 * @param subType - sub-type to be returned when
	 * get selected text is called.
	 */
	public ListEmpty(String subType) {
		super();
		this.subType = subType;
		this.setEnabled(false);
	}
	
	/**
	 * Get the selected text of the Sub Type List
	 * @return the text selected.
	 */
	public String getSelectedText() {
		return subType;
	}
}
