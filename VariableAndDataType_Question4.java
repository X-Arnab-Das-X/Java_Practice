/*   

   What will be the type of result in thefollowing Java code?
   

   byte b = 4;
   char c = 'a';
   short s = 512;
   int i = 1000;
   float f = 3.14f;
   double d = 99.9954;
    
   result = (f * b) + (i % c) - (d * s);

*/


import java.util.*;

public class VariableAndDataType_Question4 {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        
        double result = ((f * b) + (i + c) - (d * s));
        System.out.print(result);
        sc.close();

    }
}