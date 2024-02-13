/*
 * 
 * Finish the following code so that it prints You have a fever if your 
 * temperature is above 100 and otherwise prints You don't have a fever
 * 
 * 
 

        public class Solution {
            public static void main (String[]args) {
                double temp=103.5;
            }
        }

 */

 
 import java.util.*;
 public class ConState_Question2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);


        System.out.print("Input your temprature \nin farenhide\n");

        double temp = sc.nextDouble();
        String result = (temp <= 100)? "You don't have a fever" : "You have fever";

        System.out.print(result);

    }
 }