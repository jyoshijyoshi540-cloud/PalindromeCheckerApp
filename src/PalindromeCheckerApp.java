public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // You can change this word
        char[] characters = word.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        // Compare characters from both ends
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Word: " + word);

        if (isPalindrome) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}