package com.dkutilek.mahjong.client.lists;

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
		for (String item : Images.tileTypeList)
			addItem(item);
		subTypeList = new ListOneToNine();
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
		panel.remove(subTypeList);
		switch (getSelectedIndex()) {
		case 0:
		case 1:
		case 2:
			subTypeList = new ListOneToNine();
			break;
		case 3:
			subTypeList = new ListDragons();
			break;
		case 4:
			subTypeList = new ListEmpty(Images.FLOWER);
			break;
		case 5:
			subTypeList = new ListEmpty(Images.JOKER);
			break;
		case 6:
			subTypeList = new ListWinds();
			break;
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
