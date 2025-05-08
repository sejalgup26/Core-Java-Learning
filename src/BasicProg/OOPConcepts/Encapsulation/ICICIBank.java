package src.BasicProg.OOPConcepts.Encapsulation;

public class ICICIBank {

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal>=1000 ){
            this.bal = bal;
            System.out.println(bal);
        }
        else{
            System.out.println("Not possible");
        }

    }

    String Name;
    long bal;

    public ICICIBank(String name, long bal) {
        Name = name;
        this.bal = bal;
    }
}
