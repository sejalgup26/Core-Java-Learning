package src.BasicProg.priority;
//adding data in queue
import java.util.PriorityQueue;

public class q1 {
    public static void main(String[] args) {
        PriorityQueue<String> pr= new PriorityQueue<String>();
        pr.add("Red");
        pr.add("yellow");
        pr.add("blue");
        pr.add("Black");
        System.out.println(pr);
    }
}
