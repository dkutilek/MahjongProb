package com.dkutilek.mahjong.client;

import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TilePanel extends VerticalPanel {
	
	protected Image[] images;
	
	public TilePanel(int numImages) {
		super();
		images = new Image[numImages];
	}
	
	public void setTileImage(int index, String type, String subType) {
		images[index].setUrl(Images.getImagePath(type, subType));
	}
	
	public void setTileImage(String type, String subType) {
		images[0].setUrl(Images.getImagePath(type, subType));
	}
}
