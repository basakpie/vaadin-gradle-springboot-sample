package com.example.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import server.mycomponent.MyComponent;

@SpringUI
@Theme("Demo")
public class DemoUI extends UI{
	
	@Override
	protected void init(VaadinRequest request){
		MyComponent addon = new MyComponent();
		Button button = new Button("Click");
		button.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				Notification.show("It works!");
			}
		});

		VerticalLayout layout = new VerticalLayout();
		layout.addComponent(addon);
		layout.addComponent(button);

		setContent(layout);
	}
}
