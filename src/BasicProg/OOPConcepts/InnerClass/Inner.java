package src.BasicProg.OOPConcepts.InnerClass;

public class Inner {
    public static void main(String[] args) {
        OC s=new OC();
        s.IC();
    }

}
    class OC {
        int a = 10;

        void IC() {
            System.out.println(a);
        }
    }

