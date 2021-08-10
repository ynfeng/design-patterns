package com.github.ynfeng.designpatterns.mediator;

public class AuthenticationDialog implements Mediator {
    private String title;
    private Textbox username;
    private Textbox password;
    private Button ok;
    private Button cancle;
    private Checkbox rememberMe;

    private boolean isRememberMe;

    public AuthenticationDialog() {
        username = new Textbox(this);
        password = new Textbox(this);
        ok = new Button(this);
        cancle = new Button(this);
        rememberMe = new Checkbox(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == rememberMe) {
            isRememberMe = ((Checkbox) sender).isChecked();
            System.out.println("is remember me is " + isRememberMe);
        }
        if (sender == ok) {
            System.out.println("login with");
        }
        if (sender == cancle) {
            System.out.println("cancle");
        }
    }
}
