package src.BasicProg.OOPConcepts.Polymorphism;
//Overriding- its is done during run time
public class Overrinding {
    public static void main(String[] args) {
        Dog d= new Hound();
        d.bark("Sam");
        Dog d1= new Dog();
        d1.bark("Dogesh");
    }
}
