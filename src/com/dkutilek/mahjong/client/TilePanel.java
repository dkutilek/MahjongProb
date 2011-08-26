package com.dkutilek.mahjong.client;

import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TilePanel extends VerticalPanel {
	
	protected Image[] images;
	
	/**
	 * Constructor for Tile Panel
	 * @param numImages - number of Images in the panel
	 */
	public TilePanel(int numImages) {
		super();
		images = new Image[numImages];
	}
	
	/**
	 * Change the image at the index to the new type and sub-type
	 * @param index - index of image in the array
	 * @param type - type of tile
	 * @param subType - sub-type of tile
	 */
	public void setTileImage(int index, String type, String subType) {
		images[index].setUrl(Images.getImagePath(type, subType));
	}
	
	/**
	 * Change the image at index zero to the new type and sub-type.
	 * Used for the discard panel (it only has one tile).
	 * @param type - type of tile
	 * @param subType - sub-type of tile
	 */
	public void setTileImage(String type, String subType) {
		images[0].setUrl(Images.getImagePath(type, subType));
	}
}
