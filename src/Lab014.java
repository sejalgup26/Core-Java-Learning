package src;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {
        //Prime No. -which is divisible by 1 and itself
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=0;
        int m=0;
        int flag=0;
        m=n/2;
        if(n==1||n==0){
            System.out.println("Not a prime no."+n);
        }
        else{
        for (i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("Not a prime no.");
                flag=1;
                break;
            }
        }
    }
        if(flag==0){
            System.out.println("Is a prime no "+n);
        }}
}
