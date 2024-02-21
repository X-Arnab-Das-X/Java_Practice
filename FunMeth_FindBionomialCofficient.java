import java.util.*;
public class FunMeth_FindBionomialCofficient {
    public static int factorial_n (int n){
        int f = 1;

        for(int i=1 ; i<=n ; i++){
            f = f*i;
        }

        return f;
    }

    public static int factorial_r (int r){
        int g = 1;

        for(int i=1 ; i<=r ; i++){
            g = g*i;
        }

        return g;
    }

    public static int factorial_nmr (int nmr){
        int h = 1;

        for(int i=1 ; i<=nmr ; i++){
            h = h*i;
        }

        return h;
    }

    public static int factorial_ncr (int f , int g , int h ){
        
        int ans = f / (g * h);

        return ans;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int nmr = (n-r);

        int f = factorial_n(n);
        int g = factorial_r(r);
        int h = factorial_nmr(nmr);

        int ans = factorial_ncr(f,g,h);

        System.out.print("Your ans is : " + ans);

        System.out.print("\n\n");

        System.out.print("\n");
        System.out.print(n);
        System.out.print("\n");
        System.out.print(r);
        System.out.print("\n");
        System.out.print(nmr);

    }

}
