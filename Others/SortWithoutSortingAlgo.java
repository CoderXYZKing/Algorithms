public class SortWithoutSortingAlgo {
    public static void main(String[] args)
    {
        int[] arr ={0,2,1,2,2,1,0,1,2};
        int[] temp =new int[3];
        for (int value : arr) {
            temp[value]++;
        }
        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp[i];j++)
            {
                System.out.print(i+" ");
            }

        }
    }
}
