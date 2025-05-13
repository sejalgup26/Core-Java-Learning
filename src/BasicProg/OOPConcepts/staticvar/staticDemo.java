package src.BasicProg.OOPConcepts.staticvar;

public class staticDemo {
    //Static method
    public static String CollegeName="TheTestAcademy";

    //Instance variable
    public int version=3;

    public static void Student(){
        System.out.println("College Name:"+CollegeName);
        //System.out.println("Version:"+version);(Not possible as it is a instance variable are not allowed in static method
        // )
    }
    public void Student1(){
        System.out.println("College name:"+ CollegeName);
        System.out.println("Version:"+version);
    }
}
