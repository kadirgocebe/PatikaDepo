import java.util.Scanner;
public class hesapmak {
    
    static void toplama() {
        Scanner input = new Scanner(System.in);
        int sayi, result = 0, i = 1;
        System.out.println(" ");
        System.out.println("Hesap Makinesi Siz SIFIR değeri girene kadar tüm sayıları toplar");
        while (true) {
            System.out.print(i++ +". sayı :");
            sayi = input.nextInt();
            if (sayi == 0) {
                break;
            }
            result += sayi;
        }
        System.out.println(" ");
        System.out.println("Sonuç : " + result);
        System.out.println(" ");
    }

    static void cikarma() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, result = 0;
        System.out.println(" ");
        System.out.print("1. Sayıyı Giriniz :");
            sayi1 = input.nextInt();
            System.out.println(" ");
        System.out.print("2. Sayıyı Giriniz :");
            sayi2 = input.nextInt();

            result = sayi1-sayi2;
            System.out.println(" ");
        System.out.println("Sonuç : " + result);
        System.out.println(" ");
    }

    static void carpma() {
        Scanner input = new Scanner(System.in);
        int number;
        int result = 1, i = 1;
        System.out.println(" ");
        System.out.println("Hesap Makinesi Siz BİR değeri girene kadar tüm sayıları çarpar");

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println(" ");
        System.out.println("Sonuç : " + result);
        System.out.println(" ");
    }

    static void bolme() {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;
        double result = 0;
        System.out.println(" ");
        System.out.print("1. Sayıyı Giriniz :");
            sayi1 = input.nextDouble();
            System.out.println(" ");
        System.out.print("2. Sayıyı Giriniz :");
            sayi2 = input.nextDouble();

            result = sayi1/sayi2;
            System.out.println(" ");
        System.out.println("Sonuç : " + result);
        System.out.println(" ");
    }

    static void ustel() {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Taban değeri giriniz :");
        int taban = input.nextInt();
        System.out.println(" ");
        System.out.print("Üs değeri giriniz :");
        int ust = input.nextInt();
        int result = 1;

        for (int i = 1; i <= ust; i++) {
            result *= taban;
        }
        System.out.println(" ");
        System.out.println("Sonuç : " + result);
        System.out.println(" ");
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Sayı giriniz :");
        int sayi = input.nextInt();
        int result = 1;

        for (int i = 1; i <= sayi; i++) {
            result *= i;
        }
        System.out.println(" ");
        System.out.println("Sonuç : " + result);
        System.out.println(" ");
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, result = 0;
        System.out.println(" ");
        System.out.print("Modu Alınacak Sayıyı Giriniz :");
            sayi1 = input.nextInt();
            System.out.println(" ");
        System.out.print("Hangi Sayıya Göre Modunu Almak İstediğinizi Giriniz :");
            sayi2 = input.nextInt();

            result = sayi1%sayi2;
            System.out.println(" ");
        System.out.println(sayi1+ " 'in " + sayi2 +" 'e göre Modu :"  + result);
        System.out.println(" ");
    }

    static void dikdortgen() {
        Scanner input = new Scanner(System.in);
        int uzun, kisa, cevre, alan;
        System.out.println(" ");
        System.out.print("Dikdörtgenin UZUN Kenarını Giriniz :");
            uzun = input.nextInt();
            System.out.println(" ");
        System.out.print("Dikdörtgenin KISA Kenarını Giriniz :");
            kisa = input.nextInt();

            cevre = uzun+uzun+kisa+kisa;
            alan= uzun*kisa;
            System.out.println(" ");
        System.out.println("Dikdörtgenin Alanı " +alan +" çevresi ise :" +cevre);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println("");
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    ustel();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                System.out.println(" ");
                System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz !");
                System.out.println(" ");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 0);


    }
}