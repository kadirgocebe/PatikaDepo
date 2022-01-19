
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phone {

        static Map<Integer, Object> phoneMap = new HashMap <Integer, Object>();
        int P_id,P_sale,P_stock,P_storage,P_ram,P_camera;
        float price,P_screen,P_battery;
        String name, brand, color;


        
        public phone(int p_id, int p_sale, int p_stock, int p_storage, int p_camera, int p_ram, 
                        float price, float p_screen,float p_battery, String name, String brand, String color) {
                P_id = p_id;
                P_sale = p_sale;
                P_stock = p_stock;
                P_storage = p_storage;
                P_screen = p_screen;
                P_battery = p_battery;
                P_ram = p_ram;
                P_camera=p_camera;
                this.price = price;
                this.name = name;
                this.brand = brand;
                this.color = color;
        }

        public int getP_camera() {
                return P_camera;
        }
        public void setP_camera(int p_camera) {
                P_camera = p_camera;
        }
        public int getP_id() {
                return P_id;
        }
        public void setP_id(int p_id) {
                P_id = p_id;
        }
        public int getP_sale() {
                return P_sale;
        }
        public void setP_sale(int p_sale) {
                P_sale = p_sale;
        }
        public int getP_stock() {
                return P_stock;
        }
        public void setP_stock(int p_stock) {
                P_stock = p_stock;
        }
        public int getP_storage() {
                return P_storage;
        }
        public void setP_storage(int p_storage) {
                P_storage = p_storage;
        }
        public float getP_screen() {
                return P_screen;
        }
        public void setP_screen(float p_screen) {
                P_screen = p_screen;
        }
        public float getP_battery() {
                return P_battery;
        }
        public void setP_battery(float p_battery) {
                P_battery = p_battery;
        }
        public int getP_ram() {
                return P_ram;
        }
        public void setP_ram(int p_ram) {
                P_ram = p_ram;
        }
        public float getPrice() {
                return price;
        }
        public void setPrice(float price) {
                this.price = price;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public String getBrand() {
                return brand;
        }
        public void setBrand(String brand) {
                this.brand = brand;
        }
        public String getColor() {
                return color;
        }
        public void setColor(String color) {
                this.color = color;
        } 

  
        public static void phoneAdList() {
                Scanner input = new Scanner(System.in);
                System.out.println(" ------- ------- -------");
                System.out.println("TELEFON MENÜSÜ:\n1-Listeleme\n2-Ekleme\n3-Çıkartma\n4-Üst Menü");
                System.out.print("Lütfen Seçim Yapınız: ");
                int secim= input.nextInt();
                while (secim < 1 || secim > 4){
                    System.out.println(" ");
                    System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
                    System.out.println(" ------- ------- -------");
                    System.out.println("TELEFON MENÜSÜ:\n1-Listeleme\n2-Ekleme\n3-Çıkartma\n4-Üst Menü");
                    System.out.print("Lütfen Seçim Yapınız : ");
                    secim = input.nextInt();
                    input.close();
                }
                if(secim==1){
                        phone.listDoldurma();
                        phone.phoneList();
                        phone.phoneAdList();
                }
                if(secim==2){
                        phone.ekleme();
                }
                if(secim==3){
                        phone.cikarma();
                }
                if(secim==4){
                        selector.adMenusu();      
                }
            }
            
        public static void phoneKulList()  {
                Scanner input = new Scanner(System.in);
                System.out.println(" ------- ------- -------");
                System.out.println("TELEFON MENÜSÜ:\n1-Listeleme\n2-Satış\n3-Üst Menü");
                System.out.print("Lütfen Seçim Yapınız: ");
                int secim= input.nextInt();
                while (secim < 1 || secim > 3){
                    System.out.println(" ");
                    System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
                    System.out.println(" ------- ------- -------");
                    System.out.println("TELEFON MENÜSÜ:\n1-Listeleme\n2-Satış\n3-Üst Menü");
                    System.out.print("Lütfen Seçim Yapınız : ");
                    secim = input.nextInt();
                    input.close();
                }
                if(secim==1){
                        phone.listDoldurma();
                        phone.phoneList();
                        phone.phoneKulList();
                }
                if(secim==2){
                        phone.satis();
                }
                if(secim==3){
                        selector.kulMenusu();
                }
            }                

        public static void listDoldurma() {
              
                phone samsung= new phone(1, 5, 22, 128, 32, 6, (float) 3199.0,(float) 6.5,  (float) 4000.0, "GALAXY A51 ", "SAMSUNG", "Siyah");
                phone apple= new phone(2, 3, 42, 64,32,6, (float) 7379.0, (float)6.1,(float)3046.0, "IPhone 11", "APPLE", "Mavi");
                phone xiaomi= new phone(3, 12, 11, 128,32,12, (float) 4012.0, (float) 6.5, (float) 4000.0, "Redmi Note 10 Pro", "XIAOMI", "Beyaz");

                phoneMap.put(1,samsung);
                phoneMap.put(2,apple);
                phoneMap.put(3, xiaomi);
        }
            
        public static void phoneList() {
                
                print.phonePrintHeader();
                for(int i=1; i<= phoneMap.size();i++){
                         phone p1 = (phone) phoneMap.get(i);
                         if(p1==null){
                                i++;
                               continue;
                            }
                        print.printPhoneList(p1);
                }
                
            
                            }
        
        public static void ekleme() {

                Scanner input = new Scanner(System.in);
                int p_id,p_ram,p_sale,p_stock,p_storage,p_camera;
                float price,p_screen,p_battery;
                String color,name,brand;            
                
                System.out.print("Gerekli Bilgileri Giriniz : ");
                System.out.println(" ------ ------ ----- ------ ------");
                System.out.print("Telefon ID: ");
                p_id = input.nextInt();

                System.out.print("İndirim Oranı: ");
                p_sale = input.nextInt();

                System.out.print("Stok Miktarı: ");
                p_stock = input.nextInt();

                System.out.print("Hafıza Özelliği: ");
                p_storage = input.nextInt();

                System.out.print("Kamera Pikseli: ");
                p_camera = input.nextInt();

                System.out.print("Ram Özelliği: ");
                p_ram = input.nextInt();

                System.out.print("Fiyat: ");
                price = input.nextFloat();

                System.out.print("Ekran Boyutu: ");
                p_screen = input.nextFloat();

                System.out.print("Pil: ");
                p_battery = input.nextFloat();

                System.out.print("Ürün Adı: ");
                name = input.next();

                System.out.print("Marka:");
                brand = input.next();

                System.out.print("Renk:");
                color = input.next();

                phone p = new phone(p_id, p_sale, p_stock, p_storage, p_camera, p_ram, price, p_screen, p_battery, name, brand, color);     
                p.setP_id(p_id);
                p.setP_sale(p_sale);
                p.setP_stock(p_stock);
                p.setP_storage(p_storage);
                p.setP_camera(p_camera);
                p.setP_ram(p_ram);
                p.setPrice(price);
                p.setP_screen(p_screen);
                p.setP_battery(p_battery);
                p.setName(name);
                p.setBrand(brand);
                p.setColor(color);
                
                phoneMap.put(p.getP_id(),p);
                phone.phoneList();
                phone.phoneAdList();
                
        }
        
        public static void cikarma() {

                phone.phoneList();
                System.out.print("Lütfen Çıkarmak İstediğiniz Ürünün ID kodunu giriniz: ");
                Scanner input = new Scanner(System.in);
                int id = input.nextInt();
                phoneMap.remove(id);
                phone.phoneList();
                phone.phoneAdList();
                
        }

        public static void satis()  {

                System.out.println(" ------- ------- -------");
                System.out.println("Satış için Patika Sitesine Yönlendirileceksiniz");
                System.out.println("Kabul Ediyor Musunuz? \nY - N");
                Scanner inp = new Scanner(System.in);
                char str = inp.next().charAt(0);

                if(str=='y'|| str=='Y'){
                System.out.println(" ------- ------- -------");
                System.out.println(" ------- ------- -------");
                System.out.println("app.patika.dev sitesine gidiniz...");
                System.out.println(" ------- ------- -------");
                phone.phoneKulList();
                } else 
                if(str=='n'|| str=='N'){
                System.out.println(" ");
                System.out.println("Üst Menüye Yönlendiriliyorsunuz... ");
                System.out.println(" ------- ------- -------");
                phone.phoneKulList(); 
                }else 
                if (str != 'y' || str !='Y' || str != 'n' || str !='N' ){
                        System.out.println(" ");
                        System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
                        System.out.println(" ------- ------- -------");
                        satis();
                    }                 
        }

}
