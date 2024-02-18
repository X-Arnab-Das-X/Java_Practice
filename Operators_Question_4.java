/*
 

What will be the output of the following programs :


public class Test {
    public static void main(String[] args){
        
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);
    }
}


 */

 import java.util.*;

 public class Operators_Question_4 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);

        
    }
 }