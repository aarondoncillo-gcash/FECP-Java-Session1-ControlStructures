package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String memberStatus;
        int age;
        float price =0f;
        // Get member status
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        memberStatus = sc.nextLine();
        // Get age
        System.out.print("Enter age: ");
        age = sc.nextInt();

        // Calculate price
        switch (memberStatus.toLowerCase()){
            case "regular":
            {
                if (age < 18)
                    price = 50f;
                else if (age >= 18 && age <= 64)
                    price = 100f;
                else if (age > 64)
                    price = 75f;
                System.out.printf("Price: $%.2f", price);
                break;
            }
            case "vip" :
            {
                if (age < 18)
                    price = 75f;
                else if (age >= 18 && age <= 64)
                    price = 150f;
                else if (age > 64)
                    price = 112.5f;
                System.out.printf("Price: $%.2f", price);
                break;
            }
            case "premium" :
            {
                if (age < 18)
                    price = 100f;
                else if (age >= 18 && age <= 64)
                    price = 200f;
                else if (age > 64)
                    price = 150f;
                System.out.printf("Price: $%.2f", price);
                break;
            }
            default:
                System.out.println("Invalid membership status entered.");
        }
    }
}