
import java.util.Scanner;
Public class Hobbies{
public static int gethobbyString() {
 Scanner in = new Scanner(System.in);

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
        System.out.println("You have chosen " + hobbyString + " and " + hobby1String + ".");
         return hobby;
    }
    
   } 