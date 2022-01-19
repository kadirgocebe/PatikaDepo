
import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double para; double oran1 = 0.18; double oran2 = 0.08; double kdvTutari; double kdvliPara;
        Scanner input = new Scanner(System.in);
        System.out.print("Para Miktarını Giriniz : ");
        para = input.nextDouble();
    
     if(para<=1000){
         kdvTutari = para * oran1 ; 
         kdvliPara = kdvTutari + para; 
        System.out.println("Girilen Tutar : " + para);
        System.out.println("Hesaplanan KDV Tutarı : "+ kdvTutari);
        System.out.println("KDV dahil Tutar : " + kdvliPara);
        }
        else {
            kdvTutari = para * oran2 ; 
            kdvliPara = kdvTutari + para; 
           System.out.println("Girilen Tutar : " + para);
           System.out.println("Hesaplanan KDV Tutarı : "+ kdvTutari);
           System.out.println("KDV dahil Tutar : " + kdvliPara);

        }
    }
}
