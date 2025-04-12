package ocjpFundamentals;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CreateSeries {

    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            
            int t = in.nextInt();   // Number of queries
            
            //java 15 introduced concept : 
            IntStream.range(0, t).forEach(i -> {
                var a = in.nextInt();
                var b = in.nextInt();
                var n = in.nextInt();

                // Calculate and print the series
                int current = a;
                StringBuilder result = new StringBuilder();

                for (int j = 0; j < n; j++) {
                    current += Math.pow(2, j) * b;
                    result.append(current).append(" ");
                }
                
                System.out.println(result.toString().trim());
            });
        }
    }
}
