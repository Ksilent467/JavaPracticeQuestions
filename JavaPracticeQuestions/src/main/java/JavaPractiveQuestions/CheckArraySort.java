package JavaPractiveQuestions;

import java.util.Arrays;

public class CheckArraySort {
        public static void main (String []args)
        {
            int[] nums =new int[]{3,16,8,4,2};
            System.out.println(canSortArray(nums));
        }

    public static boolean canSortArray(int[] nums) {

        int []arr2= nums.clone();
        Arrays.sort(arr2);

        for(int i=0;i<nums.length-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<nums.length-1;j++)
            {
                //[3,16,8,4,2]
                //[3,8,4,2,16]
                //[3,4,2,8,16]
                //[3,2,4,8,16]
                int temp;

                if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])  && nums[j]>nums[j+1])
                {
                    //System.out.println("Entering the 2nd block");
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=true;
                }

            }
            //System.out.println(flag);
            if(Arrays.equals(nums,arr2))
                return true;
            else
                if(!flag)
                    return false;
        }
        return false;
    }
}


