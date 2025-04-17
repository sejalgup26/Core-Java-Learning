package src;

import java.util.Scanner;

// Leap year program
public class Lab008 {
    public static void main(String[] args) {
        System.out.println("Enter an year");
    Scanner sc= new Scanner(System.in);

    double year=sc.nextDouble();
    if((year%4==0&& year%100!=0)||(year%400==0)){
        System.out.println("It is a leap year");
    }
    else{
        System.out.println("It is not a leap year");
    }
    }
}
