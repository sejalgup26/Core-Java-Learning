package src.OOPConcepts;

import java.util.Scanner;
//swapping of two numbers using temp
public class Lab010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int temp=a;
        a=b;
        b=temp;


        System.out.println("Print swapped numbers"+ a+"-"+b);
    }
}
