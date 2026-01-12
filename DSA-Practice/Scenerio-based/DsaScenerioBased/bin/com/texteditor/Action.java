package com.texteditor;
public class Action {
	// insert or delete
	String type;   
    String text;

    //Constructor
    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
