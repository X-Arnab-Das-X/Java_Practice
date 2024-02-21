import java.util.*;
public class FunMeth_PrintAllPrimesInRange {

    public static boolean isPrime(int n){
        for (int j = 2 ; j< n ;j++){
            if (n % j == 0){
            return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n){

        for (int i=2 ; i<=n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        System.out.print("\n");

    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        PrimeInRange(n);
        
    }

}