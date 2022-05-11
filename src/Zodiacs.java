import java.util.Scanner;
public class Zodiacs {
    static Scanner Userinput2 = new Scanner(System.in);

    public static String getZodiacsString
            () {

        System.out.println("Enter your birth month: ");
        String month = Userinput2.nextLine();

        switch (month) {
            case "January":
            case "january":
                System.out.println("Your zodiac sign is: Capricorn");
                break;

            case "February":
            case "february":
                System.out.println("Your zodiac sign is: Aquarius.");
                break;

            case "March":
            case "march":
                System.out.println("Your zodiac sign is: Pisces.");
                break;

            case "April":
            case "april":
                System.out.println("Your zodiac sign is: Aries.");
                break;

            case "May":
            case "may":
                System.out.println("Your zodiac sign is: Taurus.");
                break;

            case "June":
            case "june":
                System.out.println("Your zodiac sign is: Gemini.");
                break;

            case "July":
            case "july":
                System.out.println("Your zodiac sign is: Cancer.");
                break;

            case "August":
            case "august":
                System.out.println("Your zodiac sign is: Leo.");
                break;

            case "September":
            case "september":
                System.out.println("Your zodiac sign is: Virgo.");
                break;

            case "October":
            case "october":
                System.out.println("Your zodiac sign is: Libra.");
                break;

            case "November":
            case "november":
                System.out.println("Your zodiac sign is: Scorpio.");
                break;

            case "December":
            case "december":
                System.out.println("Your zodiac sign is: Sagittarius.");
                break;

            default:
                System.out.println("Not a valid month. Please try again.");


        }


        return month;
    }
}




