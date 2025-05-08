package src.BasicProg.PracticeQues;


//Create a class GrandFather that has a parameterized constructor and a grandFatherName attribute.
//
//Create another class Father that inherits the property of GrandFather and has a parameterized constructor with an additional argument fatherName.
//
//Create another class Son that inherits Father's property and has a parameterized constructor with an additional argument sonName and a printName method that prints the sonName,fatherName, and grandFatherName into the format as shown below in SampleOutput 1.
//
//You need to create the object of Son class and pass the value of sonName,fatherName,grandFatherName as 'Saurabh', 'Ramesh', and 'Suresh' respectively and call the printName method.
public class main1 {
    public static void main(String[] args) {
Daughter d=new Daughter();
d.newd("Om prakash Gupta","Sanjay Gupta", "Sejal Gupta");
    }
}
