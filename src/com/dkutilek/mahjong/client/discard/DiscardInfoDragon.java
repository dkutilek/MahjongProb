package com.dkutilek.mahjong.client.discard;

import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.user.client.ui.Label;

public class DiscardInfoDragon extends DiscardInfo {
	
	public DiscardInfoDragon() {
		super(3,2);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		labels = new Label[3];
		discarded = new Integer[3];
		
		for (int i = 0; i < 3; i++) {
			int zero = 0;
			discarded[i] = zero;
			labels[i] = new Label(Integer.toString(discarded[i]));
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
	
	public void discard(String subType) {
		if (subType.equals(Images.dragonList[0])) {
			discarded[0]++;
			labels[0].setText(Integer.toString(discarded[0]));
		}
		else if (subType.equals(Images.dragonList[1])) {
			discarded[1]++;
			labels[1].setText(Integer.toString(discarded[1]));
		}
		else if (subType.equals(Images.dragonList[2])) {
			discarded[2]++;
			labels[2].setText(Integer.toString(discarded[2]));
		}
	}
}
