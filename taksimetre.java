

import java.util.Scanner;

public class taksimetre {

    public static void main(String[] args) {
        
        int km;
        double katsayi = 2.2;
        int baslangic = 10; 

        System.out.print(" Mesafeyi KM cinsinden Giriniz : ");

        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        double total = baslangic+ (km * katsayi);

        if (total<20){
            System.out.print( "Toplam Ücret : 20 TL ");
        }
        else {
        System.out.println("Toplam Ücret : " + total + " TL");
    }

    }
}