package com.github.ynfeng.designpatterns.decorator;

public abstract class DataSourceDecorator implements DataSource {
    protected final DataSource wrappee;

    protected DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }
}
