public class MinimumNoOfJumps {
    public static void main(String []args){
        int[] arr ={32,54,12,52,56,8,30,44,94,44,39,65,19,51,91,1,5,89,34,25,58,20,51,38,65,30,7,20,10,51,18,43,71,97,61,26,5,57,70,65,0,75,29,86,93,87,87,64,75,88,89,100,7,40,37,38,36,44,24,46,95,43,89,32,5,15,58,77,72,95,8,38,69,37,24,27,90,77,92,31,30,80,30,37};


        System.out.println(minStep(arr,arr.length));
    }

    private static int minStep(int[] arr, int n) {
        int step=0,max=0,idx=0,count=0;
       for(int i=0;i<=n-2;)
       {

           if(arr[i]==0) return -1;
           step=arr[i];
           for(int j=1;j<=step && (i+j)<n;j++)
           {
               if((arr[i+j]+i+j)>=max)
               {
                   max=arr[i+j]+i+j;
                   idx=i+j;

               }

           }

           if(idx==0) return count+1;
           System.out.println(arr[idx]);
           i=idx;
           max=idx=0;
           count++;
       }
        return count;
    }


}
