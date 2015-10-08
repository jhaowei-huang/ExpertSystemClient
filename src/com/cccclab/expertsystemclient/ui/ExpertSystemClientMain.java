package com.cccclab.expertsystemclient.ui;

import com.cccclab.expertsystemclient.design.ExpertSystemClientMainDesign;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet.SelectedTabChangeEvent;
import com.vaadin.ui.TabSheet.SelectedTabChangeListener;

public class ExpertSystemClientMain extends ExpertSystemClientMainDesign {
	public ExpertSystemClientMain() {
		MenuItem mi_file = this.menu.addItem("File", null);
		mi_file.addItem("New", null, null);
		mi_file.addItem("Open", null, null);
		mi_file.addItem("Save", null, null);
		
		MenuItem mi_edit = this.menu.addItem("Edit", null);
		mi_edit.addItem("add object", null, null);
		mi_edit.addItem("add event", null, null);
		mi_edit.addItem("add sensor", null, null);
		mi_edit.addItem("undo", null, null);
		mi_edit.addItem("redo", null, null);
		
		MenuItem mi_simu  = this.menu.addItem("simulator", null);
		mi_simu.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				
				
			}
			
		});
		
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
