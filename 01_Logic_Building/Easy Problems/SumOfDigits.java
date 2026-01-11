// Problem Statement:-
// // Given a number n, find the sum of its digits.
// // Examples : 
// // Input: n = 687
// // Output: 21
// // Explanation: The sum of its digits are: 6 + 8 + 7 = 21

// // Input: n = 12
// // Output: 3
// // Explanation: The sum of its digits are: 1 + 2 = 3

public class SumOfDigits {
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(125));
    }
}
