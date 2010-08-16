package com.vaadin.tests.components.window;

import com.vaadin.tests.components.AbstractTestCase;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.Window;

public class WindowScrollingUp extends AbstractTestCase {

    @Override
    protected String getDescription() {
        return "Scroll down, click 'up' and the view should scroll to the top";
    }

    @Override
    protected Integer getTicketNumber() {
        return 4206;
    }

    @Override
    public void init() {
        Table table = new Table();
        table.setPageLength(50);

        final Button up = new Button("up");
        up.addListener(new Button.ClickListener() {

            public void buttonClick(ClickEvent event) {
                up.getWindow().setScrollTop(0);
            }
        });

        setMainWindow(new Window(""));
        getMainWindow().addComponent(table);
        getMainWindow().addComponent(up);

    }
}
