package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class App 
{
    public static int faktorijel(int n) {
        int fakt=1;
        for(int i=n; i>1; i--)
        {
            fakt*=i;
        }
        return fakt;
    }

    public static void main( String[] args )
    {
        Scanner ulaz =new Scanner(System.in);
        System.out.println( "Unesite n: " );
        int n= ulaz.nextInt();
        System.out.println("Faktorijel broja je: "+faktorijel(n));
        System.out.println("Sinus broja je: "+Math.sin(n));


    }
}
