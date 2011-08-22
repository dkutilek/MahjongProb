package com.dkutilek.mahjong.client.discard;

import com.google.gwt.user.client.ui.Label;

public class DiscardInfoFlower extends DiscardInfo {
	
	public DiscardInfoFlower() {
		super(1,1);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		labels = new Label[1];
		discarded = new Integer[1];
		
		int zero = 0;
		discarded[0] = zero;
		labels[0] = new Label(Integer.toString(discarded[0]));
		labels[0].setSize(LABEL_WIDTH, LABEL_HEIGHT);
		setWidget(0, 0, labels[0]);
	}
	
	public void discard(String subType) {
		discarded[0]++;
		labels[0].setText(Integer.toString(discarded[0]++));
	}
}
