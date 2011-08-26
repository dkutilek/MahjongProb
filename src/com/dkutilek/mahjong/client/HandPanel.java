package com.dkutilek.mahjong.client;

import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ToggleButton;

public class HandPanel extends TilePanel {
	private static final int TILES_IN_HAND = 13;
	private static final int EAST_TILE = TILES_IN_HAND - 1;
	private static TileButton[] handButtons = new TileButton[TILES_IN_HAND];
	private static ToggleButton eastToggleButton;
	private static HorizontalPanel handHorizontalPanel;
	private static HorizontalPanel handOptionsHorizontalPanel;
	
	/**
	 * Constructor for Hand Panel
	 */
	public HandPanel() {
		super(TILES_IN_HAND);
		handHorizontalPanel = new HorizontalPanel();
		this.add(handHorizontalPanel);
		handHorizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_BOTTOM);
		handHorizontalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		
		for (int i = 0; i < TILES_IN_HAND; i++) {
			images[i] = new Image(Images.EMPTY);
			handButtons[i] = new TileButton(this, images[i], i);
			handHorizontalPanel.add(handButtons[i]);
		}
		handButtons[EAST_TILE].setVisible(false);
		
		handOptionsHorizontalPanel = new HorizontalPanel();
		this.add(handOptionsHorizontalPanel);
		
		eastToggleButton = new ToggleButton("East");
		eastToggleButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (eastToggleButton.isDown()) {
					handButtons[EAST_TILE].setVisible(true);
				}
				else {
					handButtons[EAST_TILE].setVisible(false);
				}
			}
		});
		handOptionsHorizontalPanel.add(eastToggleButton);
	}
}
