package src.BasicProg.priority;

import java.util.PriorityQueue;

public class q2 {
    public static void main(String[] args) {
        PriorityQueue<String> pr= new PriorityQueue<String>();
        pr.add("Red");
        pr.add("yellow");
        pr.add("blue");
        pr.add("Black");
        System.out.println(pr);
        for(String elements: pr){
            System.out.println(elements);
        }
    }
}
