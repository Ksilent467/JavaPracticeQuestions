package JavaPractiveQuestions;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String []args){
        int []arr={4,3,15,2,11,8,5,10};
        int target=27;
        Arrays.sort(arr);

        boolean flag=false;
        for(int i=0;i<arr.length-2;i++)
        {
            int req=target-arr[i];

           int start=i+1;
           int end= arr.length-1;

           while(start<end)
           {
               if(arr[start]+arr[end]==req)
               {
                   flag=true;
                   break;
               }
               else
               {
                   if ((arr[start]+arr[end])<req)
                   {
                       start++;
                   }
                   else
                       end--;
               }
           }
           if(flag)
           {
               System.out.println("Numbers found: "+arr[i]+" "+arr[start]+" and "+ arr[end]);
               break;
           }
           else
               continue;
        }
        if(!flag)
            System.out.println("Not found");
    }
}
