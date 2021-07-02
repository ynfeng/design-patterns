package com.github.ynfeng.designpatterns.command;

public class Application {
    public String clipboard;
    public Editor editor = new Editor();
    private CommandHistory commandHistory = new CommandHistory();
    public Button copyButton;
    public Button cutButton;
    public Button pasteButton;
    public Button undoButton;


    public void undo() {
        commandHistory.pop().undo();
    }

    public void executeCommand(Command command) {
        commandHistory.push(command);
        command.execute();
    }

    public void createUI() {
        CopyCommand copyCommand = new CopyCommand(this, editor);
        copyButton = new Button(this, copyCommand);

        PasteCommand pasteCommand = new PasteCommand(this, editor);
        pasteButton = new Button(this, pasteCommand);

        CutCommand cutCommand = new CutCommand(this, editor);
        cutButton = new Button(this, cutCommand);

        UndoCommand undoCommand = new UndoCommand(this, editor);
        undoButton = new Button(this, undoCommand);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createUI();

        application.editor.text = "some text";

        application.copyButton.click();
        System.out.println(application.editor.text);

        application.pasteButton.click();
        System.out.println(application.editor.text);

        application.undoButton.click();
        System.out.println(application.editor.text);

        application.cutButton.click();
        System.out.println(application.editor.text);

        application.pasteButton.click();
        System.out.println(application.editor.text);

    }
}
