
import java.util.Random;
import java.util.Scanner;

public class tahmin {
public static void main(String[] args) {
    
    Random rand = new Random();
    int number = rand.nextInt(100);
    Scanner input = new Scanner(System.in);
    int count=0;

    System.out.println("Merhaba ! Küçük Oyunumuza Hoş Geldiniz ");
    System.out.println("Sistem Rastgele Bir Sayı Seçecek ve Siz de Onu Tahmin Etmeye Çalışacaksınız");
    System.out.println("Unutmayın Yalnızca 5 Hakkınız Var ! ");
   // System.out.println("tutulan sayı : " + number);

        while(count<5){
            //System.out.println("kullanılan hak : " +count);
    System.out.println("Lütfen Bir Sayı Giriniz : ");
    double sayi = input.nextDouble();

    if(sayi<0||sayi>100){
        System.out.println(" Lütfen 0 ile 100 arasında bir sayı giriniz !");
        System.out.println(" Yanlış Girişler Hakkınızdan Düşmektedir !");
        System.out.println("Kalan Hakkınız : " +(4-count));
    }

    if(sayi==number){
        System.out.println(" Tebrikler Doğru Tahmin !");    
        System.exit(0);
    }
        else {
            
            if(sayi<number){
                System.out.println("Daha Büyük Bir Sayı Deneyin");
            }
            else {
                System.out.println("Daha Küçük Bir Sayı Deneyin");
            }
            count++;
        }
}
System.out.println(" -- -- --");
System.out.println("Üzgünüm Doğru Tahmin Edemediniz ! ");
System.out.println("Tahmin Etmeniz Gereken Sayı : " +number +" sayısıydı ");
}

}

