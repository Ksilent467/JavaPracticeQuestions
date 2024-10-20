package JavaPractiveQuestions;

import java.util.Arrays;

public class TwoSumClosestToZero {
    public static void main(String []args) {
        int[] arr = {-80, -10, 1, 15, 60, 70, 75};
        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;
        int curr=0;
        int res=Integer.MAX_VALUE;

        while(start<end)
        {
            curr=arr[start]+arr[end];
            if(curr==0)
            {
                res=curr;
                break;
            }
            else
            {
                if(Math.abs(curr)<Math.abs(res) || Math.abs(curr)==Math.abs(res) && curr>res)  // OR condition added to replace res with curr if curr=5 found
                                                                                               // and res is already having -5
                {
                    res=curr;
                }
                if(curr<0)
                    start++;
                else
                    end--;

            }
        }
        System.out.println(res);

    }
}
