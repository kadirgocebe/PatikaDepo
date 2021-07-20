import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        int a, min=0, max=0; 
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kaç Tane Sayi Girmek İstediğiniz Yazınız : ");
        a= input.nextInt();

        for (int i=0; i<a; i++){
            System.out.print((i+1)+ " Numaralı Sayıyı Giriniz  :");
            int sayi=input.nextInt();
            if (i==0)
            {
                max=sayi;
                min=sayi;
            }
            
            if (sayi>max)
                max=sayi;
            
            if (sayi<min)
                min=sayi;
        }
        
        System.out.println("girdiginiz " +a+ " sayi icinden en büyük olanı: "+max);
        System.out.println("girdiginiz " +a+ " sayi icinden en küçük olan: "+min);
        
    }
}

