import java.util.*;
public class DoWhileLoop_PrintHelloWorld10Times {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int counter = 10;

        do {
            System.out.println("hello world");
            counter++;
        }
        while (counter <= 10);
    }
}