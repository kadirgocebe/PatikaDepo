import java.util.Scanner;

public class kuvvetBul {
    public static void main(String[] args) {
        int sayi; int i=1;

        Scanner input = new Scanner(System.in);
        System.out.print("lütfen Sınır Sayısını Giriniz  :");
        sayi = input.nextInt(); 

        for(i=1; i<=sayi; i*=4){
                    System.out.println("4'ün kuvveti olan Sayı :" +i);
                                            }
         for(i=1; i<=sayi; i*=5){
                    System.out.println("5'in kuvveti olan Sayı :" +i);
                                                                        }
                                

    }
}




// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

