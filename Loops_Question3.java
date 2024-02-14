/*
 
Write a program to find the factorial of any number entered by the user.

 */

 import java.util.*;
 public class Loops_Question3 {
     public static void main (String args[]){
         Scanner sc = new Scanner (System.in);

         System.out.print("Enter your number\n");
 
         int a = sc.nextInt();
         int b = 1;
         for(int i = 1 ; i <= a ; i++){
            b = b * i;
         }
          
         System.out.print(b);

 
     }
 }