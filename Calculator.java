import java.util.*;

public class Calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input number\n");
        float a = sc.nextFloat();
        System.out.print("Input your next number\n");
        Float b = sc.nextFloat();
        System.out.print("Input operator\n");
        char operator = sc.next().charAt(0);


        switch (operator){
            case '+' : System.out.print(a + b);
                       break;
            case '-' : System.out.print(a - b);
                       break;
            case '*' : System.out.print(a * b);
                       break;
            case '/' : System.out.print(a / b);
                       break;
            case '%' : System.out.print(a % b);
                       break;
            default : System.out.print("Wrong operator");

        }

    }

}