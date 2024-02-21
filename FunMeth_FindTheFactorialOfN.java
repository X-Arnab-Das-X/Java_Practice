import java.util.*;
public class FunMeth_FindTheFactorialOfN{

    public static int factorial (int n){
        int f = 1;

        for(int i=1 ; i<=n ; i++){
            f = f*i;
        }

        return f;
    }




    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

    
        System.out.print("enter your number : ");
    
        int n = sc.nextInt();

    
        int a = factorial(n);
    
        System.out.print(a);

    
        //   or   //

    
        //System.out.print(factorial(n));

    

    }

}