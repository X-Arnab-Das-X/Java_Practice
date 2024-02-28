import java.util.*;
public class part2_InvertedHalfPyramidPatternWithNumbers {
    public static void inverted_half_pyramid_withNumber(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i+1 ; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        inverted_half_pyramid_withNumber(n);
    }
}
