package src.BasicProg.OOPConcepts.OOPractise;

public class new1{
     public static void main(String[] args) {
Dog s=new Dog("Pepii","Street Dog");
Dog s1=new Dog("Blacky","German");
         System.out.println("My dog name is "+s.getName()+" and its breed is "+ s.getBreed());
    s.setName("Shera");
    s.setBreed("German Shephard");
         System.out.println("__________________");
         System.out.println("My dog name is "+s.getName()+" and its breed is "+s.getBreed());
     }
 }
