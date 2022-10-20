package cz.tul.fm.alg1_week04;

import java.util.Scanner;

//@author marts
public class ukol_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte první část rodného čísla: ");
        int cis_1=sc.nextInt();
        System.out.println("Zadejte druhou část rodného čísla:");
        int cis_2=sc.nextInt();
        int r_cis=Integer.parseInt(cis_1+""+cis_2);//spojení 2 čísel
        //var
        boolean validni;
        int r_cisDeleni9=r_cis/10;
        int zbytekPoDeleni9=r_cisDeleni9%11;
        int posledniCislo=r_cis-r_cisDeleni9*10;
        //cal
        if ((zbytekPoDeleni9==10) && (posledniCislo==0)){
            System.out.println("Toto rodné číslo je validní");
            validni=true;
        }
        else if(zbytekPoDeleni9==posledniCislo){
            System.out.println("Toto rodné číslo je validní");
            validni=true;
        }
        else{
            System.out.println("Toto rodné číslo není validní");
            validni=false;
        }
                
        
        
    }
}
