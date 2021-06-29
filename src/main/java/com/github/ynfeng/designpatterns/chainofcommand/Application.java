package com.github.ynfeng.designpatterns.chainofcommand;

public class Application {
    private Button ok;

    void createUI() {
        Dialog dialog = new Dialog("dialog help");
        Panel panel = new Panel("");
        ok = new Button("");
        Button cancle = new Button("cancle button help.");
        panel.add(ok);
        panel.add(cancle);
        dialog.add(panel);
    }

    void onF1KeyPress() {
        ok.showHelp();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createUI();
        application.onF1KeyPress();
    }

}
