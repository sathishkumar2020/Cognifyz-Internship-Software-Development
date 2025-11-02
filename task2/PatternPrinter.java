package com.cognifyz.task2;

import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern num = new pattern();

        while (true) {
            System.out.println("\nChoose a pattern to print:");
            System.out.println("1. Pyramid");
            System.out.println("2. Diamond");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting program...");
                System.exit(0);
            }

            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            switch (choice) {
                case 1:
                    num.printPyramid(n);
                    break;
                case 2:
                    num.printDiamond(n);
                    break;
                case 3:
                    num.printTriangle(n);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class pattern {
    public void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
