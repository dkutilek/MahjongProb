package com.dkutilek.mahjong.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;

public class TileButton extends PushButton {
	
	public static final String WIDTH = "37px";
	public static final String HEIGHT = "57px";
	//private Button button;
	
	TileButton(final HandPanel handPanel, Image image, final int i) {
		super(image);
		this.setSize(WIDTH, HEIGHT);
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (getText().equals("")) {
					new ChooseTileDialogBox(handPanel, i);
				}
			}
		});
	}
	TileButton(final HandPanel handPanel, final int i) {
		super();
		this.setSize(WIDTH, HEIGHT);
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (getText().equals("")) {
					new ChooseTileDialogBox(handPanel, i);
				}
			}
		});
	}
}
