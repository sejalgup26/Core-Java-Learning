package src.BasicProg.OOPConcepts;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        String y="";
        for(int i=s.length()-1;i>=0;i--) {
            y = y + s.charAt(i);
        }
//        System.out.println(y);
            if(s.equalsIgnoreCase(y)){
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("Not a palindrome");

        }
    }
}
