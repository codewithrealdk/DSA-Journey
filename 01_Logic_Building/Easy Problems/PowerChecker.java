// Problem Statement:-
// Check if a number is a power of another number
// Given two positive numbers x and y, check if y is a power of x or not.
// Examples : 
// Input:  x = 10, y = 1
// Output: True
// x^0 = 1

// Input:  x = 10, y = 1000
// Output: True
// x^3 = 1

// Input:  x = 10, y = 1001
// Output: False

public class PowerChecker {
    public static boolean isPower(int x, int y){
        if(x == 1) return (y==1);

        int product = 1;
        while(product < y){
            product *= x;
        }
        return (product == y);
    }
    public static void main(String[] args){
        System.out.println(isPower(10,100));
        System.out.println(isPower(1,1));
        System.out.println(isPower(5,100));
        System.out.println(isPower(1000,1000000));
    }
}
