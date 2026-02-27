public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";   // You can change this word
        String reversed = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}