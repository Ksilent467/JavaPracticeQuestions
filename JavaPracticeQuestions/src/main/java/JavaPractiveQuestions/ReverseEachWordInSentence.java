package JavaPractiveQuestions;

public class ReverseEachWordInSentence {
    public static void main(String[] args){

        String s = "my name is piyush";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                count++;
        }
        String[] arr=new String[count+1];
        int j=0;
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                arr[j]=temp;
                j++;
                temp="";
            }
            else
                temp+=s.charAt(i);
        }
        arr[j]=temp;

        for(int i=0;i<arr.length;i++)
        {
            String word=arr[i];
            String newWord="";
            int start=0;
            int end=word.length();
            for(int k=end-1;k>=start;k--)
            {
                newWord+=word.charAt(k);
            }
            arr[i]=newWord;
        }
        for(String word : arr)
        {
            System.out.print(word+" ");
        }
    }
}
