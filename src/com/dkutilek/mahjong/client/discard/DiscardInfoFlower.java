package com.dkutilek.mahjong.client.discard;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;

public class DiscardInfoFlower extends Grid {
	
	private Label label;
	private static final String LABEL_HEIGHT = "20px";
	private static final String LABEL_WIDTH = "60px";
	private static final String GRID_HEIGHT = "20px";
	private static final String GRID_WIDTH = "60px";
	
	public DiscardInfoFlower() {
		super(1,1);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		label = new Label("0");
		label.setSize(LABEL_WIDTH, LABEL_HEIGHT);
		setWidget(0, 0, label);
	}
}
