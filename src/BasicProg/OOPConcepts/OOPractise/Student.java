package src.BasicProg.OOPConcepts.OOPractise;
//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age
public class Student {
    String name;
    Integer age;


public Student(String name, Integer age){
this.name=name;
this.age=age;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}