package JavaPractiveQuestions;

public class MaxElementsBitwiseAnd {
    public static void main(String[] args)
    {
        int[] bits=new int[32];
        int[] nums= {16,17,71,62,12,24,14};

        for(int i:nums)
        {
            int j=0;
            while(i>0)
            {
                bits[j]+=i&1;
                i=i>>1;
                j++;
            }
        }
        int max=0;
        for(int i: bits)
        {
            max= Math.max(i,max);
        }
        System.out.println(max);

    }
}
