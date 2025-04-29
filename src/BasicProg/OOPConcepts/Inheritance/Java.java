package src.BasicProg.OOPConcepts.Inheritance;

public class Java extends programmingJ{
    String New_Feature;

    Java(){
        System.out.println("Defalult java");
    }

    Java(String feature){
        this.New_Feature=feature;
    }

    void printInfo(){
        System.out.println("New feature is "+this.New_Feature);
    }

}
