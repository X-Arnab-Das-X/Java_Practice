/*
 
Write a program that reads a set of integers , and the n prints the sum of the even and odd integers.


 */

 import java.util.*;
public class Loops_Question2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your numbers\n");

        int choice;
        int even = 0;
        int odd = 0;

        
        
        do{
            int a = sc.nextInt();
            if (a % 2 == 0){
            even += a;
        }
        else {
            odd += a;
        }
            System.out.print("Do you want to continue ? if yes press 1 , if no press 0\n");
    

        choice = sc.nextInt();
        
        } while ( choice==1);{

            System.out.println("sum of your even number is " + even);
            System.out.println("sum of your odd number is " + odd);
        }

    }
}