public class Palindrome {

    public static void main(String[] args) {
        
        // Predefined string for testing
        String original = "A man, a plan, a canal, Panama";
        
        // Convert string to lowercase to make the check case-insensitive
        String formattedString = original.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Call the function to check if the string is a palindrome
        if (isPalindrome(formattedString)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
