import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir yıl Giriniz :  ");
        yil=input.nextInt();

        if(yil%4 == 0){
                            if(yil%100==0){
                                                 if(yil%400==0){
                                                                 System.out.println(yil+" yılı bir artık YILDIR ");
                                                                 System.exit(0);
                                                                }
                                                 else{
                                                                  System.out.println(yil+"  bir artık yıl DEĞİLDİR");
                                                                        System.exit(0);}
                                                                }
                           
                                                                     
                        System.out.println(yil+" yılı bir artık YILDIR "); 
                        System.exit(0);  }                   
        else               
            System.out.println(yil+"  bir artık yıl DEĞİLDİR");
                    

                         
}}
