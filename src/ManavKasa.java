import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam;
        int armutKG,elmaKG,domatesKG,muzKG,patlicanKG;
        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKG=input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKG=input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKG=input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKG=input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKG=input.nextInt();

        toplam=(armut*armutKG)+(elma*elmaKG)+(domates*domatesKG)+(muz*muzKG)+(patlican*patlicanKG);

        System.out.println("Toplam tutar : "+toplam+"TL dir.");

    }
}
