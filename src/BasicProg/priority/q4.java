package src.BasicProg.priority;

import java.util.PriorityQueue;

public class q4 {
    public static void main(String[] args) {
        PriorityQueue<String> pr=new PriorityQueue<String>();
        pr.add("Red");
        pr.add("yellow");
        pr.add("blue");
        pr.add("Black");
        System.out.println(pr);
        PriorityQueue<String> pd=new PriorityQueue<String>();
        pd.add("blue");
        pd.add("green");
        System.out.println(pd);
        for(String elements:pr){
            System.out.println(pd.contains(elements)?"Yes" : "No");

        }
    }
}
