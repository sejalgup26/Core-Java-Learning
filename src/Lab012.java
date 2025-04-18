package src;

import java.util.Scanner;
//Diagonal of a matrix

public class Lab012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("enetr values in array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }

            }
        }
    }}