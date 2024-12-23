package JavaPractiveQuestions;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {

    public static void main(String args[]){
        String str="abbdgsafsdaish";

        Map<Character,Integer> map=new HashMap<Character,Integer>();
        char arr[]=str.toCharArray();
        for(char ch : arr)
        {
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
            {
                int count = map.get(ch);
                count++;
                map.put(ch,count);
            }
        }
       // System.out.println(map);

        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            if(e.getValue()!=1)
                System.out.println(e.getKey());
        }
    }

}
