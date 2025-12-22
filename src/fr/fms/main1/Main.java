package fr.fms.main1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.max;

class Main {

    static void main(String[] args){
        displayNameAndDate();
        askAndDisplayName();
        fizzAndBuzz();
        maxValueInArray();
    }

    static void displayNameAndDate(){
        LocalDate date = LocalDate.now();
        IO.println("Bonjour Jo!" + " " + date);
    }

    static void askAndDisplayName(){
        Scanner input = new Scanner(System.in);
        IO.println("Enter your name:");
        String userName = input.nextLine();

        IO.println("Enter your age:");
        int age = input.nextInt();
        input.close();

        System.out.println("Salut " + userName + ", tu as " + age + " ans.");
    }

    static void fizzAndBuzz(){
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    static void maxValueInArray(){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println("Le plus grand chiffre de la liste est : " + max(list));
    }
}

