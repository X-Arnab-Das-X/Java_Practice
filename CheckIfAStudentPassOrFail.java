import java.util.*;

public class CheckIfAStudentPassOrFail {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input your number\n");

        float marks = sc.nextFloat();

        String a =  (marks >= 33)? "Pass" : "Fail";
        System.out.print(a);



    }
}