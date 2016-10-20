package client.mycomponent;

import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import server.mycomponent.MyComponent;

/**
 * Connects the server side component with the client side widget
 */
@Connect(MyComponent.class)
public class MyComponentConnector extends AbstractComponentConnector {

    @Override
    public MyComponentWidget getWidget() {
        return (MyComponentWidget) super.getWidget();
    }
}

