package com.dkutilek.mahjong.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;

public class TileButton extends PushButton {
	
	public static final String WIDTH = "45px";
	public static final String HEIGHT = "70px";
	//private Button button;
	
	TileButton(Image image) {
		super(image);
		this.setSize(WIDTH, HEIGHT);
		final PushButton pushButton = this;
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (getText().equals("")) {
					new ChooseTileDialogBox(pushButton);
				}
			}
		});
	}
	TileButton() {
		super();
		this.setSize(WIDTH, HEIGHT);
		final PushButton pushButton = this;
		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (getText().equals("")) {
					new ChooseTileDialogBox(pushButton);
				}
			}
		});
	}
}
