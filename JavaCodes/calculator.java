import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, c; 

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.println("Hangi işlemi yapmak istersiniz ?");
        System.out.print(" 1 toplama - 2 çıkarma - 3 çarpma - 4 bölme \t");
        c = input.nextInt();
    


    switch (c) {
        case 1:
            System.out.print("Sonuç = " +(a+b));
            break;
        case 2:
            System.out.print("Sonuç = " +(a-b));
            break;
        case 3:
            System.out.print("Sonuç = "+ (a*b));
            break;
        case 4:
            System.out.print("Sonuç = " +(a/b));
            break;
        default:
            System.out.print("Yanlış bir rakam girdiniz tekrar deneyin. ");
            break;
    }

    }

}

