package src.BasicProg;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        // reverse a string
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String name=sc.next();
        String y="";
        for(int i=name.length()-1;i>=0;i--){
            y=y+name.charAt(i);

        }
        System.out.println("Reverse String is "+ y);

    }
}
