package src.BasicProg.OOPConcepts;

public class BankDetails {

    //Attributes
    String BankName;
    long Balance;

//Default constructor
    BankDetails(){
        BankName="SBI";
        System.out.println("Default constructor");
    }
    //Parameterised constructor
    BankDetails(String Bname){
        this.BankName=Bname;
        System.out.println("Param C");
    }
    //Behaviour
    void printDetails(){
        System.out.println("Bank Name is "+BankName);
        System.out.println("Bank Balance is"+Balance);
    }

}

