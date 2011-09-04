package com.dkutilek.mahjong.client.hand;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;

public class HandTileButton extends PushButton {
	
	public static final String WIDTH = "37px";
	public static final String HEIGHT = "57px";
	
	/**
	 * Constructor for Tile Button
	 * @param handPanel - Hand Panel the tile is a part of
	 * @param image - Image on the tile
	 * @param i - index of tile
	 */
	public HandTileButton(final HandPanel handPanel, Image image, final int i) {
		super(image);
		this.setSize(WIDTH, HEIGHT);
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (getText().equals("")) {
					new HandDialogBox(handPanel, i);
				}
			}
		});
	}

	/**
	 * Constructor for Tile Button. No image is given, so no image
	 * is displayed.
	 * @param handPanel - Hand Panel the tile is a part of
	 * @param i - index of tile
	 */
	public HandTileButton(final HandPanel handPanel, final int i) {
		super();
		this.setSize(WIDTH, HEIGHT);
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (getText().equals("")) {
					new HandDialogBox(handPanel, i);
				}
			}
		});
	}
}
