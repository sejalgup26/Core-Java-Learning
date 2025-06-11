package src.BasicProg.HashMap;

import java.util.HashMap;

public class q3 {
    public static void main(String[] args) {
        HashMap<Integer,String> pr=new HashMap<>();
        HashMap<Integer,String> pd=new HashMap<>();
        pr.put(1,"SEjal");
        pr.put(2,"Pari");
        pr.put(3,"Gautmi");
        pr.put(4,"sanvi");
        System.out.println(pr);
        pd.put(5,"Sjal");
        pd.put(6,"Pri");
        pd.put(7,"Gutmi");
        pd.put(8,"savi");
        System.out.println(pd);
        pd.putAll(pr);
        System.out.println(pd);
    }
}
