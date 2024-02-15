import java.util.*;
public class ConState_Loops_EnterNumber {
    public static void main (String args[]){
        for (int i = 1 ; i <= 5 ; i++){
            if ( i == 3){
                continue;
            }
            System.out.print(i);
        }
    }
}