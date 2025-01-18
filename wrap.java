import java.util.Scanner;

public class wrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input as a string
        System.out.print("Enter a number as a string: ");
        String inputString = scanner.nextLine();

        try {
            // Convert the string to an integer
            int number = Integer.parseInt(inputString);

            // Check if the number is a factor of 5
            if (number % 5 == 0) {
                System.out.println("The number " + number + " is a factor of 5.");
            } else {
                System.out.println("The number " + number + " is not a factor of 5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}
