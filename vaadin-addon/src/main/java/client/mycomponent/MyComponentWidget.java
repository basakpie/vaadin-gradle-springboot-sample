package client.mycomponent;

import com.google.gwt.user.client.ui.Label;

/**
 * Client side widget. Can extend any GWT widget.
 */
public class MyComponentWidget extends Label {

	// Style name used for theming
    public static final String CLASSNAME = "mycomponent";

    public MyComponentWidget() {
        setStyleName(CLASSNAME);
    	setText("Hello World!, Building Spring Boot Vaadin applications with Gradle");
    }
}