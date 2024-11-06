package JavaPractiveQuestions;

import java.util.Map;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args)
    {
        String str="abbcdam";

        Map<Character,Integer> hm = new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++)
        {
            if(!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i),1);
        }
        String newStr="";
        for(Map.Entry<Character,Integer> e : hm.entrySet())
            newStr+=e.getKey();

        System.out.println(newStr);
    }
}
