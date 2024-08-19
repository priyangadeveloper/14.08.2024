import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                int j = i + 1;
                StringBuilder number = new StringBuilder();

                // Extract the number following the letter
                while (j < input.length() && Character.isDigit(input.charAt(j))) {
                    number.append(input.charAt(j));
                    j++;
                }

                int count = Integer.parseInt(number.toString());

                // Append the letter 'count' times
                for (int k = 0; k < count; k++) {
                    output.append(currentChar);
                }

                i = j - 1; // Move the index to the end of the number
            }
        }

        System.out.println("Output: " + output.toString());
    }
}
