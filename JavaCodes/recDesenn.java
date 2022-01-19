import java.util.Scanner;

public class recDesenn {


    static int desen (int sayi1, int sayi2){
        System.out.print(sayi1 + " " );
        int yenisayi = sayi1 - 5;
        if (yenisayi<=0){
            System.out.print(yenisayi + " " );
            for(int i=5;i<=sayi2;i+=5){
                 System.out.print(i+ " ");
           }
           return 0;
        }
        return desen(yenisayi,sayi2);
    }

    
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz  : ");
        int sayi = girdi.nextInt();

        desen(sayi,sayi);
    }
}
