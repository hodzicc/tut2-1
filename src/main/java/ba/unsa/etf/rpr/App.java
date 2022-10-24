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
    public static double sinus(int n){
        double rad=n*1./180.*Math.PI;
        double sin=rad;
        for(int i=1; i<=10; i++){
            if(i%2==0)
            sin+=Math.pow(rad,2*i+1)/faktorijel(2*i+1);
            else
                sin-=Math.pow(rad,2*i+1)/faktorijel(2*i+1);
        }
        return sin;
    }
    public static void main( String[] args )
    {
        Scanner ulaz =new Scanner(System.in);
        System.out.println( "Unesite n: " );
        int n= ulaz.nextInt();
        System.out.println("Faktorijel broja je: "+faktorijel(n));
        System.out.println("Sinus broja je: "+sinus(n));


    }
}
