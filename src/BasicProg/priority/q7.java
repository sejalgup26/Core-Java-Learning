package src.BasicProg.priority;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class q7 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr= new PriorityQueue<>();
        pr.add(19);
        pr.add(12);
        pr.add(23);
        pr.add(89);
        pr.add(43);
        pr.add(87);
        System.out.println(pr);
        List<Integer> rt=new ArrayList<>(pr);
        System.out.println(rt);
    }
}
