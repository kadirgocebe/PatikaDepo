
import java.util.Scanner;
public class uslusayi {
    public static void main(String[] args) {
        int n,r,total=1,i=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz  :");
        n=input.nextInt();
        System.out.print("Lütfen Üs Olarak Yazılacak Sayıyı Giriniz  :");
        r=input.nextInt();

            for(i=1;i<=r;i++){
            total*=n;
            }
            System.out.println("Sonuç : " +total);
    }

}



   

        
