
import java.util.Scanner;
public class isPalindrome {

    static boolean isPalindrom(int a) {
        int temp = a;
        int tersSayi = 0; 
        int mod;
    
        while (temp != 0){
            mod = temp % 10;
            tersSayi = (tersSayi* 10) + mod;
            temp /= 10;
        }
        if( a==tersSayi){
        System.out.println(a + " Palindrom Sayidir.");
        return a == tersSayi;}
        else {
            System.out.println(a + " Palindrom Sayı Değildir.");
            return false;
        }
    }

public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int sayi = input.nextInt();
        isPalindrom(sayi);
}
}