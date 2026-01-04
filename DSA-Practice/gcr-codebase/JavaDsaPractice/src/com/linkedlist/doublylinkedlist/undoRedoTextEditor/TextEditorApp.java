package com.linkedlist.doublylinkedlist.undoRedoTextEditor;

public class TextEditorApp {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World!!!"); 
        editor.displayCurrentState();

        System.out.println();
        editor.displayHistory();
    }
}
