/* 

What will be the output of the followingprograms :


public class Test {
    public static void main(String[] args){
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + “ , ”);
        System.out.print(exp2);

    }
}



*/



import java.util.*;
public class Operators_Question_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 2 , y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}

/*
 * 
 * the ans is 5 and 4
 * 
 * because for exp2 it is in int for that it is a lossy process so y/x will be 2 not 2.5....
 */