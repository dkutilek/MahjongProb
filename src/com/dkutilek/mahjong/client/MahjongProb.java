package com.dkutilek.mahjong.client;

import com.dkutilek.mahjong.shared.Images;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MahjongProb implements EntryPoint {
	
	
	RootPanel rootPanel = RootPanel.get(null);
	private static HandPanel handPanel;
	private static Images imagesConst = new Images();

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

		RootPanel.get("errorLabelContainer").add(errorLabel);
		
		handPanel = new HandPanel();
		rootPanel.add(handPanel);
	}
	
	public static Images getImagesConst() {
		return imagesConst;
	}
	
}