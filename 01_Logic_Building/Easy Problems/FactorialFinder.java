// Factorial of a Number
// Given the non-negative integers n , compute the factorial of a given number.
// Note: Factorial of n is defined as n * (n -1) * (n - 2) * ... * 1, for n = 0, factorial is 1.
// Examples:
// Input: n = 5
// Output: 120
// Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120

// Input: n = 4
// Output: 24
// Explanation: 4! = 4 * 3 * 2 * 1 = 24

//solving it using iterative approach
public class FactorialFinder{
    public static int factorialFind(int n){
        if(n < 0) return -1;
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        } 
        return fact;
    }
    public static void main(String[] args){
        System.out.println(factorialFind(0));
        System.out.println(factorialFind(-6));
        System.out.println(factorialFind(3));
        System.out.println(factorialFind(4));
        System.out.println(factorialFind(9));
    }
}