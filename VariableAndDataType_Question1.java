//  In a program , input 3 numbers : A , B and C . You have to output the average of these 3 numbers

import java.util.*;

public class VariableAndDataType_Question1 {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input 3 numbers\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (a + b + c)/3;
        System.out.print(d);
        sc.close();

    }
}