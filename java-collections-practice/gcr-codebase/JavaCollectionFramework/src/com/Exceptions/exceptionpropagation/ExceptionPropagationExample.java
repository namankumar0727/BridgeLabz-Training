package com.Exceptions.exceptionpropagation;
public class ExceptionPropagationExample {

    static void method1() {
        // Exception occurs here
        int result = 10 / 0;   // ArithmeticException
        System.out.println(result);
    }

    static void method2() {
        // No handling here → exception propagates
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
