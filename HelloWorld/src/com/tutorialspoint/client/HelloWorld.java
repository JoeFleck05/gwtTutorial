package com.tutorialspoint.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloWorld implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";
	public void onModuleLoad() {
		// add button to change font to big when clicked.
	   Button Btn1 = new Button("Big Text");
	   Btn1.addStyleName("gwt-Green-Text");
	   Btn1.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
	         RootPanel.get("mytext").setStyleName("gwt-Big-Text");
	      }
	   });

	   // add button to change font to small when clicked.
	   Button Btn2 = new Button("Small Text");
	   Btn2.addStyleName("gwt-Red-Text");
	   Btn2.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
	         RootPanel.get("mytext").setStyleName("gwt-Small-Text");
	      }
	   });

	   RootPanel.get("gwtGreenButton").add(Btn1);
	   RootPanel.get("gwtRedButton").add(Btn2);
	}
}
