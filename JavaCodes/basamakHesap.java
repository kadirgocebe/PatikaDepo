import java.util.Scanner;
public class basamakHesap {
    public static void main(String[] args) {
        
        int toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Girin  :");
        int sayi = input.nextInt();
        while(sayi != 0)
        {
           toplam=(sayi%10)+toplam;
           sayi /= 10;
        }
 
        System.out.println("Basamak Toplamı: " + toplam);
    } 
}
