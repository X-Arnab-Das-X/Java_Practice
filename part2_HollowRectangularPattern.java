import java.util.*;
public class part2_HollowRectangularPattern {
    public static void hollow_rectangle (int rows , int cols){
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= cols ; j++){
                if (i == 1  || i == rows || j == 1 || j == cols){
                    System.out.print("* ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter row number : ");
        int rows = sc.nextInt();

        System.out.print("Enter collum number : ");
        int cols = sc.nextInt();

        hollow_rectangle(rows , cols);
    }
}