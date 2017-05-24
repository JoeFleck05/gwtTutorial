package gwtTutorials.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class JoeGWTTutorials implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// add button to change font to big when clicked.
	   Button Btn1 = new Button("Big Text");
	   Btn1.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
	         RootPanel.get("mytext").setStyleName("gwt-Big-Text");
	      }
	   });

	   // add button to change font to small when clicked.
	   Button Btn2 = new Button("Small Text");
	   Btn2.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
	         RootPanel.get("mytext").setStyleName("gwt-Small-Text");
	      }
	   });
	   
	   // create and add list box
	   ListBox listBox = new ListBox();
	   listBox.addItem("Joe");
	   listBox.addItem("Nancy");
	   listBox.addItem("Julia");
	   listBox.addItem("Jared");
	   listBox.addItem("Nathan");

	   RootPanel.get("gwtGreenButton").add(Btn1);
	   RootPanel.get("gwtRedButton").add(Btn2);
	   RootPanel.get("gwtMyList").add(listBox);
	}
}
