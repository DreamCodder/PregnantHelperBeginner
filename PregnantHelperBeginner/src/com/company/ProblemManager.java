package com.company;

import java.util.Scanner;

public class ProblemManager extends PregnantManager {
    public void Problems() {
        String Sickness;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Pregnant Time");
        int pregnantTime = getPregnantTime();
        pregnantTime = keyboard.nextInt();  //Month
        switch (pregnantTime) {
            case 1:
                System.out.println("What is the problem ? ");
                System.out.println("Write -->'reflux'\n" +
                        "Write -->'dropsy'-\n" +
                        "Write -->'stomach ache' \n"
                );
                Sickness = keyboard.next();
                switch (Sickness) {
                    case "reflux":
                        System.out.println("Drink Water ");
                        break;
                    case "dropsy":
                        System.out.println("not drinking too much water");
                        break;
                    case "stomach ache":
                        System.out.println("Go to hospital");
                        break;
                    default:
                        System.out.println("I dont Understand");
                }
            case 2:
                System.out.println("What is the problem ? ");
                System.out.println("Write -->'Nausea'\n" +
                        "Write -->'heartburn'-\n" +
                        "Write -->'headaches' \n"
                );
                Sickness = keyboard.next();
                switch (Sickness) {
                    case "Nausea":
                        System.out.println("1-Create a Sleep Pattern.\n" +
                                "2-For Sufficient Amount of Water\n" +
                                "3-Use Aromatic Oils\n" +
                                "4-Benefit from Herbal Teas.\n" +
                                "5-Apply Bag of Cold or Hot Water.\n" +
                                "6-Massage\n" +
                                "7-Refer to Breathing Exercises.\n" +
                                "8-Take a Warm Shower ");
                        break;
                    case "heartburn":
                        System.out.println("Peppermint lemon tea significantly relieves chest pain.\n" +
                                " It also allows you to remove the sputum formed in the chest. \n" +
                                "If the problem does not go away, go to the hospital.");
                        break;
                    case "headaches":
                        System.out.println("Go to hospital");
                        break;
                    default:
                        System.out.println("I dont Understand");

                }
                break;

                                       //ONLY DEMO
        }
    }
}



