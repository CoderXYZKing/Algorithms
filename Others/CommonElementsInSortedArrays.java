public class CommonElementsInSortedArrays {
    public static void main(String []args){
       int n1 = 6; int []A = {1, 5, 10, 20, 40, 80};
       int n2 = 5; int []B = {6, 7, 20, 80, 100};
       int n3 = 8; int []C = {3, 4, 15, 20, 30, 70, 80, 120};
       int i=0,j=0,k=0;
       while (i<n1 && j<n2 && k<n3)
       {
           if(A[i]==B[i] && B[i]==C[i])
           {
               System.out.println(A[i]);
           }
       }
    }
}
