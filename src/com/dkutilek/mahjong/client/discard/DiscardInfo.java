package com.dkutilek.mahjong.client.discard;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;

public abstract class DiscardInfo extends Grid {
	
	protected Label[] labels;
	protected Integer[] discarded;

	protected static final String LABEL_HEIGHT = "20px";
	protected static final String LABEL_WIDTH = "30px";
	protected static final String GRID_HEIGHT = "90px";
	protected static final String GRID_WIDTH = "60px";
	
	public DiscardInfo(int rows, int columns) {
		super(rows,columns);
	}

	public abstract void discard(String subType);
}
