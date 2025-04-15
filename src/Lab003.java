package src;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        //Check vowel or not using switch
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphabet");
       char vowel= sc.next().toCharArray()[0];
        switch (vowel){
            case 'a':
                System.out.println("It is a vowel");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
        }

    }
}
