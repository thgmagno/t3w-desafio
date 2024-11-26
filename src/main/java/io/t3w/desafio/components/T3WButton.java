package io.t3w.desafio.components;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import org.vaadin.firitin.components.button.VButton;

public class T3WButton extends VButton {

    public T3WButton() {
    }

    public T3WButton(final Component icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(icon, clickListener);
    }

    public T3WButton(final Icon icon, final BasicClickListener clickListener) {
        super(icon, clickListener);
    }

    public T3WButton(final Icon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(icon, clickListener);
    }

    public T3WButton(final Icon icon) {
        super(icon);
    }

    public T3WButton(final VaadinIcon icon, final BasicClickListener clickListener) {
        super(icon, clickListener);
    }

    public T3WButton(final VaadinIcon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(icon, clickListener);
    }

    public T3WButton(final VaadinIcon icon) {
        super(icon);
    }

    public T3WButton(final String text, final Icon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(text, icon, clickListener);
    }

    public T3WButton(final String text, final VaadinIcon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(text, icon, clickListener);
    }

    public T3WButton(final Icon icon, final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(icon, text, clickListener);
    }

    public T3WButton(final VaadinIcon icon, final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(icon, text, clickListener);
    }

    public T3WButton(final String text, final Icon icon, final BasicClickListener clickListener) {
        super(text, icon, clickListener);
    }

    public T3WButton(final String text, final VaadinIcon icon, final BasicClickListener clickListener) {
        super(text, icon, clickListener);
    }

    public T3WButton(final String text, final VaadinIcon icon) {
        super(text, icon);
    }

    public T3WButton(final String text, final Icon icon) {
        super(text, icon);
    }

    public T3WButton(final VaadinIcon icon, final String text) {
        super(icon, text);
    }

    public T3WButton(final Icon icon, final String text) {
        super(icon, text);
    }

    public T3WButton(final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
        super(text, clickListener);
    }

    public T3WButton(final String text, final BasicClickListener clickListener) {
        super(text, clickListener);
    }

    public T3WButton(final String text) {
        super(text);
    }

    public T3WButton themeSmall() {
        addThemeVariants(ButtonVariant.LUMO_SMALL);
        return this;
    }

    public T3WButton themeLarge() {
        addThemeVariants(ButtonVariant.LUMO_LARGE);
        return this;
    }

    public T3WButton themeTertiary() {
        addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        return this;
    }

    public T3WButton themeTertiaryInline() {
        addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
        return this;
    }

    public T3WButton themePrimary() {
        addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        return this;
    }

    public T3WButton themeSuccess() {
        addThemeVariants(ButtonVariant.LUMO_SUCCESS);
        return this;
    }

    public T3WButton themeWarning() {
        addThemeVariants(ButtonVariant.LUMO_WARNING);
        return this;
    }

    public T3WButton themeError() {
        addThemeVariants(ButtonVariant.LUMO_ERROR);
        return this;
    }

    public T3WButton themeContrast() {
        addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        return this;
    }

    public T3WButton themeIcon() {
        addThemeVariants(ButtonVariant.LUMO_ICON);
        return this;
    }
}
