/* 

Enter cost of 3 items from the user (using float datatype) a pencil , a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

*/
import java.util.*;

public class VariableAndDataType_Question3 {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input your expences\n");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = (a + b + c);
        float e = (d * 18/100 + d);
        System.out.print(e);
        sc.close();

    }
}