package JavaPractiveQuestions;

public class ChangeCaseInString {
    public static void main(String args[]) {
        String str = "tHiS iS IntelliJ IdE";
        String newStr="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                newStr+=Character.toUpperCase(str.charAt(i));
            else
                if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                    newStr+=Character.toLowerCase(str.charAt(i));
        }
        System.out.println(newStr);
    }
}
