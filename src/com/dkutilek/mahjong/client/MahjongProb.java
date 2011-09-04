package com.dkutilek.mahjong.client;

import com.dkutilek.mahjong.client.discard.DiscardPanel;
import com.dkutilek.mahjong.client.hand.HandPanel;
import com.dkutilek.mahjong.client.tiles.AllTiles;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MahjongProb implements EntryPoint {
	
	
	RootPanel rootPanel = RootPanel.get(null);
	private static HandPanel handPanel;
	private static DiscardPanel discardPanel;
	private static AllTiles allTiles;
	private static Label errorLabel;
	private static VerticalPanel debugPanel;
	
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
/*	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);*/

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		errorLabel = new Label();

		RootPanel.get("errorLabelContainer").add(errorLabel);
		
		debugPanel = new VerticalPanel();
		rootPanel.add(debugPanel);
		
		allTiles = new AllTiles();

		discardPanel = new DiscardPanel();
		rootPanel.add(discardPanel);
		
		handPanel = new HandPanel();
		rootPanel.add(handPanel);
	}
	
	/**
	 * Write an error to the error label. This message will overwrite
	 * any previous message.
	 * @param message - Message to be written
	 */
	public static void error(String message) {
		errorLabel.setText(message);
	}
	
	public static void debug(String message) {
		Label label = new Label();
		label.setText(message);
		debugPanel.add(label);
	}
	
	/**
	 * Get all tiles
	 * @return
	 */
	public static AllTiles getAllTiles() {
		return allTiles;
	}
}