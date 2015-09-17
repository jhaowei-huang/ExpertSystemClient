package com.cccclab.expertsystemclient.ui;

import com.cccclab.expertsystemclient.design.ExpertSystemClientMainDesign;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet.SelectedTabChangeEvent;
import com.vaadin.ui.TabSheet.SelectedTabChangeListener;

public class ExpertSystemClientMain extends ExpertSystemClientMainDesign {
	public ExpertSystemClientMain() {
		this.leftMenu.addTab(new Button("Btn1-1"), "Tab 1");
		this.leftMenu.addTab(new Button("Btn1-2"), "Tab 2");
		this.leftMenu.addTab(new Button("Btn1-3"), "Tab 3");

		this.leftMenu.addSelectedTabChangeListener(new SelectedTabChangeListener() {
			@Override
			public void selectedTabChange(SelectedTabChangeEvent event) {
				// TODO Auto-generated method stub
				Notification.show("current " + event.getTabSheet().getTab(event.getTabSheet().getTabIndex()).getCaption());
			}
		});
	}
}
