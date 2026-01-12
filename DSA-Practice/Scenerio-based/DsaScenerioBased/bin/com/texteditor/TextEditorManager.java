package com.texteditor;
import java.util.Stack;

public class TextEditorManager {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert the required text
    public void insertText(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear(); 
        System.out.println("Text inserted.");
    }

    // Delete the required text
    public void deleteText(int length) {
        if (length > content.length()) {
            System.out.println("Delete length exceeds content.");
            return;
        }

        String deletedText = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new Action("delete", deletedText));
        redoStack.clear();
        System.out.println("Text deleted.");
    }

    // Implementation of the Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("delete")) {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo successful.");
    }

    // IMplementation of the Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content += action.text;
        } else if (action.type.equals("delete")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo successful.");
    }

    // Display current content
    public void displayContent() {
        System.out.println("\nCurrent Text: \"" + content + "\"");
    }
}
