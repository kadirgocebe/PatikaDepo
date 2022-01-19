import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        int yatirma,cekme;
        Scanner input = new Scanner(System.in);
        int deneme = 3;
        int bakiye = 1500;
        int secim;
        System.out.println("Dikkat : Yalnızca 3 Deneme Hakkınız Bulunmaktadır !");

        while (deneme> 0) {
            
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("kadir") && password.equals("12345")) {
                deneme=-1;
                System.out.println("Merhaba, Kadir Kod Bankasına Hoşgeldiniz!");
                System.out.println(" ");
                System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                            System.out.println(" ");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();   
                    
                    switch (secim) {
                    case 1:
                    System.out.print("Yatırmak İstediğiniz Para miktarı  : ");
                    yatirma = input.nextInt();
                    bakiye += yatirma;
                    System.out.println(" ");
                    System.out.println("İşlem Sonu bakiyeniz :" +bakiye);
                            break;
                    case 2:
                    System.out.print("Çekmek İstediğiniz Para miktarı  : ");
                     cekme = input.nextInt();
                    if (cekme > bakiye) {
                        System.out.println(" ");
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        bakiye -= cekme;
                        System.out.println(" ");
                        System.out.println("İşlem Sonu bakiyeniz :" +bakiye);
                    }
                            break;
                    case 3: 
                    System.out.println(" ");
                    System.out.println("Bakiyeniz : " + bakiye);
                            break;

                    case 4:
                    System.out.println(" ");
                    System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            break;
                    }}
                    if(deneme==-1){
                        System.out.println(" ");
                        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler !");
                        break;}
                    else {
                        deneme--;}
                        System.out.println(" ");
                        System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                        if (deneme == 0) {
                            System.out.println(" ");
                            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                        } else {
                            System.out.println(" ");
                            System.out.println("Kalan Hakkınız : " + deneme);
                        }

            }
        }
    }


