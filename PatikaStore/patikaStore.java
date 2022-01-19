import java.util.Scanner;

public class patikaStore {

    public static void start(){

        System.out.println("Patika Store'a Hoş Geldiniz...");
        System.out.println(" ------- ------- -------");
        System.out.println("Lütfen Giriş Tipi Seçiniz\n1 - Admin Girişi\n2 - Kullanıcı Girişi\n3 - Çıkış");
        System.out.println(" ------- ------- -------");
        System.out.print("Giriş Tipi : ");
        Scanner input = new Scanner(System.in);
        int kullaniciSecimi=input.nextInt();
        System.out.println(" ------- ------- -------");
        
            while (kullaniciSecimi < 1 || kullaniciSecimi > 3){
                System.out.println(" ");
                System.out.println("Yanlış Seçim Yaptınız !");
                System.out.println("Lütfen Tekrar Deneyiniz\n\n1 - Admin Girişi \n2 - Kullanıcı Girişi\n3 - Çıkış");
                System.out.print("Giriş Tipi : ");
                kullaniciSecimi = input.nextInt();
                input.close();
        } 

        if(kullaniciSecimi==3){
            System.out.println(" ------- ------- -------");
            System.out.println(" ------- ------- -------");
            System.out.println("Kullandığınız için teşekkür ederiz...\nTekrar görüşmek üzere...");
            System.out.println(" ------- ------- -------");
            System.out.println(" ------- ------- -------");
            System.exit(0);
        } else 
    
        if(kullaniciSecimi==1){
            System.out.println("Lütfen Admin Şifresini Giriniz !");
            System.out.print("ADMİN ŞİFRESİ  :");
            Scanner inp = new Scanner(System.in);
            int sifre = inp.nextInt();

            if(sifre != 1234){
                System.out.println(" ------- ------- -------------- ------- -------");
                System.out.println("Girdigiğiniz Şifre Doğru Değil... !");
                System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                System.out.println(" ------- ------- -------------- ------- -------");
                System.out.println(" ");
                patikaStore.start();
            }
            selector.adMenusu();
        } else
            selector.kulMenusu();
        }

    

public static void main(String[] args) {
        
   patikaStore.start();
   


}

}
