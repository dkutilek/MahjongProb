package com.dkutilek.mahjong.client.discard;

import com.dkutilek.mahjong.client.ChooseTileDialogBox;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;

public class DiscardTileButton extends PushButton {
	public static final String WIDTH = "37px";
	public static final String HEIGHT = "57px";
	
	DiscardTileButton(final DiscardPanel discardPanel, Image image) {
		super(image);
		this.setSize(WIDTH, HEIGHT);
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				new ChooseTileDialogBox(discardPanel);
			}
		});
	}
}
