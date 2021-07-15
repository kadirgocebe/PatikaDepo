import java.util.Scanner;


public class sicaklik{

    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sıcaklık Giriniz   :");
        heat = input.nextInt();

        if(heat<=5){
            System.out.println("Hava çok soğuk tam KAYAK havası !");}

        if(heat>5 && heat<=15){
            System.out.println("Hava biraz serin SİNEMAYA gidilir !");}
            
        if(heat>15 && heat<= 25){
            System.out.println("Hava ideal tam dışarıda PİKNİK havası ! ");  }
            
        if(heat>25){
            System.out.print("Hava çok sıcak koş YÜZMEYE !");
           
        }

            

    }

}
