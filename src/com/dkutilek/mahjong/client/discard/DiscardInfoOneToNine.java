package com.dkutilek.mahjong.client.discard;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;

public class DiscardInfoOneToNine extends Grid {
	
	private Label[] labels;
	private static final String LABEL_HEIGHT = "20px";
	private static final String LABEL_WIDTH = "30px";
	private static final String GRID_HEIGHT = "180px";
	private static final String GRID_WIDTH = "60px";
	
	public DiscardInfoOneToNine() {
		super(9,2);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		labels = new Label[9];
		
		for (int i = 0; i < 9; i++) {
			labels[i] = new Label("0");
			labels[i].setHeight(LABEL_HEIGHT);
			labels[i].setWidth(LABEL_WIDTH);
			setWidget(i, 1, labels[i]);
			Label label = new Label(Integer.toString(i+1));
			label.setHeight(LABEL_HEIGHT);
			label.setWidth(LABEL_WIDTH);
			setWidget(i, 0, label);
		}
	}
}
