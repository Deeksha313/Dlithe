import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        int result = isValidPassword(password) ? 1 : 0;

        System.out.println("Result: " + result);

        sc.close();
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password should be a minimum of 8 characters in length.");
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialCharacter(ch)) {
                hasSpecialChar = true;
            }
        }

        if (!hasUppercase || !hasLowercase || !hasDigit || !hasSpecialChar) {
            System.out.println("Password should contain at least one uppercase, one lowercase, one special character, and one digit.");
            return false;
        }
        if (password.contains(" ")) {
            System.out.println("Password should not contain white space.");
            return false;
        }

        return true;
    }

    private static boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()-_+=<>?/{}[]|";
        return specialCharacters.contains(String.valueOf(ch));
    }
}
