import java.util.Scanner;

public class selector {


     
public static String[] markaListesi = null;

public static void adMenusu() {

        Scanner input = new Scanner(System.in);
        System.out.println(" ------- ------- -------");
        System.out.println("ADMİN MENÜSÜ:\n1- Notebook İşlemleri\n2- Telefon İşlemleri\n3- Marka Listeleme\n4- Ana Menü");
            System.out.print("Lütfen Seçim Yapınız : ");
            int adMenSec = input.nextInt();
            while (adMenSec < 1 || adMenSec > 4){
                System.out.println(" ");
                System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
                System.out.println(" ------- ------- -------");
                System.out.println("ADMİN MENÜSÜ: \n1- Notebook İşlemleri \n2- Telefon İşlemleri \n3- Marka Listeleme \n4- Ana Menü ");
                System.out.print("Lütfen Seçim Yapınız : ");
                adMenSec = input.nextInt();
                input.close();
            }
            switch (adMenSec) {
                case 1:
                notebook.notebookAdList();
                    break;
                case 2:
                phone.phoneAdList();
                    break;
                case 3:
                selector.markaListeleme();
                selector.adMenusu();
                    break;
                case 4:
                patikaStore.start();
                    break;
    
                default:
                    break;
            }
}

public static void kulMenusu() {

        Scanner input = new Scanner(System.in);
        System.out.println(" ------- ------- -------");
        System.out.println("KULLANICI MENÜSÜ:\n1- Notebook İşlemleri\n2- Telefon İşlemleri\n3- Marka Listeleme\n4- Ana Menü");
            System.out.print("Lütfen Seçim Yapınız : ");
            int kulMenSec = input.nextInt();
            while (kulMenSec < 1 || kulMenSec > 4){
                System.out.println(" ");
                System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
                System.out.println(" ------- ------- -------");
                System.out.println("KULLANICI MENÜSÜ: \n1- Notebook İşlemleri \n2- Telefon İşlemleri \n3- Marka Listeleme \n4- Çıkış  ");
                System.out.print("Lütfen Seçim Yapınız : ");
                kulMenSec = input.nextInt();
                input.close();
            }
    
            switch (kulMenSec) {
                case 1:
                notebook.notebookKulList();
                    break;
                case 2:
                phone.phoneKulList();
                    break;
                case 3:
                selector.markaListeleme();
                selector.kulMenusu();
                break;
                case 4:
                patikaStore.start();
                break;
    
                default:
                    break;
            }
}

public static void markaListeleme(){
         markaListesi = new String[10];
       
        markaListesi[0] = "Apple";
        markaListesi[1] = "Asus";
        markaListesi[2]= "Huawei";
        markaListesi[3]= "Lenovo";
        markaListesi[4]= "Samsung";
        markaListesi[5]= "Xiaomi";
        markaListesi[6]= "HP";
        markaListesi[7]= "Monster";
        markaListesi[8]= "Casper";
       
       selector.markaPrint(markaListesi);

       } 

public static void markaPrint(String arr[]){
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Mağazamızda Satılan Markaların Listesi Aşağıdadır:\n"); 
        System.out.println("Stokları Görmek için Lütfen İlgili Menüye Gidiniz.\n"); 
        for(int i =0; i<arr.length;i++){
                if(arr[i]==null){
                        System.out.println(" ");
                }else
                        System.out.println(arr[i]);
        }
}




}