package com.bl.Day5pcoreprogrammmed;

import java.util.Scanner;

public class primefacto {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("Prime factors of " + n + " are: ");

            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }

            if (n > 2) {
                System.out.print(n);
            }
        }
    }


