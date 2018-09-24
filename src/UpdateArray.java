import java.util.ArrayList;
import java.util.List;

public class UpdateArray {
    public static void main(String[] args){
        List<String>  fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");
        System.out.println(fruits);
        fruits.set(0,"Kiwi");
        fruits.set(0,"Mango");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
