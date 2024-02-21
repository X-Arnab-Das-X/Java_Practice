import java.util.*;
public class FunMeth_ProductOfAandB {

    public static int Multiplier (int num1 , int num2){

        int product = (num1 * num2);

        return product;

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your numbers\n");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = Multiplier(a, b);

        System.out.print("Product is : " + product);
    }
}