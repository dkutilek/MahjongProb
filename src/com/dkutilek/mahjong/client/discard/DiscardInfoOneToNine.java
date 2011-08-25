package com.dkutilek.mahjong.client.discard;

import com.dkutilek.mahjong.shared.Images;
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
		if (subType.equals(Images.numberList[0])) {
			discarded[0]++;
			labels[0].setText(Integer.toString(discarded[0]));
		}
		else if (subType.equals(Images.numberList[1])) {
			discarded[1]++;
			labels[1].setText(Integer.toString(discarded[1]));
		}
		else if (subType.equals(Images.numberList[2])) {
			discarded[2]++;
			labels[2].setText(Integer.toString(discarded[2]));
		}
		else if (subType.equals(Images.numberList[3])) {
			discarded[3]++;
			labels[3].setText(Integer.toString(discarded[3]));
		}
		else if (subType.equals(Images.numberList[4])) {
			discarded[4]++;
			labels[4].setText(Integer.toString(discarded[4]));
		}
		else if (subType.equals(Images.numberList[5])) {
			discarded[5]++;
			labels[5].setText(Integer.toString(discarded[5]));
		}
		else if (subType.equals(Images.numberList[6])) {
			discarded[6]++;
			labels[6].setText(Integer.toString(discarded[6]));
		}
		else if (subType.equals(Images.numberList[7])) {
			discarded[7]++;
			labels[7].setText(Integer.toString(discarded[7]));
		}
		else if (subType.equals(Images.numberList[8])) {
			discarded[8]++;
			labels[8].setText(Integer.toString(discarded[8]));
		}
	}
}
