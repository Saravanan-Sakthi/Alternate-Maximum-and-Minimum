package IntArray.altermaxmin;
public class AlterMaxMin {
    void rotate(int[]A,int n){  // A is the int[] array and 'n' is the position upto which it has to rotate.
        if (n<A.length){
            int temp=A[A.length-1];
            for (int i=A.length-1;i>n;i--){
                A[i]=A[i-1];
            }
            A[n]=temp;
            rotate(A,n+2);  // Once we got the smallest number in the second place recall the rotate method for the fourth place.
        }
        else for (int i=0;i<A.length;i++) System.out.print(A[i]+" ");
    }
    void sort(int[]A){  // This method is called first from the Test class
        for (int i=0;i<A.length;i++){  // This for loop is for placing smallest numbers from index '0'
            int min=A[i], index=i;
            for (int j=i+1;j<A.length;j++){  // This is to compare the taken number with rest of the numbers.
                if (A[j]<min){
                    min=A[j];
                    index=j;
                }
            }
            int temp=A[i];  // Swapping the smallest of the numbers with the outer loop index ie.'i'.
            A[i]=min;
            A[index]=temp;
        }
        rotate(A,0);  // Rotate is a recursive method which rotates each elements untill the result.
    }
}
