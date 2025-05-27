package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;

public class retrieve {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Red");
        mylist.add("Yellow");
        mylist.add("Blue");
        mylist.add("Green");
        System.out.println(mylist.get(2));
    }
}
