package com.dkutilek.mahjong.client.discard;

import com.dkutilek.mahjong.client.TileButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class DiscardPanel extends VerticalPanel {
	private TileButton discardTile;
	private static final String GRID_WIDTH = "360px";
	private static final String GRID_HEIGHT = "200px";
	private static final String TITLE_WIDTH = "60px";
	private static final String TITLE_HEIGHT = "20px";
	
	public DiscardPanel() {
		super();
		
		Grid discardGrid = new Grid(2, 6);
		discardGrid.setBorderWidth(1);
		add(discardGrid);
		discardGrid.setSize(GRID_WIDTH, GRID_HEIGHT);
		
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
		
		Label lblWind = new Label("Wind");
		lblWind.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		discardGrid.setWidget(0, 5, lblWind);
		lblWind.setSize(TITLE_WIDTH, TITLE_HEIGHT);
		
		DiscardInfoOneToNine bamGrid = new DiscardInfoOneToNine();
		discardGrid.setWidget(1, 0, bamGrid);
		
		DiscardInfoOneToNine crackGrid = new DiscardInfoOneToNine();
		discardGrid.setWidget(1, 1, crackGrid);
		
		DiscardInfoOneToNine dotGrid = new DiscardInfoOneToNine();
		discardGrid.setWidget(1, 2, dotGrid);
		
		DiscardInfoDragon dragonGrid = new DiscardInfoDragon();
		discardGrid.setWidget(1, 3, dragonGrid);
		
		DiscardInfoFlower flowerGrid = new DiscardInfoFlower();
		discardGrid.setWidget(1, 4, flowerGrid);
		
		DiscardInfoWind windGrid = new DiscardInfoWind();
		discardGrid.setWidget(1, 5, windGrid);
	}
}
