package src;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        //Math problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for x y and z");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double A = Math.pow(x, 2);
        double B = Math.pow(y, 2);
        double C = Math.abs(z);
        double sum = A + B - C;
        System.out.println("Answer for math problem is"+ Math.cbrt(sum));
    }
}
