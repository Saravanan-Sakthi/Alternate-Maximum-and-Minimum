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
