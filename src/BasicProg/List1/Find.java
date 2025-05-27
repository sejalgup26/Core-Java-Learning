package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Red");
        mylist.add("Yellow");
        mylist.add("Blue");
        mylist.add("Green");
        mylist.add("Black");
        mylist.add("Peach");
        mylist.add("sage");

        if (mylist.contains("green")){
            System.out.println("found an element");
        }
            else{
            System.out.println("Not found");
        }
    }
}
