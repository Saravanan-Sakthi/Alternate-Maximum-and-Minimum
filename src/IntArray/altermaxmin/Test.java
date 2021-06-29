/*
Given a list of numbers we have to arrange the list such that 
first number is the largest of the list and second number is 
the smallest of the list and third number is the second largest 
and fourth number is second smallest.

Sample input:  3 5 4 2 7 9 10 6 1 8
Sample output: 10 1 9 2 8 3 7 4 6 5
*/
package IntArray.altermaxmin;
import java.util.Scanner;
public class Test {
    public static void main(String []abc){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n =s.nextInt();
        int[]A= new int[n];
        for (int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        new AlterMaxMin().sort(A);
    }
}
