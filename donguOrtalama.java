import java.util.Scanner;

public class donguOrtalama {
    public static void main(String[] args) {
        int sayi; int i=1, j=0; int toplam=0, ort =0;
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayi=input.nextInt();

        while(i<=sayi){
           
        if (i%3==0 && i%4==0){

            toplam+=i;
            j++;
            System.out.println("koşula uyan sayı :"+i);
        }
            i++;}

       ort =  toplam / j;
        System.out.println("Koşula uyan toplam "+j+" sayı vardır");     
        System.out.println("Koşula Uyan Sayıların Toplamı  : "+toplam);
        System.out.println("Koşula Uyan Sayıların Ortalaması : "+ort);
    }
}
