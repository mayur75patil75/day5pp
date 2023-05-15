package com.bl.Day5pcoreprogrammmed;

public class vowelconsolant {



        public static void main(String[] args) {

            char ch = 'a';

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }
        }
    }

