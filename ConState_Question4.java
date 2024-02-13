/*
 * 
 * What will be the value of x & y in thefollowing program:
 * 
 * 
 
        public class Solution {
            public static void main (Stringargs[]) {
                int a = 63  ,b = 36 ;
                boolean x = (a < b)? true : false ;
                int y = (a > b)? a : b;
            }
        }


 */


 import java.util.*;
 public class ConState_Question4 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input your two numbers\n");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("\n");

        boolean x = (a < b)? true : false;
        int y = (a > b)? a : b;

        System.out.println(x);
        System.out.println(y);

    }
 }

