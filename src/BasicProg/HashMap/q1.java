package src.BasicProg.HashMap;

import java.util.HashMap;
import java.util.Map;

public class q1 {
    public static void main(String[] args) {
        HashMap<Integer,String> pr=new HashMap<>();
        pr.put(1,"SEjal");
        pr.put(2,"Pari");
        pr.put(3,"Gautmi");
        pr.put(4,"sanvi");

        System.out.println(pr);
        for(Map.Entry x: pr.entrySet()){
            System.out.println(x.getKey()+"--->"+x.getValue());
        }
    }
}
