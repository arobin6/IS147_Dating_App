
import java.util.Scanner;
public class Question {
    public static int getQuestionString() {
        Scanner in = new Scanner(System.in);


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
        System.out.println("What is your occupation:");
        String occupation = userInput1.nextLine();
        System.out.println("What is your biggest pet peeve?:");
        String petpeeve = userInput1.nextLine();
        System.out.println("How many relationships have you been in?:");
        String pastrelationship = userInput1.nextLine();
        System.out.println("Are you looking for something casual, serious or in between?:");
        String relationshipdesire = userInput1.nextLine();
        System.out.println("What is your idea of a first date?:");
        String datepreference = userInput1.nextLine();

        System.out.println("Please type the number for your first hobby out of the list: ");
        System.out.println("1-Movies, 2-Hiking, 3-Coffee, 4-Travelling, and 5-Art.");

        int hobby = in.nextInt();
        String hobbyString;

        switch (hobby) {
            case 1:
                hobbyString = "Movies";
                break;
            case 2:
                hobbyString = "Hiking";
                break;
            case 3:
                hobbyString = "Coffee";
                break;
            case 4:
                hobbyString = "Travelling";
                break;
            case 5:
                hobbyString = "Art";
                break;
            default:
                hobbyString = "Invalid hobby";
        }

        System.out.println("You have chosen " + hobbyString + ".");

        System.out.print("Now please type the second hobby out of the list: ");
        System.out.println("1-Movies, 2-Hiking, 3-Coffee, 4-Travelling, and 5-Art.");

        int hobby1 = in.nextInt();
        String hobby1String;

        switch (hobby1) {
            case 1:
                hobby1String = "Movies";
                break;
            case 2:
                hobby1String = "Hiking";
                break;
            case 3:
                hobby1String = "Coffee";
                break;
            case 4:
                hobby1String = "Travelling";
                break;
            case 5:
                hobby1String = "Art";
                break;
            default:
                hobby1String = "Invalid hobby";
        }


        System.out.println( " " );
        System.out.println( name+"'s Dating Profile Information " );
        System.out.println("--------------------------------" );
        System.out.println("Age: " + age);
        System.out.println("School: " + Uni);
        System.out.println("Gender: " + gender);
        System.out.println("Sexuality: " + sex);
        System.out.println("State: " + state);
        System.out.println("You're Hobbies are: " + hobbyString + " and " + hobby1String + ".");
        System.out.println("Occupation:" +occupation);
        System.out.println("Petpeeve:" +petpeeve);
        System.out.println("Number of previous relationship:" +pastrelationship);
        System.out.println("Relationship Desire: " +relationshipdesire);
        System.out.println("Idea of a first date:" +datepreference);
        System.out.println("----------------------------------");
        java.util.Date date = new java.util.Date();
        System.out.println("Created on:" +date.toString());

        return hobby;
    }
}
