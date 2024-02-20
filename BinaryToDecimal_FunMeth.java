import java.util.*;
public class BinaryToDecimal_FunMeth {
    public static void BiToDec(int n) {

        int a = n;
        int pow = 0;
        int decNumb = 0;

        while (n > 0){
            int lastDegit = n % 10 ;
            decNumb = decNumb + (lastDegit * (int)Math.pow(2, pow));

            pow++;
            n = n/10;
        }

        System.out.print("decimal of "+ a+" = "+decNumb);

    }
 
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter your Binary number : ");
        int n = sc.nextInt();

        BiToDec(n);

    }
}