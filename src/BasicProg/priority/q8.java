package src.BasicProg.priority;

import java.util.PriorityQueue;

public class q8 {
    public static void main(String[] args) {
        PriorityQueue<String> pr=new PriorityQueue<String>();
        pr.add("Red");
        pr.add("yellow");
        pr.add("blue");
        pr.add("Black");
        System.out.println(pr);
        String str;
        str=pr.toString();
        System.out.println(str);
    }
}
