package io.t3w.desafio.components;

import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;

public class T3WBinder<T> extends Binder<T> {

    public T3WBinder(final T bean) {
        setBean(bean);
    }

    @Override
    public void writeBean(final T t) {
        try{
            super.writeBean(t);
        } catch (final ValidationException ex) {
            throw new RuntimeException(ex);
        }
    }

    public T getObject() {
        writeBean(getBean());
        return getBean();
    }
}
