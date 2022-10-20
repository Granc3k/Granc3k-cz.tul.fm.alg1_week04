package cz.tul.fm.alg1_week04;
import java.util.Scanner;
        
//@author marts
public class ukol_4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Zadejte stranu AB: ");
        double c= sc.nextDouble();
        System.out.println("Zadejte stranu BC: ");
        double a= sc.nextDouble();
        System.out.println("Zadejte stranu AC: ");
        double b= sc.nextDouble();
        boolean sestrojeni;
        if ((a+b>c) && (Math.abs(a-b)<c)){
            sestrojeni = true;
        }
        else {
            sestrojeni = false;
        }    
        if (sestrojeni==true){
            System.out.println("Trojúhelník lze sestavit :) Clap");
        }
        else {
            System.out.println("Trojúhelník nelze sestavit :( Sadge");
        }
    }
}
