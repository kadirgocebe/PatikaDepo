import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        int sum=0, sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz  :");
        sayi = input.nextInt();

        for(int i=1; i<sayi; i++){
            
            if(sayi%i==0){
                sum+=i;
            }
        }

        if(sayi==sum){
            System.out.println(sayi+" Sayısı Mükemmel Sayıdır");
        }
        else{
            System.out.println(sayi+" Sayısı Mükemmel Sayı Değildir");
        }

    }
}
