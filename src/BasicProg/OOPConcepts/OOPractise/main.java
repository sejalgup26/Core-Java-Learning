package src.BasicProg.OOPConcepts.OOPractise;

public class main {
    public static void main(String[] args) {
        Student sc=new Student("Sejal",26);
        Student sc1=new Student("Pari", 22);


        System.out.println("My name is "+sc.getName()+" and I'm "+sc.getAge()+"Years old");
        System.out.println("My name is "+sc1.getName()+" and I'm "+sc1.getAge()+"Years old");
    }
}
