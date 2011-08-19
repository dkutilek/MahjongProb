package com.dkutilek.mahjong.client.discard;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;

public class DiscardInfoDragon extends Grid {
	
	private Label[] labels;
	private static final String LABEL_HEIGHT = "20px";
	private static final String LABEL_WIDTH = "30px";
	private static final String GRID_HEIGHT = "90px";
	private static final String GRID_WIDTH = "60px";
	
	public DiscardInfoDragon() {
		super(3,2);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		labels = new Label[3];
		
		for (int i = 0; i < 3; i++) {
			labels[i] = new Label("0");
			labels[i].setHeight(LABEL_HEIGHT);
			labels[i].setWidth(LABEL_WIDTH);
			setWidget(i, 1, labels[i]);
			Label label = new Label();
			switch (i) {
			case 0:
				label.setText("G");
				break;
			case 1:
				label.setText("R");
				break;
			case 2:
				label.setText("W");
				break;
			}
			label.setHeight(LABEL_HEIGHT);
			label.setWidth(LABEL_WIDTH);
			setWidget(i, 0, label);
		}
	}
}
