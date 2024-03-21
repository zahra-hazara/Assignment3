import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.next();

        int decimalValue = 0;

        // Convert binary to decimal
        for(int i = 0; i < binaryString.length(); i++) {
            // Get each character and convert it to a number (0 or 1)
            int binaryDigit = binaryString.charAt(i) - '0';

            // Calculate the decimal value
            decimalValue = decimalValue * 2 + binaryDigit;
        }

        // Display the decimal equivalent
        System.out.println("Decimal equivalent: " + decimalValue);

        // Close the scanner
        scanner.close();
    }
}
