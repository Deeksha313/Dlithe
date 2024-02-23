import java.util.Scanner;

public class ExamQualification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Prelims Marks:");
        int prelimsMarks = scanner.nextInt();

        // Checking qualification for prelims
        if (prelimsMarks >= 150 && prelimsMarks <= 200) {
            System.out.println("Enter the Mains marks:");
            int[] mainsMarks = new int[4];
            for (int i = 0; i < 4; i++) {
                mainsMarks[i] = scanner.nextInt();
            }

            // Checking qualification for mains
            if (checkMainsQualification(mainsMarks)) {
                System.out.println(1); // Devid qualifies for mains
            } else {
                System.out.println(0); // Devid does not qualify for mains
            }
        } else {
            System.out.println(0); // Devid does not qualify for prelims
        }

        scanner.close();
    }

    // Function to check qualification for mains
    public static boolean checkMainsQualification(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            if (mark < 40) {
                return false; // Minimum 40 marks required in each subject
            }
            sum += mark;
        }
        double average = (double) sum / marks.length;
        return average > 50; // Average marks must be more than 50%
    }
}
