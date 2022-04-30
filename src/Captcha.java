public class Captcha {
    private int x;
    private int y;
    // Assuming we will generate random number between 1 and 100 to keep the math problem simple
    private static final int max = 100;
    private static final int min = 1;

    public Captcha() {
        // Math.random() gives any random number between 0 and 1, thus for 0 value we will get min and for 1 value we will get max and for anything in between 0 and 1, we will get value between min and max
        x = (int) (Math.random()*(max-min+1)+min);
        y = (int) (Math.random()*(max-min+1)+min);
    }

    // getters and setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // get the question on screen
    public String getQuestion() {
        return "What is " + getX() + " + " + getY() + "?";
    }

    // method to check the captcha code is correct or not, if not then throws custom exception
    public void runCheck(int num) throws InvalidCAPTCHAException {
        if (getX() + getY() != num) {
            throw new InvalidCAPTCHAException("Invalid CAPTCHA Code! Please try again.");
        }
    }
}


