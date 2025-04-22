package src.OOPConcepts;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        //Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a string");
        String user_Input = sc.next();

        Boolean result = palindorme(user_Input); {
            if (result) {
                System.out.println("It is a palindrome");
            } else {
                System.out.println("Not a palindorme");
            }
        }}

        private static Boolean palindorme (String userInput){
            String original_Input = userInput;
            StringBuilder sb = new StringBuilder(userInput);
            sb.reverse();
            return original_Input.equalsIgnoreCase(sb.toString());
        }
    }
