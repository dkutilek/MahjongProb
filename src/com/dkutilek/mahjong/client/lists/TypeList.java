package com.dkutilek.mahjong.client.lists;

import com.dkutilek.mahjong.client.MahjongProb;
import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Panel;

public class TypeList extends ListBox {
	
	private SubTypeList subTypeList;
	private Panel panel;
	
	/**
	 * Constructor for Type List
	 * @param panel - the panel where this Type List resides.
	 */
	public TypeList(Panel panel) {
		super();
		this.panel = panel;
		setVisibleItemCount(1);
		for (String item : Images.tileTypeList) {
			if (MahjongProb.getAllTiles().isAvailable(item))
				addItem(item);
		}
		subTypeList = null;
		setSubList();
		
		addChangeHandler(new ChangeHandler () {
			public void onChange(ChangeEvent event) {
				setSubList();
			}
		});
		panel.add(this);
		panel.add(subTypeList);
	}

	/**
	 * Set the sub-type list to the corresponding options.
	 */
	private void setSubList() {
		if (subTypeList != null)
			panel.remove(subTypeList);
		String selected = getSelectedText();
		if (selected.equals(Images.BAM)) {
			subTypeList = new ListOneToNine(Images.BAM);
		}
		else if (selected.equals(Images.CRACK)) {
			subTypeList = new ListOneToNine(Images.CRACK);
		}
		else if (selected.equals(Images.DOT)) {
			subTypeList = new ListOneToNine(Images.DOT);
		}
		else if (selected.equals(Images.DRAGON)) {
			subTypeList = new ListDragons();
		}
		else if (selected.equals(Images.FLOWER)) {
			subTypeList = new ListEmpty(Images.FLOWER);
		}
		else if (selected.equals(Images.JOKER)) {
			subTypeList = new ListEmpty(Images.JOKER);
		}
		else if (selected.equals(Images.WIND)) {
			subTypeList = new ListWinds();
		}
		else {
			subTypeList = new ListEmpty("Error");
		}
		panel.add(subTypeList);
	}

	/**
	 * Get the Sub Type List
	 * @return the Sub Type List
	 */
	public SubTypeList getSubTypeList() {
		return subTypeList;
	}

	/**
	 * Get the Selected Text of the Type List
	 * @return the Selected Text
	 */
	public String getSelectedText() {
		return getItemText(getSelectedIndex());
	}
}
