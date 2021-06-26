package IntArray.altermaxmin;
public class AlterMaxMin {
    void reverse(int[]A,int n){
        if (n<A.length){
            int temp=A[A.length-1];
            for (int i=A.length-1;i>n;i--){
                A[i]=A[i-1];
            }
            A[n]=temp;
            reverse(A,n+2);
        }
        else for (int i=0;i<A.length;i++) System.out.print(A[i]+" ");
    }
    void sort(int[]A){
        for (int i=0;i<A.length;i++){
            int min=A[i], index=i;
            for (int j=i+1;j<A.length;j++){
                if (A[j]<min){
                    min=A[j];
                    index=j;
                }
            }
            int temp=A[i];
            A[i]=min;
            A[index]=temp;
        }
        reverse(A,0);
        //for (int i=0;i<A.length;i++) System.out.print(A[i]+" ");
    }
}
