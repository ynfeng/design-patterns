package com.github.ynfeng.designpatterns.command;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> stack = new Stack();

    public void push(Command command) {
        stack.push(command);
    }

    public Command pop() {
        return stack.pop();
    }
}
