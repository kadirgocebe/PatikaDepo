import java.util.Scanner;
public class ucak {
    public static void main(String[] args) {
        int yol, yas, trip;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen KM Cinsinden Yol Giriniz  : ");
        yol = input.nextInt();
        if(yol<=0 || yol>100000 ){
            System.out.println("Geçersiz bir veri girdiniz ! Lütfen Baştan Başlayın...");
            System.exit(0);
                                }
                                 

        System.out.print("Lütfen Yaşınızı Giriniz  : ");
        yas = input.nextInt();
        if(yas<=0 || yas>=130 ){
            System.out.println("Geçersiz bir veri girdiniz ! Lütfen Baştan Başlayın...");
            System.exit(0);
                                }

        System.out.print("Lütfen Bir Yolculuk Tipi Seçiniz : \n TEK YÖN ==> 1 / GİDİŞ DÖNÜŞ ==> 2   : ");
        trip = input.nextInt();
        if(trip<1 || trip>2 ){
            System.out.println("Geçersiz bir veri girdiniz ! Lütfen Baştan Başlayın...");
            System.exit(0);
                              }


        double ucret = yol * 0.10;
        if(yas<=12){
            ucret= ucret/2;
        } else if (yas>12 && yas <= 24){
            ucret = ucret * 0.90;

        }else if ( yas >= 65){
            ucret = ucret * 0.70;
        }

        if(trip==2){
            ucret=ucret*0.8;
        }
        System.out.println("  ");
        System.out.println(" Hesaplanan Yol Ücreti  :  " +ucret+ "  TL'dir");

    }
}



/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */
