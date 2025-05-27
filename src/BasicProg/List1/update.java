package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;

public class update {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Red");
        mylist.add("Yellow");
        mylist.add("Blue");
        mylist.add("Green");
        mylist.set(2, "Black");
        System.out.println(mylist);
    }
}