package com.dkutilek.mahjong.client.discard;

import com.google.gwt.user.client.ui.Label;

public class DiscardInfoOneToNine extends DiscardInfo {
	
	public DiscardInfoOneToNine() {
		super(9,2);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		labels = new Label[9];
		discarded = new Integer[9];
		
		for (int i = 0; i < 9; i++) {
			int zero = 0;
			discarded[i] = zero;
			labels[i] = new Label(Integer.toString(discarded[i]));
			labels[i].setHeight(LABEL_HEIGHT);
			labels[i].setWidth(LABEL_WIDTH);
			setWidget(i, 1, labels[i]);
			Label label = new Label(Integer.toString(i+1));
			label.setHeight(LABEL_HEIGHT);
			label.setWidth(LABEL_WIDTH);
			setWidget(i, 0, label);
		}
	}
	
	public void discard(String subType) {
		
	}
}
