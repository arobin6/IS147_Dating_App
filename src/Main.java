package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Captcha captcha;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            captcha = new Captcha();
            System.out.println(captcha.getQuestion());
            userInput = scanner.nextInt();
            try {
                captcha.runCheck(userInput);
                System.out.println("Congratulations! CAPTCHA solved successfully!");
                break;
            } catch (InvalidCAPTCHAException e) {
                System.out.println(e.getMessage());
            }
        }

                {
                    System.out.println("Welcome to the IS147 Dating App ");
                    System.out.println("Have you ever had trouble meeting new people with similar interests on college campus?" +
                            "Or are you a social butterfly just searching to meet new people. With this college dating app, you can!" +
                            "This app allows college students to meet people based on their location, interests, and more. Unlike" +
                            "other dating apps, this app is tailored more specific in finding the person for you. It is streamlined," +
                            "easy to use, and has options that fit every type of person. ");


                    System.out.println("Before we get started,please answer the following question below");
                    Scanner userInput1 = new Scanner(System.in);
                    System.out.println("Name?:");
                    String name = userInput1.nextLine();
                    System.out.println(" Age?:");
                    String age = userInput1.nextLine();
                    System.out.println("School or University:");
                    String Uni = userInput1.nextLine();
                    System.out.println("Gender?:");
                    String gender = userInput1.nextLine();
                    System.out.println("Sexuality?:");
                    String sex = userInput1.nextLine();
                    System.out.println("State you live in?:");
                    String state = userInput1.nextLine();
                    System.out.println("***************************************");

                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("School: " + Uni);
                    System.out.println("Gender: " + gender);
                    System.out.println("Sexuality: " + sex);
                    System.out.println("State: " + state);

                    int returnedhobbyString =
                            Hobbies.gethobbyString();

                }
            }
        }

