import java.util.*;
public class FunMeth_CalculateSum {

    public static int CalculateSum(int num1 , int num2){  //  parameters or formal parameters  //

       int sum = num1 + num2;
       return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        System.out.print("enter your next number : ");
        int b = sc.nextInt();


        int sum = CalculateSum(a,b);  //  arguments or actual parameters  //

        System.out.print("Sum is :" + sum);

    }
}