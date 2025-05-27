package src.BasicProg.List1;
//
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collect1 {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Red");
        mylist.add("Yellow");
        mylist.add("Blue");
        mylist.add("Green");
        mylist.add("Black");
        mylist.add("Peach");
        mylist.add("sage");
        System.out.println(mylist);
        System.out.println("-----");
        Collections.shuffle(mylist);
       System.out.println(mylist);
        System.out.println("-------");
Collections.reverse(mylist);
System.out.println(mylist);
    }
}
