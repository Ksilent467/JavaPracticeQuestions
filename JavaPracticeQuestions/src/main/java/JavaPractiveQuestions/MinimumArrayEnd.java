package JavaPractiveQuestions;

public class MinimumArrayEnd {
    public static void main(String[] args)
    {
      // System.out.println(minEnd(3,1));
        minEnd(3,2);
    }
    public static int minEnd(int n, int x) {
        int[] nums = new int[n];
        if(n==1)
            return x;

        nums[0]=x;

        int i=1;
        int j=0;
        while(i<n)
        {
            int temp=nums[i-1];
            while(j<32)
            {
                temp+=(int)Math.pow(2,j);
                //System.out.println(temp);
                if((x&temp)==x)
                {
                    //System.out.println(temp);
                    nums[i]=temp;
                    i++;
                    j=0;
                    break;
                }
                j++;
                temp=nums[i-1];
            }
        }

        for(int k:nums)
            System.out.println(k);
        return nums[n-1];
    }
}
