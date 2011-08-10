package com.dkutilek.mahjong.client;

import com.dkutilek.mahjong.client.lists.TypeList;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChooseTileDialogBox extends DialogBox {

	public static final String CAPTION = "New Tile Value";
	public static final String DETAILS = "Choose a new tile:";
	public static final String CANCEL = "Cancel";
	public static final String SAVE = "Save";
	public static final String WIDTH = "180px";
	public static final String HEIGHT = "120px";
	
	TypeList tileTypeList;

	ChooseTileDialogBox(final HandPanel handPanel, final int i) {
		super();
		ensureDebugId("ChooseTileDialogBox");
		setText(CAPTION);
		setAnimationEnabled(true);
		setGlassEnabled(true);

		// Create a table to layout the content
		VerticalPanel dialogContents = new VerticalPanel();
		dialogContents.setSpacing(4);
		dialogContents.setSize(WIDTH, HEIGHT);
		setWidget(dialogContents);

		// Add some text to the top of the dialog
		HTML details = new HTML(DETAILS);
		dialogContents.add(details);
		dialogContents.setCellHorizontalAlignment(details,
				HasHorizontalAlignment.ALIGN_CENTER);

		// Create horizontal panel for tile selections
		HorizontalPanel tileSelection = new HorizontalPanel();
		tileSelection.setSpacing(2);
		dialogContents.add(tileSelection);
		// Add a drop down list for tile type
		tileTypeList = new TypeList(tileSelection);

		HorizontalPanel saveCancel = new HorizontalPanel();
		dialogContents.add(saveCancel);
		// Add a save button at the bottom-left of the dialog
		Button saveButton = new Button(SAVE, new ClickHandler() {
			public void onClick(ClickEvent event) {
				handPanel.setHandImage(i, tileTypeList.getSelectedText(),
						tileTypeList.getSubTypeList().getSelectedText());
				hide();
			}
		});
		saveButton.setSize("80px", "30px");
		saveCancel.add(saveButton);
		HorizontalPanel spacingPanel = new HorizontalPanel();
		spacingPanel.setSize("20px", "30px");
		saveCancel.add(spacingPanel);
		// Add a cancel button at the bottom-right of the dialog
		Button cancelButton = new Button(CANCEL, new ClickHandler() {
			public void onClick(ClickEvent event) {
				hide();
			}
		});
		cancelButton.setSize("80px", "30px");
		saveCancel.add(cancelButton);

		center();
		show();
	}

}
