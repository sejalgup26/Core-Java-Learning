package src.BasicProg.OOPConcepts.OOPractise;

public class Dog {
     String name;
     String Breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public Dog(String name, String Breed){
         this.name=name;
         this.Breed=Breed;
     }

}

