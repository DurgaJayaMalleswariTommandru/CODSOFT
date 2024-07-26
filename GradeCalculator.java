import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input marks obtained in each subject
        System.out.println("Enter marks obtained in each subject out of 100:");
        System.out.print("Subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = sc.nextInt();
        System.out.print("Subject 4: ");
        int subject4=sc.nextInt();
        System.out.print("Subject 5: ");
        int subject5=sc.nextInt();
        System.out.print("Subject 6: ");
        int subject6=sc.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / 6;

        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
