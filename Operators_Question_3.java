/*


What will be the output of the following programs :

public class Test {
    public static void main(String[] args){
        
        int x, y, z;
        x = y = z = 2;
        x += y;y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}


 */
import java.util.*;

public class Operators_Question_3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int x, y, z;
        x = y = z = 2;
        x += y;y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}