import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base condition: crossed or met in the middle
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Mismatch found
        }
        return isPalindrome(str, start + 1, end - 1); // Recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is not a Palindrome.");
        }

        sc.close();
    }
}
