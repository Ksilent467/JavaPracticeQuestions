package JavaPractiveQuestions;

public class TrappingWaterProblem {
    public static void main(String args[])
    {
        int arr[]={2,0,3,0,1,0,2,0,4};
        int res=0;

        int left[]=new int[arr.length];
        int right[]=new int[arr.length];

        left[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            left[i]=Math.max(arr[i],left[i-1]);
        }

        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            right[i]=Math.max(arr[i],right[i+1]);
        }

        for(int i=1;i<arr.length-1;i++)
        {
            res+=Math.min(left[i],right[i])-arr[i];
        }

        System.out.println(res);
    }
}
