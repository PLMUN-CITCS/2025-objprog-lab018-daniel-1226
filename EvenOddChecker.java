import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Loop to validate input to ensure it's a valid integer
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if valid input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return number;
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        // Step 1: Get the integer input from the user
        int number = getIntegerInput();

        // Step 2: Check if the number is even or odd and store the result message
        String result = checkEvenOrOdd(number);

        // Step 3: Display the result message
        System.out.println(result);
    }
}
