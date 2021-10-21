import java.util.Arrays;

public class NextPermutation {
    public static void main(String []args)
    {
        int[] arr ={4, 5, 6, 3, 2, 1};
        int idx=-1,grt=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                idx=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[idx]<arr[i])
            {
                grt=i;
                break;
            }
        }
if(idx!=-1)
{
    int temp=arr[idx];
    arr[idx]=arr[grt];
    arr[grt]=temp;
    Arrays.sort(arr,idx+1,arr.length);
}else
{
    Arrays.sort(arr);

}
        System.out.println(Arrays.toString(arr));
    }
}
