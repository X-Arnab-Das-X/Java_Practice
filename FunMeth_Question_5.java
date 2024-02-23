/*

Write a Java method to compute the sum of the digits in an integer .

(Hint: Approach this question in the following way:

a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 
                                               )

 */


 import java.util.*;
 public class FunMeth_Question_5{
     public static void main (String args[]){
         Scanner sc = new Scanner (System.in);
 
         System.out.print("Input your number : ");
         int n = sc.nextInt();
 
         System.out.print("sum is : " + SumOfDigits(n));
     }
 
     public static int SumOfDigits (int a){
 
         int sum = 0;
         while (a > 0){
             int b = a % 10;
             sum = sum + b;
             a = a / 10;
         }
         return sum;
     }
 }