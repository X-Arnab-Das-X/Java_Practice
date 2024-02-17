/*

What will be the output of the following programs :

public class Test {
    public static void main(String[] args){

        int x = 200, y = 50 , z = 100;

        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}

 */


 import java.util.*;
 public class Operators_Question_2{
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
 
         int x = 200 , y =50 , z = 100;
 
         if(x > y && y > z){
             System.out.print("Hello\n");
         }
 
         if(z >y && z < x){
             System.out.print("Java\n");
         }
         if((y + 200) < x && (y + 150) < z){
             System.out.print("Hello Java\n");
         }
     }
 }