import java.util.Scanner;

public class EorOwithoutelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = s.nextInt();
        s.close();
        String val = ((n % 2) == 0) ? "Even" : "Odd";
        System.out.println(val);
    }
}
