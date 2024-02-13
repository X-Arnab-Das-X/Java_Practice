/*
 * 
 * Write a Java program that takes a year from the user and print 
 * whether that year is a leap year or not.
 * 
 * 
 */

 import java.util.*;
 public class ConState_Question5 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input year\n");

        int a = sc.nextInt();

        if (((a % 400 == 0) && (a % 100 == 0)) || (a % 4 == 0)){
            System.out.print("Leap Year");
        }
        //else if (a % 4 == 0){
          //  System.out.print("Leap Year");
        //}
        else {
            System.out.print("Not a Leap year");
        }

       
    }
 }

