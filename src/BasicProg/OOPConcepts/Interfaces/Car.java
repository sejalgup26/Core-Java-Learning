package src.BasicProg.OOPConcepts.Interfaces;

public class Car implements Engine,Breaks {

     void start(){
         System.out.println("Starting car");
         engine();
         pull();
     }

    @Override
    public void engine() {
        System.out.println("Engine starts");
    }

    @Override
    public void pull() {
        System.out.println("Break  is working ");
    }
}
