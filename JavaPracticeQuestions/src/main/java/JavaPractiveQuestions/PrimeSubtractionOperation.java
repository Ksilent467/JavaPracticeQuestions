package JavaPractiveQuestions;

import java.util.Arrays;

public class PrimeSubtractionOperation {
    public static void main(String[] args)
    {
        int[] nums={85,76,59,8,43,96,90,33,48,99};  // 2,3,6
        System.out.println(primeSubOperation(nums));
        System.out.println("Value "+maXPrime(76));

    }

    public static boolean primeSubOperation(int[] nums)
    {
        if(nums.length==1)
            return true;


        int[] arr=nums.clone();
        arr[0] = arr[0] - maXPrime(arr[0]);

        for(int i=1;i<nums.length;i++) {
            if (isSorted(arr)) {
                for(int k: arr)
                    System.out.println(k);
                return true;
            }
            int y=maXPrime(arr[i]);
            do {
                arr[i] =nums[i] - y;
                //System.out.println(arr[i]);
                if(arr[i-1]==y || arr[i-1]==nums[i]-2)
                {
                    y=0;
                    arr[i] =nums[i] - y;
                }
                if(arr[i] <= arr[i - 1])
                {
                    y=maXPrime(y);
                    //System.out.println(y);
                }
            } while (arr[i] <= arr[i - 1] && y!=0);

        }
        for(int k: arr)
            System.out.println(k);
        return false;
    }
    public static int maXPrime(int x)
    { int maxP=0;
        for(int i=x-1;i>1;i--)
        {
            boolean flag= false;
            for(int j = (int) Math.sqrt(i); j>1; j--)
            {
                if(i%j==0)
                {
                    flag =true;
                    break;
                }
            }
            if(!flag)
            {
                maxP=i;
                return maxP;
            }
        }
        return 0;
    }

    public static boolean isSorted(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] >= a[i + 1]) {
               // System.out.println(a[i]+"  "+a[i+1]);
                return false;
            }
        }
        return true;
    }
}
