import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        
int armutkilo, elmakilo, domatkilo, muzkilo, patkilo;

Scanner input = new Scanner(System.in);

System.out.print("Armut Kilo : ");
        armutkilo = input.nextInt();
System.out.print("Elma Kilo : ");
        elmakilo = input.nextInt();
System.out.print("Domates Kilo : ");
        domatkilo = input.nextInt();
System.out.print("Muz Kilo : ");
        muzkilo = input.nextInt();
System.out.print("Patlıcan Kilo : ");
        patkilo = input.nextInt();

        Double toplam = (armutkilo*2.14)+(elmakilo*3.67)+(domatkilo*1.11)+(muzkilo*0.95)+(patkilo*5.00); 
System.out.println("Toplam Borcunuz : " +toplam + " TL");
        

    }
}
