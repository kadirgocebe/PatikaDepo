import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class bmi {
    public static void main(String[] args) {
        
        double boycm;
        double kilo; 
        
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu CM cinsinden girniz : ");
        boycm = input.nextDouble();
        double boym = boycm/100;
        System.out.println("boy metre : " +boym);
        System.out.print("Lütfen Kilonuzu KG cinsinden girniz : ");
        kilo = input.nextDouble();

        double bmi = kilo/(boym*boym); 
        
        if(bmi<=18.5){
            System.out.println(" Vücut Kitle İndeksiniz : " + bmi + " ZAYIF");
                    }
        else if (18.5>bmi || bmi <= 25){
    
            System.out.println(" Vücut Kitle İndeksiniz : " + bmi + " SAĞLIKLI");
                                }
        else if(25<bmi || bmi<30){

            System.out.println(" Vücut Kitle İndeksiniz : " + bmi + " KİLOLU");
                            }
        else if(30<bmi || bmi<40){

            System.out.println(" Vücut Kitle İndeksiniz : " + bmi + " ŞİŞMAN");
                            }
        else {

            System.out.println(" Vücut Kitle İndeksiniz : " + bmi + " OBEZ");
        }
        
        

    }
}


