package src.BasicProg.OOPConcepts.InnerClass;

public class Lab30 {
    public static void main(String[] args) {

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

        public void setHorsePower(int horsePower) {
            this.HorsePower=HorsePower;
        }
        void start(){
            System.out.println("Start engine");
        }
    }
}

