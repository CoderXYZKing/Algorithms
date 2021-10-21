
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,4}, {0,4}};

        if(arr.length <=0) return;
        Stack <int[]> s1=new Stack<>();
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        s1.push(arr[0]);
        for( int i=1;i<arr.length;i++)
        {
          int []top=s1.peek();
          if(top[1]<arr[i][0])
          {
              s1.push(arr[i]);
          }
          else if(top[1]<arr[i][1])
          {
              top[1]=arr[i][1];
              s1.pop();
              s1.push(top);
          }
        }
        int [][]dst=new int[s1.size()][arr[0].length];
        for(int i=s1.size()-1;i>=0;i++) arr[i]=s1.pop();

    }

}
