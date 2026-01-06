package com.petpal;
import java.util.Scanner;

public class PetPalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pet name -");
        String name = sc.nextLine();

        System.out.print("Enter the pet age - ");
        int age = sc.nextInt();

        System.out.println("Choose the pet type - ");
        System.out.println("1. Dog\n2. Cat\n3. Bird");
        int choice = sc.nextInt();

        Pet pet;

        if (choice==1) {
            pet=new Dog(name,age);
        } else if(choice == 2) {
            pet=new Cat(name,age);
        } else{
            pet=new Bird(name,age);
        }

        pet.makeSound();
        pet.displayStatus();

        System.out.println("\nChoose an action:");
        System.out.println("1. Feed\n2. Play\n3. Sleep");
        int action = sc.nextInt();

        if (action==1)
            pet.feed();
        else if (action==2)
            pet.play();
        else
            pet.sleep();

        pet.displayStatus();

        sc.close();
    }
}
