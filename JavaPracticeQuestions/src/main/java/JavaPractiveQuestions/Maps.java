package JavaPractiveQuestions;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){

        Map<Integer,String> map= new HashMap<Integer,String>();

        map.put(1,"Alex");
        map.put(2,"Rohit");
        map.put(5,"Washington");
        map.put(4,"Ashwin");
        map.put(7,"Nitish");

        System.out.println(map);

        for(Map.Entry<Integer,String> e: map.entrySet())
                {
                    String name = e.getValue();
                    if(name.equals("Ashwin")) {
                       map.replace(e.getKey(), "Jadeja");
                       // map.put(10,"Jadeja");
                       // map.remove(e.getKey());
                    }
                    //System.out.println(e.getKey()+" : "+e.getValue());
                }
        System.out.println(map);
    }
}
