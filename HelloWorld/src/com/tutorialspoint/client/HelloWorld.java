package com.tutorialspoint.client;

//import com.google.gwt.core.client.EntryPoint;
//import com.google.gwt.event.dom.client.ClickEvent;
//import com.google.gwt.event.dom.client.ClickHandler;
//import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.HTML;
//import com.google.gwt.user.client.ui.RootPanel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

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
		
		/**
	     * create textbox and attach key down handler
	     */
		TextBox textBox = new TextBox();
		textBox.addKeyDownHandler(new MyKeyDownHandler());
		
		/*
	     * create button and attach click handler
	     */
		Button button = new Button("Click Me!");
		button.addClickHandler(new MyClickHandler());
		
		VerticalPanel vP = new VerticalPanel();
		vP.addStyleName("Main Panel");
		vP.setSpacing(10);
		vP.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vP.add(textBox);
		vP.add(button);
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.addStyleName("decorator Panel");
		decoratorPanel.add(vP);
		RootPanel.get("gwtContainer").add(decoratorPanel);
		
//		// add button to change font to big when clicked.
//	   Button Btn1 = new Button("Big Text");
//	   Btn1.addStyleName("gwt-Green-Text");
//	   Btn1.addClickHandler(new ClickHandler() {
//	      public void onClick(ClickEvent event) {
//	         RootPanel.get("mytext").setStyleName("gwt-Big-Text");
//	      }
//	   });
//
//	   // add button to change font to small when clicked.
//	   Button Btn2 = new Button("Small Text");
//	   Btn2.addStyleName("gwt-Red-Text");
//	   Btn2.addClickHandler(new ClickHandler() {
//	      public void onClick(ClickEvent event) {
//	         RootPanel.get("mytext").setStyleName("gwt-Small-Text");
//	      }
//	   });
//
//	   RootPanel.get("gwtGreenButton").add(Btn1);
//	   RootPanel.get("gwtRedButton").add(Btn2);
	}
	
	/** 
    * create a custom click handler which will call 
    * onClick method when button is clicked.
    */
   private class MyClickHandler implements ClickHandler {
      @Override
      public void onClick(ClickEvent event) {
         Window.alert("Hello World!");
      }
   }

   /**
    * create a custom key down handler which will call 
    * onKeyDown method when a key is down in textbox.
    */
   private class MyKeyDownHandler implements KeyDownHandler {
      @Override
      public void onKeyDown(KeyDownEvent event) {
         if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER){
            Window.alert(((TextBox)event.getSource()).getValue());
         }
      }
   }
}