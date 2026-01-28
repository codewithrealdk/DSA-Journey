// Problem Statement:-
// Check whether triangle is valid or not if sides are given
// Given three sides, check whether triangle is valid or not. 

// Examples:  

// Input :  a = 7, b = 10, c = 5 
// Output : Valid
// We can draw a triangle with the given three edge lengths.

// Input : a = 1, b = 10, c = 12 
// Output : Invalid
// We can not draw a triangle with the given three edge lengths.

public class ValidTriangle {
    public static boolean isValidTriangle(int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0) return false;
        return ((a + b) > c && (a + c) > b && (b + c) > a);
    }
    public static void main(String[] args){
        System.out.println(isValidTriangle(10,20, 30));
        System.out.println(isValidTriangle(15,10, 60));
        System.out.println(isValidTriangle(36,23, 25));
        System.out.println(isValidTriangle(60,100, 26));
        System.out.println(isValidTriangle(70,2, 69));
    }
}
