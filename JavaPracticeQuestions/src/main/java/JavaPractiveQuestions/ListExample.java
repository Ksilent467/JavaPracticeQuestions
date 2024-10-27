package JavaPractiveQuestions;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String []args)
    {
        List<String> list=new LinkedList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Vanakkam");
        list.add("seri");
        list.add("Good");

        list.remove(2);
        for(String s: list)
        {
            System.out.println(s);
        }

        String str="abcde";
        String []strArr=str.split("");
        for(String s: strArr)
            System.out.println(s);
    }
}
