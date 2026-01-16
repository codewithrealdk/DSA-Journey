// Problem Statement: -
// Find Closest to n and Divisible by m
// Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.
// Examples: 

// Input: n = 13, m = 4
// Output: 12
// Explanation: 12 is the closest to 13, divisible by 4.

// Input: n = -15, m = 6
// Output: -18
// Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.

public class ClosestToN {
    public static int closestToN(int n, int m) {
        double k = (double)  n  /  m;
        int a = (int)Math.floor(k) * m;
        int b = (int)Math.ceil(k) * m;

        int d1 = Math.abs(n - a);
        int d2 = Math.abs(n - b);

        if (d1 < d2) {
            return a;
        } else if (d2 < d1) {
            return b;
        } else {
            return Math.abs(a) > Math.abs(b) ? a : b;
        }
    }

    public static void main(String[] args) {
        System.out.println(closestToN(14, 2));
        System.out.println(closestToN(-63, -5));
        System.out.println(closestToN(-14, 7));
        System.out.println(closestToN(132, 9));
        System.out.println(closestToN(144, 3));

    }
}
