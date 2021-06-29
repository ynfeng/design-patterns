package com.github.ynfeng.designpatterns.chainofcommand;

public class Component implements ComponentWithContextualHelp {
    private final String tooltipText;
    private Container container;

    public Component(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    @Override
    public void showHelp() {
        if (tooltipText != null && !tooltipText.equals("")) {
            System.out.println(tooltipText);
        } else if (container != null) {
            container.showHelp();
        }
    }

    public void container(Container container) {
        this.container = container;
    }
}
