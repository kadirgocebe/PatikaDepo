import java.util.Scanner;
public class harmonik {

    public static void main(String[] args) {
        
        double n;
        double toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Girin  :");
        n = input.nextInt();
        double k=n; //çünkü n while döngüsü sonunda sıfırlanıyor ve n sayısına bölünce ortalama sonsuz çıkıyor
                    //bu nedenle n sayısını alır almaz bir değişkene atayarak sonda kullanabiliyorum
        while(n > 0)
        {
           toplam+= (1/n);
           n--;
           
        }
        double ort= toplam/k;
        System.out.println(" Harmonik Toplam  : " + toplam);
        System.out.println(" Harmonik Ortalama: " + ort);
 
        
    } 
}
