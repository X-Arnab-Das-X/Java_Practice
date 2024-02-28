import java.util.*;
public class part2_ButterflyPattern {

    public static void pattern (int n){

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for (int k = n ; k > i ; k--){
                System.out.print("  ");
            }
            for (int m = 1 ; m <= i ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i <= n ; i++){  
            for (int l = n ; l >= i ; l--){
                System.out.print("*");
            }
            for (int o = 1 ; o < i ; o++){
                System.out.print("  ");
            }
            for (int p = n ; p >= i ; p--){
                System.out.print("*");
            }
        
            System.out.println();
            
        }
    }
   public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter your half row number : ");
    int n = sc.nextInt();

    pattern(n);
   }
}
