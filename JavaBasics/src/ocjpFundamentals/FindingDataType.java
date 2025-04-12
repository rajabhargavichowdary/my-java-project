package ocjpFundamentals;

import java.util.Scanner;

public class FindingDataType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases
        scanner.nextLine();         // Consume the newline

        for (int i = 0; i < t; i++) {
            try {
                // Read the number as a long to avoid immediate overflow
                long num = scanner.nextLong();

                System.out.println(num + " can be fitted in:");
                
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
