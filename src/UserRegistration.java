import java.util.Scanner;public class UserRegistration {
    private static final Scanner scan = new Scanner(System.in);
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{6,19}$";

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UserRegistration.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}