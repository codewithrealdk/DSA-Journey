// Problem Statement:-
// Program to calculate distance between two points
// You are given two coordinates (x1, y1) and (x2, y2) of a two-dimensional graph. Find the distance between them.
// Examples: 

// Input : x1, y1 = (3, 4)
//            x2, y2 = (7, 7)
// Output : 5

// Input : x1, y1 = (3, 4) 
//            x2, y2 = (4, 3)
// Output : 1.41421

public class DistanceBwTwoPoints{
    public static double distanceCalculator(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args){
        System.out.printf("%.2f" , distanceCalculator(2,3,4,6));
    }
}