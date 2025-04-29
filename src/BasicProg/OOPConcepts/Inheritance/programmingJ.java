package src.BasicProg.OOPConcepts.Inheritance;

public class programmingJ {
    //Atrributes
    String Author;
    int version;

 programmingJ(){
     System.out.println("DEFAUlt");
 }
programmingJ(String Author,int version){
     this.version=version;
     this.Author=Author;
}
 void printInfo(){
     System.out.println("Show Information of "+this.Author+" "+this.version);
 }
}
