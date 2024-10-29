package JavaPractiveQuestions;

import java.util.HashMap;

public class CharCountInString {
    public static void main(String []args)
    {
        String str="Google pixel is a flagship phone";
        char[] arr =str.replaceAll(" ","").toLowerCase().toCharArray();
      //  System.out.println(str);

        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        for(char ch: arr) {
            if (hm.containsKey(ch))
            {
                int count=hm.get(ch);
                count++;
                hm.put(ch,count);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
    }
}
