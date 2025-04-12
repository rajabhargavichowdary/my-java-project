package ocjpFundamentals;

public class StringExample {
    public static void main(String[] args) {
        // Stored in String Constant Pool
        String s1 = "Hello";
        String s2 = "Hello";

        // Stored in Heap Memory (New Object)
        String s3 = new String("Hello");
        String s4 =new String("Hello");

        // Comparisons
        System.out.println(s1 == s2); // ✅ true (Same reference in SCP)
        System.out.println(s1 == s3); // ❌ false (Different objects in memory)
        System.out.println(s4 == s3);
    }
}