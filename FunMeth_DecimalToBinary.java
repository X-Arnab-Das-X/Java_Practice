import java.util.*;
public class FunMeth_DecimalToBinary {
    public static void BiToDec(int n) {

        int a = n;
        int pow = 0;
        int biNumb = 0;

        while (n > 0){
            int LastDigit = n % 2;
            biNumb = LastDigit + LastDigit * (int)Math.pow(10 , pow);
            pow++;
            n = n/2;
        }

        System.out.print("Binary number of " + a + " = " + biNumb);

        
    }
 
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter your Decimal number n : ");
        int n = sc.nextInt();

        BiToDec(n);
        sc.close();

    }
}