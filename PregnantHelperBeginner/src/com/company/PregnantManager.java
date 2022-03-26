package com.company;

import java.util.Scanner;

public class PregnantManager extends Pregnant {
    public void add() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter FirstName : ");
        String firstName = getFirstName();
        firstName = keyboard.next();
        System.out.print("Enter LastName : ");
        String lastName = getLastName();
        lastName = keyboard.next();
        System.out.print("Enter Old : ");
        int old = getOld();
        old = keyboard.nextInt();

    }
}

