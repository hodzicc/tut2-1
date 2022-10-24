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
    public static double sinus(double n){
        double rad=n*Math.PI/180;
        double sin=0.0;
        int j,fac;
        for(int i=1; i<=10; i++){
            fac=1;
            for(j=2; j<=2*i+1; j++){
                fac*=j;
            }
            sin+=Math.pow(-1.0,i)*Math.pow(rad,2*i+1)/fac;
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
