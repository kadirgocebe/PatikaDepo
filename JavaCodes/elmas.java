import java.util.Scanner;

public class elmas {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int uzunluk = input.nextInt();
        
        for (int satir = 0; satir < uzunluk; satir++) {
            System.out.print(satir+" ");
                    for (int sutun = uzunluk; sutun > satir; sutun--) {
                        System.out.print(" ");
            }
            for (int sutun = 0; sutun <= satir; sutun++) {
                        System.out.print("*");
            }
            for (int sutun = 0; sutun < satir; sutun++) {
                        System.out.print("*");
            }
            System.out.print("\n");
        }
            
            
        
             for (int satir = 0; satir < uzunluk; satir++) {
            System.out.print(satir+"  ");
                    for (int sutun = 0; sutun < satir; sutun++) {
                        System.out.print(" ");
            }
                    
             for (int sutun = uzunluk; sutun > satir; sutun--) {
                        System.out.print("*");
            }
                    for (int sutun = uzunluk-1; sutun > satir; sutun--) {
                        System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}





    
