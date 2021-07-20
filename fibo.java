import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        int a=0, b=1, c, sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kaç Basamak Fibonacci Hesaplanmasını İstediğinizi Giriniz  :");
        sayi = input.nextInt();

        System.out.print(a+" - "+b);
        for(int i=0;i<=sayi;i++){
           c=a+b;
            System.out.print(" - "+c);
            a=b;
            b=c;
        }
    }
}

