package src.BasicProg.Practise;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int d=a;
            for(int s=0;s<n;s++){
                d = d + ((int) (Math.pow(2, s))) * b;
                System.out.print(d + " ");
            }
            System.out.println("\t");
        }
    }
}
