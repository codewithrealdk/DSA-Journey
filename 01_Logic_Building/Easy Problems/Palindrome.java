// Check if a number is Palindrome
// Given an integer n, determine whether it is a palindrome number or not. A number is called a palindrome if it reads the same from forward and backward.
// Examples:

// Input: n = 12321
// Output: True
// Explanation: 12321 is a palindrome number because it reads same  forward and backward.

// Input: n = 1234
// Output:  False
// Explanation: 1234 is not a palindrome number because it does not read the same forward and backward.

public class Palindrome {
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverse = 0;

        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
        System.out.println(isPalindrome(10123));
    }
}
