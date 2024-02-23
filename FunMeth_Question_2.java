/*
 
Write a method named is Even that accepts an int argument . The method 
should return true if the argument is even ,or false otherwise . 
Also write a program to test your method.

 */

 import java.util.*;
 public class FunMeth_Question_2 {
 
     public static boolean Check(int n) {
        if (n % 2 == 0){
            return true ;
        }
        else {
            return false ;
        }

    }
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
 
         System.out.print("Enter your number\nif it is Even it will return true otherwise false\n\n: ");
         int n = sc.nextInt();
 
 
         System.out.print(Check(n));
     }
     
 }