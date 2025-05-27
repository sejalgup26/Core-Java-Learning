package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Pramod");
        myList.add("Sejal");
        //myList.add(90);
       // myList.add(97);
        System.out.println(myList);
        //myList.set(2,"Pari");
        System.out.println(myList);
        myList.remove("Sejal");
        System.out.println(myList);

        for(String  o:myList){
            System.out.println(o);
        }
    }
}
