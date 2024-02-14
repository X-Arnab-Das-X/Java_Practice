/*
 * Write a program to print the multiplication table of a number N , entered by the user.
 */

/*/
 
 import java.util.*;
 public class question4 {
     public static void main (String args[]){
         Scanner sc = new Scanner (System.in);
 
        System.out.print("Enter your number\n");

         int a = sc.nextInt();
         int b;

         for (int i = 1 ; i <= a ; i++){
            b = i * a;
            System.out.println(b);
         }

 
     }
 }

/*/


import java.util.*;
class Loops_Question4{
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for(int i= 1 ; i <= 10 ; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    
    public static void main(String s[]) {
        printMultiplicationTable(5);
    }

}