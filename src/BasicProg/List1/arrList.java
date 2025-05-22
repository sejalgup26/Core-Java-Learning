package src.BasicProg.List1;

import java.util.ArrayList;
import java.util.List;

public class arrList {
    public static void main(String[] args) {
        List myList= new ArrayList();
        myList.add("Pramod");
        myList.add("Sejal");
        myList.add(90);
        System.out.println(myList);
        System.out.println(myList.get(1));
myList.set(2,"Pari");
        System.out.println(myList);
        myList.remove("Sejal");
        System.out.println(myList);

        for(Object o:myList){
            System.out.println(o);
        }
    }
}
