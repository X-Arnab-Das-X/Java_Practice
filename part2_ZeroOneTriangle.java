import java.util.*;
public class part2_ZeroOneTriangle {

    public static int check (int sum){

        if (sum % 2 == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void triangle(int n){

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                int sum = i + j;
                System.out.print(check(sum));
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        triangle(n);
    }
}
