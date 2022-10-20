
package cz.tul.fm.alg1_week04;
import java.util.Scanner;
// @author marts
public class ukol_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte x souřadnici středu kružnice: ");
        double s_x=sc.nextDouble();
        System.out.println("Zadejte y souřadnici středu kružnice: ");
        double s_y=sc.nextDouble();
        System.out.println("Zadejte poloměr kružnice: ");
        double r=sc.nextDouble();
        System.out.println("Zadejte x souřadnici bodu:");
        double x_x=sc.nextDouble();
        System.out.println("Zadejte y souřadnici bodu:");
        double x_y=sc.nextDouble();
        //střed
        if ((x_x==s_x) && (x_y==s_y)){
            System.out.println("Bod je ve středu kružnice");
        }
        else{
        }
        double vzdal_s_x = Math.sqrt(Math.pow((x_x-s_x),2)+Math.pow((x_y-s_y), 2));
        //na kružnici
        if (vzdal_s_x==r){
            System.out.println("Bod je na kružnici");
        }
        else{
        }
        //v kružnici
        if (vzdal_s_x<r){
            System.out.println("Bod je v kružnice");
        }
        else{
        }
        //mimo
        if (vzdal_s_x>r){
            System.out.println("Bod je mimo kružnici");
        }
        else{
        }
        // "||" v ifu je "nebo"
    }
}
