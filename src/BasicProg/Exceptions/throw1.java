package src.BasicProg.Exceptions;

public class throw1 {
    public static void main(String[] args) {

        extracted(0);
    }

    private static void extracted(int b) {
        int a=0;
        if(b==0){
            throw new ArithmeticException("Bis equal to zero");
        }
        else {
            a = 10 / b;
        }
        System.out.println(a);
    }
}
