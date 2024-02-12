import java.util.*;

public class PrintReverseOfNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input your number\n");
        
        int a = sc.nextInt();

        while(a != 0){
            int lastdigit = (a % 10);
            System.out.print(lastdigit );
            a = a / 10;
        }
        sc.close();
    }
}