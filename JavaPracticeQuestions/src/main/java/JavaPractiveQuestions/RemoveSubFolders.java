package JavaPractiveQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFolders {
    public static void main(String []args)
    {
        List<String> list=removeSubFolders(new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"});
        for(String s: list)
            System.out.println(s);
    }

    public static List<String> removeSubFolders(String []folders)
    {
        Arrays.sort(folders);
        List<String> list=new ArrayList<String>();
        list.add(folders[0]);

        for(int i=1;i< folders.length;i++)
        {
            String str= list.get(list.size()-1) + "/";

            if(!folders[i].startsWith(str))
                list.add(folders[i]);
        }

        return list;
    }
}
