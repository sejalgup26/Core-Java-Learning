package src.BasicProg;

import java.util.Scanner;
//traingle clasifier
public class Lab002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle");
        double s1= sc.nextDouble();  //side 1
        double s2= sc.nextDouble();  //side 2
        double s3=sc.nextDouble();   //side 3
         if(s1==s2 && s2==s3 && s3==s1){
             System.out.println("Equilateral triangle");
         }
         else if(s1==s2 || s2==s3 || s3==s1 ){
             System.out.println("Isosceles triangle");
         }
         else {
             System.out.println("Scalene triangle");
         }


    }
}
