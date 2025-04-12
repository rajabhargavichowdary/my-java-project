package ocjpFundamentals;

import java.util.Scanner;

public class FileEOFFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 1;

        while (scanner.hasNext()) {  // Loop until EOF
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        Object obj = new Object();

        scanner.close();
    }
}
