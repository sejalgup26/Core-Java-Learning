package src.BasicProg.OOPConcepts.InnerClass;

public class Lab30 {
    public static void main(String[] args) {
Car s=new Car("THAR");
s.drive();
Car.Engine c=s.new Engine(123);
c.start();
    }



}
class Car{
    String a;

    public  Car(String a){
        this.a=a;
    }
    void drive(){
        System.out.println("You can drive a car");
    }

    public class Engine{
        int HorsePower;

        public Engine(int HorsePower) {
            this.HorsePower=HorsePower;
        }
        void start(){
            System.out.println("Start engine");
        }
    }
}

