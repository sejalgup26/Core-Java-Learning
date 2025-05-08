package src.BasicProg.OOPConcepts.Polymorphism;
//Method overloading -same method name but different parameters
public class Overloading {

    void gift(String name){
        System.out.println("String is "+ name);
    }
    void gift(int s){
        System.out.println("number is"+ s);
    }
}
