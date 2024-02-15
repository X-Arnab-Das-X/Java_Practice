import java.util.*;
public class BrState_Loops_EnterNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        do {
            System.out.println(" Enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
            System.out.print(n);
        } while(true);

    }
}