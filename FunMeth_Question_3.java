/*

Write a Java program to check if a number is a palindrome in Java ?
(121 is a palindrome, 321 is not) A number is called a palindrome if 
the number is equal to the reverse of a numbere .eg.,121 is a palindrome 
because the reverse of 121 is 121 itself . On the otherhand, 321 is not
a palindrome because the reverse of 321 is 123, which is not equal to 321.

 */

 import java.util.*;
 public class FunMeth_Question_3 {
 
    
 
     public static void palindrome (int n){
         
 
         int b = 0;
         int d = 0;
 
         b = n;
         while (n != 0){
 
             int c = n % 10;
             d = d * 10 + c;
             n = n / 10;
 
         }
 
         if (b == d){
             System.out.print(b + " is a palindrome number");
         }
         else { 
             System.out.print(b + " is not a palindrome number");
         }
        
     
     }
     
     public static void main (String args[]){
         Scanner sc = new Scanner (System.in);
 
         System.out.print("Enter your number : ");
         int n = sc.nextInt();
 
         palindrome(n);
     }
    
 }