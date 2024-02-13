/*

Write a Java program to get a number from the user and print whether it is positive or negative.

 */

 import java.util.*;
 public class ConState_Question1 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);


        System.out.print("Input your number\n");

        int a = sc.nextInt();
      
        switch (a){
            case 0 : System.out.print("either positive nor negative");
            break;
        }
        String b = (a > 0)?"positive":"negative";
        System.out.print(b);

        
    }
 }