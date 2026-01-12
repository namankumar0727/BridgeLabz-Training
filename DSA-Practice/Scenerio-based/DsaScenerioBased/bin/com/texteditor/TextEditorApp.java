package com.texteditor;
import java.util.Scanner;

public class TextEditorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditorManager editor = new TextEditorManager();

        while (true) {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Display Text");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert - ");
                    editor.insertText(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete - ");
                    editor.deleteText(sc.nextInt());
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.displayContent();
                    break;

                case 6:
                    System.out.println("Exiting Text Editor.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
