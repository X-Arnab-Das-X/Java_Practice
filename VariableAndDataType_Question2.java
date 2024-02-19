//  In a program , input the side of a square . You have to output the area of the square

import java.util.*;

public class VariableAndDataType_Question2 {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input side \n");
        int a = sc.nextInt();
        int b = (a * a);
        System.out.print("Area of the square is: " + b );
        sc.close();

    }
}