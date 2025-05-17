package src.BasicProg.Exceptions;

public class throws1 {
    public static void main(String[] args)throws Exception {


        extracted();
    }

    private static void extracted()throws Exception {
        int a = 10 / 0;
        int a1=10/10;
        int a2=10/4;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}