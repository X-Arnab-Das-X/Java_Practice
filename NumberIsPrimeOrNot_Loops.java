// Check if the number is prime or not

import java.util.*;
public class NumberIsPrimeOrNot_Loops {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your number\n");

        int a = sc.nextInt();
        int i;

        boolean isPrime = true;

        if ( a == 0){
            System.out.print("0 is neither prime nor nonprime");
        }

        else if( a == 2){
            System.out.print(a + " is prime");
        }

        else{
            for (i = 2 ; i < a ; i++){
                if(a % i == 0){
                isPrime = false;
               }
            }
            
            if (isPrime == true){
                System.out.print(a + " is prime\n");
            }
            else{
                System.out.print(a + " is not prime\n");
            }
            
        }

    }

}