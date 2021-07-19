import java.util.Scanner;

public class tekTop {
    public static void main(String[] args) {
        
        int sayi; int toplam=0;
        Scanner input = new Scanner(System.in);
        
        do {
        System.out.print("Lütfen Bir Sayı Giriniz  :");
        sayi = input.nextInt();

        if(sayi%2==0 && sayi%4==0){
            toplam+=sayi;
        }
            } while(sayi%2==0);

            System.out.println("Sayıların Toplamı :" +toplam);
    }
}





//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
//girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.