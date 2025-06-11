package src.BasicProg.priority;

import java.util.PriorityQueue;

public class q3 {
    public static void main(String[] args) {
        PriorityQueue<String> pr=new PriorityQueue<String>();
        pr.add("Red");
        pr.add("yellow");
        pr.add("blue");
        pr.add("Black");
        System.out.println(pr);
        PriorityQueue<String> pd=new PriorityQueue<String>();
        pd.add("pink");
        pd.add("green");
        System.out.println(pd);
        System.out.println("----merged queue-----");
        pr.addAll(pd);
        System.out.println(pr);
    }
}
