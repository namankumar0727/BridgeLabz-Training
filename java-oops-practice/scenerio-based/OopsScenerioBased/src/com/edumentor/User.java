package com.edumentor;
abstract class User {
	
	//Declaration
    protected int userId;
    protected String name;
    protected String email;

    //Constructor
    User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    abstract void printDetails();
}
