package cz.tul.fm.alg1_week04;

import java.util.Scanner;

//@author marts
public class ukol_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Zadejte libovolný rok: ");
         int rok=sc.nextInt();
         int aktRok=2022;
         int casMeziRoky;
         boolean prestupny=false;
         int dny;
    if (aktRok<rok){
        //bude
        casMeziRoky=rok-aktRok;
        if (rok%4==0 || rok%400==0){
            dny=366;
            System.out.println("Zadaný rok bude přestupný a bude za "+
                    casMeziRoky+" let a bude mít "+dny+" dní");
            prestupny=true;
            }
        else{
            dny=365;
            System.out.println("Zadaný rok nebude přestupný a bude za "+
                    casMeziRoky+" let a bude mít "+dny+" dní");
            prestupny=false;
        }
    }
    else if(rok==aktRok){
        //je
        if (rok%4==0 || rok%400==0){
            dny=366;
            System.out.println("Zadaný aktuální rok je přestupný aa bude mít "
                    +dny+" dní");
            prestupny=true;
        }
        else{
            dny=365;
            System.out.println("Zadaný aktuální rok nebude přestupný "
                    + "a bude mít "+dny+" dní");
            prestupny=false;
        }
        }
    else {
        //byl
        casMeziRoky=aktRok-rok;
        if (rok%4==0 || rok%400==0){
            dny=366;
            System.out.println("Zadaný rok byl přestupný a byl před "+
                    casMeziRoky+" lety a měl "+dny+" dní");
            prestupny=true;
        }
        else{
            dny=365;
            System.out.println("Zadaný rok nebyl přestupný a byl před "+
                    casMeziRoky+" lety a měl "+dny+" dní");
            prestupny=false;
        }
    }
}
}



