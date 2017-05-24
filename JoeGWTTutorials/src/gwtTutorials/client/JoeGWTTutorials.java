package gwtTutorials.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
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
		
		//create flowpanel
		FlowPanel fPanel = new FlowPanel();
		
		// array of names
		String[] listOfNames = {"Nancy","Joe","Julia","Jared","Nathan"};
		// create and add list box
	   ListBox listBox = new ListBox();
	   for(String listOfName : listOfNames){
		   listBox.addItem(listOfName);   
	   }
		   
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

	   fPanel.add(listBox);
//	   RootPanel.get("gwtMyList").add(listBox);
	   RootPanel.
	   
	   RootPanel.get("gwtGreenButton").add(Btn1);
	   RootPanel.get("gwtRedButton").add(Btn2);
	   
	}
}
