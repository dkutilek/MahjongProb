package com.dkutilek.mahjong.client.discard;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;

public class DiscardTileButton extends PushButton {
	public static final String WIDTH = "37px";
	public static final String HEIGHT = "57px";
	
	/**
	 * Constructor for Discard Tile Button
	 * @param discardPanel - Discard Panel to edit with user input
	 * from the pop-up
	 * @param image - Image to be displayed on the tile
	 */
	DiscardTileButton(final DiscardPanel discardPanel, Image image) {
		super(image);
		this.setSize(WIDTH, HEIGHT);
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				new DiscardDialogBox(discardPanel);
			}
		});
	}
}
