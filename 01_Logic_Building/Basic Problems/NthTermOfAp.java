// Problem Statement:-
// Given two integers a1 and a2, the first and second terms of an Arithmetic Series respectively, the problem is to find the nth term of the series. 
// Examples :
// Input : a1 = 2,  a2 = 3,  n = 4
// Output : 5
// Explanation : The series is 2, 3, 4, 5, 6, ....   , thus the 4th term is 5. 

// Input : a1 = 1, a2 = 3, n = 10
// Output : 19
// Explanation:  The series is: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21..... Thus,10th term is 19.

public class NthTermOfAp {
    public static int nthTerm(int a1, int a2, int n){
        int d = a2 - a1;
        int nthterm = (a1 + ((n - 1) * d));
        return nthterm;
    }
    public static void main(String[] args){
        System.out.println(nthTerm(2, 3, 4));
    }
}
