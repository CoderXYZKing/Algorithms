public class DuplicateNumber {
    public static void main(String []args)
    {
        int []nums= {2,1,3,4,1,5,9};
        int num =1;
//        for(int i = 0; i < nums.length; i++){
//            num = Math.abs(nums[i]);
//            System.out.print(num+" ");
//            if(nums[num] < 0)
//               break;
//            nums[num] *= -1;
//            System.out.println(nums[num]+" ");
//        }


      for(int i=0;i<nums.length;i++)
      {
          int j=Math.abs(nums[i]);
          if(nums[j]>0)
              nums[j]=-nums[j];
          else
          {
              System.out.println(num);
              break;
          }
      }
    }
}
