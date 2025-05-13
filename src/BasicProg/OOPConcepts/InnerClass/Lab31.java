package src.BasicProg.OOPConcepts.InnerClass;



public class Lab31 {
    public static void main(String[] args) {
        cycle s=new cycle("THAR");
        s.drive();
        cycle.Engine c=new cycle.Engine(123);
        c.start();
    }



}
class cycle{
    String a;

    public  cycle(String a){
        this.a=a;
    }
    void drive(){
        System.out.println("You can drive a car");
    }

    static class Engine{
        int HorsePower;

        public Engine(int HorsePower) {
            this.HorsePower=HorsePower;
        }
        void start(){
            System.out.println("Start engine");
        }
    }
}

