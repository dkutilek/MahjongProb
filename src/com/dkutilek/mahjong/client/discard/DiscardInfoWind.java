package com.dkutilek.mahjong.client.discard;

import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.user.client.ui.Label;

public class DiscardInfoWind extends DiscardInfo {
	
	public DiscardInfoWind() {
		super(4,2);
		setHeight(GRID_HEIGHT);
		setWidth(GRID_WIDTH);
		setBorderWidth(1);
		labels = new Label[4];
		discarded = new Integer[4];
		
		for (int i = 0; i < 4; i++) {
			int zero = 0;
			discarded[i] = zero;
			labels[i] = new Label(Integer.toString(discarded[i]));
			labels[i].setHeight(LABEL_HEIGHT);
			labels[i].setWidth(LABEL_WIDTH);
			setWidget(i, 1, labels[i]);
			Label label = new Label();
			switch (i) {
			case 0:
				label.setText("E");
				break;
			case 1:
				label.setText("N");
				break;
			case 2:
				label.setText("S");
				break;
			case 3:
				label.setText("W");
				break;
			}
			label.setHeight(LABEL_HEIGHT);
			label.setWidth(LABEL_WIDTH);
			setWidget(i, 0, label);
		}
	}
	
	public void discard(String subType) {
		if (subType.equals(Images.windList[0])) {
			discarded[0]++;
			labels[0].setText(Integer.toString(discarded[0]));
		}
		else if (subType.equals(Images.windList[1])) {
			discarded[1]++;
			labels[1].setText(Integer.toString(discarded[1]));
		}
		else if (subType.equals(Images.windList[2])) {
			discarded[2]++;
			labels[2].setText(Integer.toString(discarded[2]));
		}
		else if (subType.equals(Images.windList[3])) {
			discarded[3]++;
			labels[3].setText(Integer.toString(discarded[3]));
		}
	}
}
