package com.bl.Day5pcoreprogrammmed;

import java.util.Scanner;

public class oddeven {




        public static void main(String[] args) {


            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            String evenOdd = (num % 2 == 0) ? "even" : "odd";

            System.out.println(num + " is " + evenOdd);

        }
    }