package com.dkutilek.mahjong.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MahjongProb implements EntryPoint {
	RootPanel rootPanel = RootPanel.get(null);
	VerticalPanel handPanel;
	HorizontalPanel handHorizontalPanel;
	Button handButton01;
	Button handButton02;
	Button handButton03;
	Button handButton04;
	Button handButton05;
	Button handButton06;
	Button handButton07;
	Button handButton08;
	Button handButton09;
	Button handButton10;
	Button handButton11;
	Button handButton12;
	Button handButton13;
	ToggleButton eastToggleButton;

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
/*	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);*/

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final Label errorLabel = new Label();

		// Use RootPanel.get() to get the entire body element
		//RootPanel rootPanel = RootPanel.get(null);
		RootPanel.get("errorLabelContainer").add(errorLabel);
		
		handPanel = new VerticalPanel();
		rootPanel.add(handPanel);
		
		handHorizontalPanel = new HorizontalPanel();
		handPanel.add(handHorizontalPanel);
		handHorizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_BOTTOM);
		handHorizontalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		
		handButton01 = new Button("");
		handHorizontalPanel.add(handButton01);
		handButton01.setSize("45px", "70px");
		
		handButton02 = new Button("");
		handHorizontalPanel.add(handButton02);
		handButton02.setSize("45px", "70px");
		
		handButton03 = new Button("");
		handHorizontalPanel.add(handButton03);
		handButton03.setSize("45px", "70px");
		
		handButton04 = new Button("");
		handHorizontalPanel.add(handButton04);
		handButton04.setSize("45px", "70px");
		
		handButton05 = new Button("");
		handHorizontalPanel.add(handButton05);
		handButton05.setSize("45px", "70px");
		
		handButton06 = new Button("");
		handHorizontalPanel.add(handButton06);
		handButton06.setSize("45px", "70px");
		
		handButton07 = new Button("");
		handHorizontalPanel.add(handButton07);
		handButton07.setSize("45px", "70px");
		
		handButton08 = new Button("");
		handHorizontalPanel.add(handButton08);
		handButton08.setSize("45px", "70px");
		
		handButton09 = new Button("");
		handHorizontalPanel.add(handButton09);
		handButton09.setSize("45px", "70px");
		
		handButton10 = new Button("");
		handHorizontalPanel.add(handButton10);
		handButton10.setSize("45px", "70px");
		
		handButton11 = new Button("");
		handHorizontalPanel.add(handButton11);
		handButton11.setSize("45px", "70px");
		
		handButton12 = new Button("");
		handHorizontalPanel.add(handButton12);
		handButton12.setSize("45px", "70px");
		
		handButton13 = new Button("");
		handHorizontalPanel.add(handButton13);
		handButton13.setSize("45px", "70px");
		handButton13.setVisible(false);
		
		HorizontalPanel handOptionsHorizontalPanel = new HorizontalPanel();
		rootPanel.add(handOptionsHorizontalPanel);
		
		eastToggleButton = new ToggleButton("East");
		eastToggleButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (eastToggleButton.isDown()) {
					handButton13.setVisible(true);
				}
				else {
					handButton13.setVisible(false);
				}
			}
		});
		handOptionsHorizontalPanel.add(eastToggleButton);
	}
}