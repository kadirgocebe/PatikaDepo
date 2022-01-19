
import java.util.Scanner;



public class kullanici {
    public static void main(String[] args) {
        
        String userName; 
        String pass; 
        String yenipass;
        int secim; 
        
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        userName = input.nextLine();
        System.out.print("Kullanıcı Parolası : ");
        pass = input.nextLine();

        if(userName.equals("kadir") && pass.equals("kadir123")){
            System.out.println("Giriş Başarılı !");
            System.out.println("Kullanıcı Adı :" +userName);
                    System.out.println("Şifre : "+pass);
        } else {

            System.out.println("Giriş Bilgileriniz Yanlış !");
            System.out.println("Yeni Şifre Belirlemek İster Misiniz ? ");
            System.out.print("Evet ise 1 Hayır ise 2 giriniz...   :");
            secim=input.nextInt();
            
            switch (secim) {
                case 1:
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni bir şifre giriniz   :");
                yenipass = inp.nextLine();

                    if(yenipass.equals("kadir123")){
                    System.out.print("Eski şifre ile aynı lütfen değişik bir şifre giriniz   :");
                    Scanner ink = new Scanner(System.in);
                    yenipass = ink.nextLine();  
                    System.out.println("Yeni Şifre Oluşturuldu !"); 
                    System.out.println("Kullanıcı Adı : kadir ");
                    System.out.println("Yeni Şifre : "+yenipass);
                                                  } 
                             else {
                             System.out.println("Şifre Oluşturuldu !");
                             System.out.println("Kullanıcı Adı  : kadir" );
                             System.out.println("Yeni Şifre     : "+yenipass);    }
                break;
                
                case 2:
                System.out.println("Şifrenizi Hatırlamakta Başarılar Dilerim !");
                break;

                default:
                System.out.println("Yanlış bir tuşa bastınız baştan başlayın");
                    break;
                            }
                    }
        }




    }

