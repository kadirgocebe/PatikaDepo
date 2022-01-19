
import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        
        double a; double b; double c; double u; double alan1; double alan2;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenarı Giriniz : ");
        a = input.nextDouble();
        System.out.print("İkinci kenarı Giriniz : ");
        b = input.nextDouble();
        System.out.print("Üçüncü kenarı Giriniz : ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        System.out.println("U : " +u);
       
        alan1 = u*(u-a)*(u-b)*(u-c);
        alan2 = Math.sqrt(alan1);
        System.out.println("Alan : " +alan2);

    }
    
}
