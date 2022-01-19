import java.util.Scanner;

public class zodiak {
public static void main(String[] args) {
int tarih, mod;    

Scanner input = new Scanner(System.in);
System.out.print("Lütfen Doğum Yılınızı Giriniz : ");
tarih = input.nextInt();

mod = tarih%12;

switch (mod) {
    case 0:
        System.out.println("Çinlilere Göre siz Bir MAYMUN olmalısınız :) ");
        break;
    case 1:
    System.out.println("Çinlilere Göre siz Bir HOROZ olmalısınız :) ");
        break;
    case 2:
    System.out.println("Çinlilere Göre siz Bir KÖPEK olmalısınız :) ");
        break;
    case 3:
    System.out.println("Çinlilere Göre siz Bir DOMUZ olmalısınız :) ");
       break;
    case 4:
    System.out.println("Çinlilere Göre siz Bir FARE olmalısınız :) ");
        break;
    case 5:
    System.out.println("Çinlilere Göre siz Bir ÖKÜZ olmalısınız :) ");
        break;
    case 6:
    System.out.println("Çinlilere Göre siz Bir KAPLAN olmalısınız :) ");
        break;
    case 7:
    System.out.println("Çinlilere Göre siz Bir TAVŞAN olmalısınız :) ");
        break;
    case 8:
    System.out.println("Çinlilere Göre siz Bir EJDERHA olmalısınız :) ");
        break;
    case 9:
        System.out.println("Çinlilere Göre siz Bir YILAN olmalısınız :) ");
            break;
    case 10:
        System.out.println("Çinlilere Göre siz Bir AT olmalısınız :) ");
            break;
    case 11:
    System.out.println("Çinlilere Göre siz Bir KOYUN olmalısınız :) ");
        break;   

    default:

    System.out.println(" BÖYLE BİR DOĞUM TARİHİ OLABİLİR Mİ ? TEKRAR DENEYİN ");
        break;
}
}    
}

/*

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun */
