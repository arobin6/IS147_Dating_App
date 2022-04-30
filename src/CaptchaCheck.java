import java.util.Scanner;

public class CaptchaCheck {
    public static void main(String[] args) {
        Captcha captcha;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while(true) { // infinite loop
            captcha = new Captcha(); // create new instance
            System.out.println(captcha.getQuestion()); // print captcha question
            userInput = scanner.nextInt(); // take input from user
            try {
                captcha.runCheck(userInput); // call run check
                // if runCheck method call doesnt fail then it wont go in catch block and will implement rest of code in try block
                System.out.println("Congratulations! CAPTCHA solved successfully!"); // Success message prints
                break; // break infinite loop
            } catch (InvalidCAPTCHAException e) {
                System.out.println(e.getMessage()); // in case of failure print error message and dont break loop
            }
        }
    }
}

