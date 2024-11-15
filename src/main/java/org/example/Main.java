package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "GenofIT";
        String userAnswer;

        while (true) {
            System.out.println("რომელი კომპანიაში მუშაობთ?");
            userAnswer = scanner.nextLine();


            if (userAnswer.equals(correctAnswer)) {
                System.out.println("პასუხი სწორია! ");
                break;
            } else {
                System.out.println("პასუხი არასწორია!");
            }
        }
        scanner.close();



            }


        }


