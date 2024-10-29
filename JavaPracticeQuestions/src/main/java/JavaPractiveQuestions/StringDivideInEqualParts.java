package JavaPractiveQuestions;

public class StringDivideInEqualParts {
    public static void main(String[] args)
    {
        String str="aaaabbbbcccc";
        int parts=3;

        if(str.length()%parts!=0)
            System.out.println("Can't divide in "+parts+" equal parts");
        else
        {
            String[] arr=new String[parts];
            int eachPart=str.length()/parts;
            int j=0;
            for(int i=0;i<str.length();i+=eachPart)
            {
                arr[j]=str.substring(i,i+eachPart);
                j++;
            }

            for(String s: arr)
            {
                System.out.println(s);
            }
        }
    }
}
