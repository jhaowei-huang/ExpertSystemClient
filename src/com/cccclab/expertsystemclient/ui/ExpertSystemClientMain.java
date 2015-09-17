package com.cccclab.expertsystemclient.ui;

import com.cccclab.expertsystemclient.design.ExpertSystemClientMainDesign;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

public class ExpertSystemClientMain extends ExpertSystemClientMainDesign {
	public ExpertSystemClientMain() {
		this.leftMenu.addTab(new Button("Btn1-1"), "Tab 1");
		this.leftMenu.addTab(new Button("Label 22"), "Tab 2");
		this.leftMenu.addTab(new Button("Label 33"), "Tab 3");

//		this.leftMenu.addSelectedTabChangeListener(new SelectedTabChangeListener() {
//		      public void selectedTabChange(
//		          SelectedTabChangeEvent event) {
//		        Notification.show("You are watching "
//		            + event.getTabSheet().getSelectedTab());
//		      }
//		    });
	}
}
