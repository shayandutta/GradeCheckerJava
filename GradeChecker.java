import java.util.Scanner;

public class GradeChecker {
    public static void validateGrade(char grade) throws InvalidGradeException {
        if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'F') {
            throw new InvalidGradeException("Invalid grade entered! Allowed grades: A, B, C, D, F.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your grade (A, B, C, D, F): ");
            char grade = scanner.next().toUpperCase().charAt(0);

            validateGrade(grade);
            System.out.println("You entered a valid grade: " + grade);

        } catch (InvalidGradeException e) {
            // Handling custom exception
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            // Handling unexpected exceptions
            System.out.println("Error: Invalid input. Please enter a valid grade.");

        } 
    }
}
