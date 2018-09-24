import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.String;

public class NumberOfCounts {
    public static void main(String[] args) {
        Map<String,Integer> countMapping=new HashMap<>();
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.print("String str= ");
        String str=s.nextLine();
        str=str.replaceAll("[^a-zA-Z]"," ");
        String[] str1=str.split("\\s+");
        for(String str2:str1)
        {
            if(countMapping.containsKey(str2))
            {
                count=countMapping.get(str2)+1;
            }
            else
            {
                count=1;
            }
            countMapping.put(str2,count);
        }
        System.out.println(countMapping);
    }
}
