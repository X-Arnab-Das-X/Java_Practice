/*
 
Write a Java method to compute the averageof three numbers..

 */

 import java.util.*;
 public class FunMeth_Question_1 {
 
     public static int avarage (int a , int b , int c){
 
         int ans = (a + b + c)/3 ;
 
         return ans;
 
     }
 
     public static void main (String args[]){
         Scanner sc = new Scanner (System.in);
 
         System.out.print("Input your first number : ");
         int x = sc.nextInt();
 
         System.out.print("Input your secend number : ");
         int y = sc.nextInt();
 
         System.out.print("Input your third number : ");
         int z = sc.nextInt();
 
         System.out.print(avarage( x , y , z));
     }
 }