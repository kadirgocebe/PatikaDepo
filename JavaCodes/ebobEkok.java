import java.util.Scanner;

public class ebobEkok {

    public static void main(String[] args) {
        int sayi1, sayi2, ekok=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz  :");
        sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz  :");
        sayi2 = input.nextInt();

        ekok= (sayi1> sayi2) ? sayi1 : sayi2;
 
        while(true)
        {
            if( ekok % sayi1 == 0 && ekok % sayi2 == 0 )
            {
                System.out.println("EKOK = "+ ekok);
                break;
            }
            ++ekok;
        }

        while(sayi1!= sayi2)
        {
            if(sayi1 > sayi2)
                sayi1 -= sayi2;
            else
                sayi2 -= sayi1;
        }
 
        System.out.println("EBOB = " + sayi1);


        
    }
}



 


