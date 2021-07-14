import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
       
        int r; double pi = 3.14; int a;
        Scanner inp = new Scanner(System.in);
        
        
    System.out.print("Lütfen Dairenin Yarıçapını Giriniz : ");
    r = inp.nextInt();
    System.out.print("Lütfen Daire Parçasının Merkez Açısını Giriniz : ");
    a = inp.nextInt();
    
    double alan = pi*r*r;
    double cevre = 2*pi*r;
    double parcaAlan = (alan*a)/360;

    System.out.println("Dairenin Alanı : " + alan);
    System.out.println(" Dairenin Çevresi : " + cevre);
    System.out.println(" Daire Parçasının Alanı : " + parcaAlan);


    }
}
