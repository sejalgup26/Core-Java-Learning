package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;
//Insert at any index
public class Addarry {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Red");
        mylist.add("Yellow");
        mylist.add("Blue");
        mylist.add("Green");

        mylist.add(0,"Black");
        System.out.println(mylist);
    }
}
