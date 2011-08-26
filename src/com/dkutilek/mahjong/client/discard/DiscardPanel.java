package com.dkutilek.mahjong.client.discard;

import java.util.HashMap;

import com.dkutilek.mahjong.client.TilePanel;
import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class DiscardPanel extends TilePanel {
	private DiscardTileButton discardTileButton;
	private static final String GRID_WIDTH = "360px";
	private static final String GRID_HEIGHT = "200px";
	private static final String TITLE_WIDTH = "60px";
	private static final String TITLE_HEIGHT = "20px";
	
	private HashMap<String,HashMap<String,Integer>> discarded;
	DiscardInfoOneToNine bamGrid;
	DiscardInfoOneToNine crackGrid;
	DiscardInfoOneToNine dotGrid;
	DiscardInfoDragon dragonGrid;
	DiscardInfoEmpty flowerGrid;
	DiscardInfoEmpty jokerGrid;
	DiscardInfoWind windGrid;
	
	/**
	 * Constructor for Discard Panel
	 */
	public DiscardPanel() {
		super(1);
		images[0] = new Image(Images.EMPTY);
		discardTileButton = new DiscardTileButton(this, images[0]);
		
		Grid discardGrid = new Grid(2, 8);
		discardGrid.setBorderWidth(1);
		add(discardGrid);
		discardGrid.setSize(GRID_WIDTH, GRID_HEIGHT);
		
		
		// Labels
		Label lblBam = new Label("Bam");
		lblBam.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 0, lblBam);
		lblBam.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblCrack = new Label("Crack");
		lblCrack.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 1, lblCrack);
		lblCrack.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblDot = new Label("Dot");
		lblDot.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 2, lblDot);
		lblDot.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblDragon = new Label("Dragon");
		lblDragon.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 3, lblDragon);
		lblDragon.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblFlower = new Label("Flower");
		lblFlower.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 4, lblFlower);
		lblFlower.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblJoker = new Label("Joker");
		lblJoker.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 5, lblJoker);
		lblJoker.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblWind = new Label("Wind");
		lblWind.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 6, lblWind);
		lblWind.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		Label lblDiscard = new Label("Discard");
		lblDiscard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 7, lblDiscard);
		lblDiscard.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		// Grids
		bamGrid = new DiscardInfoOneToNine();
		discardGrid.setWidget(1, 0, bamGrid);
		
		crackGrid = new DiscardInfoOneToNine();
		discardGrid.setWidget(1, 1, crackGrid);
		
		dotGrid = new DiscardInfoOneToNine();
		discardGrid.setWidget(1, 2, dotGrid);
		
		dragonGrid = new DiscardInfoDragon();
		discardGrid.setWidget(1, 3, dragonGrid);
		
		flowerGrid = new DiscardInfoEmpty();
		discardGrid.setWidget(1, 4, flowerGrid);
		
		jokerGrid = new DiscardInfoEmpty();
		discardGrid.setWidget(1, 5, jokerGrid);
		
		windGrid = new DiscardInfoWind();
		discardGrid.setWidget(1, 6, windGrid);
		
		discardGrid.setWidget(1, 7, discardTileButton);
		
		initHashMap();
	}
	
	/**
	 * Return grid associated with the given type.
	 * @param type - Type of tile
	 * @return the DiscardInfo associated with the type
	 */
	public DiscardInfo getDiscardInfo(String type) {
		if (type.equals(Images.tileTypeList[0])) {
			return bamGrid;
		}
		else if (type.equals(Images.tileTypeList[1])) {
			return crackGrid;
		}
		else if (type.equals(Images.tileTypeList[2])) {
			return dotGrid;
		}
		else if (type.equals(Images.tileTypeList[3])) {
			return dragonGrid;
		}
		else if (type.equals(Images.tileTypeList[4])) {
			return flowerGrid;
		}
		else if (type.equals(Images.tileTypeList[5])) {
			return jokerGrid;
		}
		else if (type.equals(Images.tileTypeList[6])) {
			return windGrid;
		}
		else {
			return null;
		}
	}
	
	/**
	 * Initialize the hash map to have all of the discard
	 * values from all of the discard info grids.
	 */
	private void initHashMap() {
		discarded = new HashMap<String,HashMap<String,Integer>>();
		for (int i = 0; i < Images.tileTypeList.length; i++) {
			HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
			switch (i) {
			case 0:
				for (int j = 0; j < Images.numberList.length; j++) {
					String number = Images.numberList[j];
					hashMap.put(number, bamGrid.getDiscarded()[j]);
				}
				break;
			case 1:
				for (int j = 0; j < Images.numberList.length; j++) {
					String number = Images.numberList[j];
					hashMap.put(number, crackGrid.getDiscarded()[j]);
				}
				break;
			case 2:
				for (int j = 0; j < Images.numberList.length; j++) {
					String number = Images.numberList[j];
					hashMap.put(number, dotGrid.getDiscarded()[j]);
				}
				break;
			case 3:
				for (int j = 0; j < Images.numberList.length; j++) {
					String dragon = Images.dragonList[j];
					hashMap.put(dragon, dragonGrid.getDiscarded()[j]);
				}
				break;
			case 4:
				String flower = Images.tileTypeList[4];
				hashMap.put(flower, flowerGrid.getDiscarded()[0]);
				break;
			case 5:
				String joker = Images.tileTypeList[5];
				hashMap.put(joker, jokerGrid.getDiscarded()[0]);
				break;
			case 8:
				for (String wind : Images.windList) {
					int zero = 0;
					hashMap.put(wind, zero);
				}
				break;
			}
			discarded.put(Images.tileTypeList[i], hashMap);
		}
	}
}
