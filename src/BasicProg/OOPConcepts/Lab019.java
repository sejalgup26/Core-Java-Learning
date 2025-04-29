package src.BasicProg.OOPConcepts;

public class Lab019 {
    public static void main(String[] args) {
        //For default
        BankDetails sbi=new BankDetails();
        sbi.printDetails();

        System.out.println("---------------");
        //For param 1

        BankDetails canara=new BankDetails("Canara");
        canara.printDetails();

        System.out.println("---------------");


        //For param 2
        BankDetails icici=new BankDetails("ICICI");
        icici.printDetails();
    }
}
