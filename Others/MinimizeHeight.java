import java.util.Arrays;

public class MinimizeHeight {
    public static void main(String []args){
        int[] arr ={1, 1, 1, 10,5,11,2,5};
        int K = 6, n = 8;
        int mid=n/2;
        Arrays.sort(arr);
        for(int i=0;i<mid;i++) arr[i]+=K;
        for(int i=mid;i<n;i++)
        {
            arr[i]-=K;
            if(arr[i]<0) arr[i]+=K*2;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int diff=arr[n-1]-arr[0];
        System.out.println(diff);
//        int max,cur;
//        max=cur=0;
//        for(int i=0;i<N;i++)
//        {
//
//            for(int j=i;j<N;j++)
//            {
//               cur=arr[j]-arr[i];
//               if(cur>max)
//                   max=cur;
//            }
//        }



    }
}
