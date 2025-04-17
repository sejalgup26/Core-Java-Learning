package src;

import java.util.Scanner;
//Factorial of 5
public class Lab005 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for factorial-");
        int num= sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
           fact=fact*i;
        }
     System.out.println(fact);
}}
