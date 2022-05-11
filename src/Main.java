
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Before you proceed, please complete the captcha below.");
        Captcha captcha;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) { // infinite loop
            captcha = new Captcha(); // create new instance
            System.out.println(captcha.getQuestion());// print captcha question
            userInput = scanner.nextInt();// take input from user
            try {
                captcha.runCheck(userInput);// call run check
                System.out.println("Congratulations! CAPTCHA solved successfully!");
                break; // break infinite loop
            } catch (InvalidCAPTCHAException e) {
                System.out.println(e.getMessage());// in case of failure print error message and dont break loop
            }
        }

                {
                    System.out.println("Welcome to the IS147 Dating App ");
                    System.out.println("Have you ever had trouble meeting new people with similar interests on college campus?" +
                            " Or are you a social butterfly just searching to meet new people. With this college dating app, you can!" +
                            " This app allows college students to meet people based on their location, interests, and more. Unlike" +
                            " other dating apps, this app is tailored more specific in finding the person for you. It is streamlined," +
                            " easy to use, and has options that fit every type of person. ");



                    int returnedQuestionString =
                            Question.getQuestionString();

                    String returnedZodiacString =
                            Zodiacs.getZodiacsString();

                    String returnedgetAddressString =
                            Address.getAddressString();

                    java.util.Date date = new java.util.Date();
                    System.out.println("Created on:" + date.toString());
                    System.out.println("*************************");
                    System.out.println("THE END");
                }
            }
        }
