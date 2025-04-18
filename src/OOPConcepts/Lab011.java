package src.OOPConcepts;

import java.util.Scanner;
//swapping of two numbers without third variable
public class Lab011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("Print swapped numbers:" + a + "-" + b);
    }
}