import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {"StudentA", "StudentB"};
        String[] subjects = {"Web", "Java", "Korea", "Database"};
        double[][] scores = new double[2][4];
//       double average = 0;
//       double totalScore ;

        for (int i = 0; i < students.length; i++) {
            System.out.println("=== Enter " + students[i] + " Scores ===");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < students.length; i++) {
            double total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            double avg = total / 4;

            System.out.println("==== " + students[i] + " Scores ====");
            System.out.println("Total scores: " + total);
            System.out.println("Average scores: " + avg);
            System.out.println("=========================");
        }
        sc.close();
    }
}
