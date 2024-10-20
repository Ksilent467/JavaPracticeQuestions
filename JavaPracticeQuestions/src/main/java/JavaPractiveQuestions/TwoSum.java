package JavaPractiveQuestions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String args[])
    {
        int []arr={4,3,15,2,11,8,5,10};
        int target=22;
        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;
        boolean flag=false;

        while(start<end)
        {
            if(arr[start]+arr[end]==target)
            {
                flag=true;
                break;
            }
            else
            {
                if((arr[start]+arr[end])<target)
                    start++;
                else
                    end--;
            }
        }
        if(flag)
            System.out.println("Two numbers found: "+arr[start]+" and "+arr[end]);
        else
            System.out.println("Not found");
    }
}
