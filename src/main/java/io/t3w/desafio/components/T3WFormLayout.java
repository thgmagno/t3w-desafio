package io.t3w.desafio.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.formlayout.FormLayout;
import org.vaadin.firitin.components.formlayout.VFormLayout;

public class T3WFormLayout extends VFormLayout {

    public T3WFormLayout() {
        this.getStyle().set("--vaadin-form-layout-column-spacing", "0.8rem");
        this.withResponsiveSteps(
            new FormLayout.ResponsiveStep("0px", 1),
            new FormLayout.ResponsiveStep("350px", 2),
            new FormLayout.ResponsiveStep("550px", 4),
            new FormLayout.ResponsiveStep("820px", 6),
            new FormLayout.ResponsiveStep("1200px", 8),
            new FormLayout.ResponsiveStep("1600px", 12)
        );
    }

    public T3WFormLayout(final Component... components) {
        this();
        this.withComponents(components);
    }
}
