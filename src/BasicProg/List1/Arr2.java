package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;

///Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class Arr2 {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Red");
        mylist.add("Yellow");
        mylist.add("Blue");
        mylist.add("Green");
        //Write a Java program to iterate through all elements in an array list.
        for(String element:mylist){
        System.out.println(element);
    }}
}
