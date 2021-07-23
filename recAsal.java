import java.util.Scanner;


public class recAsal {

    static int isPrime(int a, int b){

        if (a<2)
        return 0;
        if(b==1)
        return 1;
        if (a%b==0)
        return 0;
    else
        return isPrime(a,b-1);
    
    }

    public static void main(String[] args) {
        
Scanner girdi = new Scanner(System.in);
System.out.print("Lütfen Bir Sayı Giriniz : ");
int sayi = girdi.nextInt();

int sonuc = isPrime (sayi, sayi/2);

if (sonuc == 0)
System.out.println(sayi+ " Asal sayi degildir" );
else
System.out.println(sayi+ " Asal Sayıdır");
    }
    
}

