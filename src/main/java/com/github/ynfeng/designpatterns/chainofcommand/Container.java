package com.github.ynfeng.designpatterns.chainofcommand;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component {
    private final List<Component> children = new ArrayList<>();

    public Container(String tooltipText) {
        super(tooltipText);
    }

    public void add(Component child) {
        children.add(child);
        child.container(this);
    }
}
