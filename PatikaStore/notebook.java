import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class notebook {
    static Map<Integer, Object> noteMap = new HashMap <Integer, Object>();

    int id,sale,stock,ram,storage;
    float fiyat,screen;
    String name,brand;
    
    public notebook(int id, int sale, int stock, int ram, int storage, float screen, float fiyat, String name,
            String brand) {
        this.id = id;
        this.sale = sale;
        this.stock = stock;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.fiyat = fiyat;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
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


    public static void notebookAdList()  {
        Scanner input = new Scanner(System.in);
        System.out.println(" ------- ------- -------");
        System.out.println("NOTEBOOK MENÜSÜ:\n1-Listeleme\n2-Ekleme\n3-Çıkartma\n4-Üst Menü");
        System.out.print("Lütfen Seçim Yapınız: ");
        int secim= input.nextInt();
        while (secim < 1 || secim > 4){
            System.out.println(" ");
            System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
            System.out.println(" ------- ------- -------");
            System.out.println("NOTEBOOK MENÜSÜ:\n1-Listeleme\n2-Ekleme\n3-Çıkartma\n4-Üst Menü");
            System.out.print("Lütfen Seçim Yapınız : ");
            secim = input.nextInt();
            input.close();
        }
        if(secim==1){
            notebook.listDoldurma();
            notebook.noteList();
            notebook.notebookAdList();
        }
        if(secim==2){
            notebook.ekleme();
        }
        if(secim==3){
            notebook.cikarma();
        }
        if(secim==4){
            selector.adMenusu();      
        }
    }
    
    public static void notebookKulList()  {
        Scanner input = new Scanner(System.in);
        System.out.println(" ------- ------- -------");
        System.out.println("NOTEBOOK MENÜSÜ:\n1-Listeleme\n2-Satış\n3-Üst Menü");
        System.out.print("Lütfen Seçim Yapınız: ");
        int secim= input.nextInt();
        while (secim < 1 || secim > 3){
            System.out.println(" ");
            System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
            System.out.println(" ------- ------- -------");
            System.out.println("NOTEBOOK MENÜSÜ:\n1-Listeleme\n2-Satış\n3-Üst Menü");
            System.out.print("Lütfen Seçim Yapınız : ");
            secim = input.nextInt();
            input.close();
        }
        if(secim==1){
            notebook.listDoldurma();
            notebook.noteList();
            notebook.notebookKulList();
        }
        if(secim==2){
            notebook.satis();
        }
        if(secim==3){
            selector.kulMenusu();
        }
    }

    public static void listDoldurma() {
              
        notebook huawei = new notebook(1, 10, 5, 16, 512, 14, (float) 7000.0, "Matebook 14", "HUAWEI");
        notebook lenovo = new notebook(2, 8, 12, 8, 1024, 14, (float) 3699.0, "V14 IGL", "LENOVO");
        notebook asus = new notebook(3, 5, 12, 32, 2048, (int) 15.6, (float) 8199.0, "Tuf Gaming", "ASUS");

        noteMap.put(1,huawei);
        noteMap.put(2,lenovo);
        noteMap.put(3, asus);
}

    public static void noteList(){
        print.notePrintHeader();
        for(int i=1; i<= noteMap.size();i++){
                 notebook n1 = (notebook) noteMap.get(i);
                 if(noteMap.get(i)==null){
                     i++;
                     continue;
                 } 
                print.printNoteList(n1);
        }
    }
    
    public static void satis() {
        System.out.println(" ------- ------- -------");
                System.out.println("Satış için Patika Sitesine Yönlendirileceksiniz");
                System.out.println("Kabul Ediyor Musunuz? \nY - N");
                Scanner inp = new Scanner(System.in);
                char str = inp.next().charAt(0);

                if(str=='y'|| str=='Y'){
                System.out.println(" ------- ------- -------");
                System.out.println(" ------- ------- -------");
                System.out.println("-- app.patika.dev -- sitesine gidiniz...");
                System.out.println(" ------- ------- -------");
                notebook.notebookKulList();
                } else 
                if(str=='n'|| str=='N'){
                System.out.println(" ");
                System.out.println("Üst Menüye Yönlendiriliyorsunuz... ");
                System.out.println(" ------- ------- -------");
                notebook.notebookKulList(); 
                }else 
                if (str != 'y' || str !='Y' || str != 'n' || str !='N' ){
                        System.out.println(" ");
                        System.out.println("Yanlış Seçim Yaptınız ! Tekrar Deneyiniz... ");
                        System.out.println(" ------- ------- -------");
                        satis();
                    }                 

    }

    public static void ekleme() {

        Scanner input = new Scanner(System.in);
        
        int id,sale,stock,ram,storage;
        float fiyat,screen;
        String name,brand;            
        
        System.out.print("Gerekli Bilgileri Giriniz : ");
        System.out.println(" ------ ------ ----- ------ ------");
        System.out.print("Notebook ID: ");
        id = input.nextInt();

        System.out.print("İndirim Oranı: ");
        sale = input.nextInt();

        System.out.print("Stok Miktarı: ");
        stock = input.nextInt();

        System.out.print("Hafıza Özelliği: ");
        storage = input.nextInt();

        System.out.print("Ram Özelliği: ");
        ram = input.nextInt();

        System.out.print("Fiyat: ");
        fiyat = input.nextFloat();

        System.out.print("Ekran Boyutu: ");
        screen = input.nextFloat();

        System.out.print("Ürün Adı:");
        name = input.next();

        System.out.print("Marka:");
        brand = input.next();

        notebook n = new notebook(id, sale, stock, ram, storage, screen, fiyat, name, brand);

        n.setId(id);
        n.setSale(sale);
        n.setStock(stock);
        n.setStorage(storage);
        n.setRam(ram);
        n.setFiyat(fiyat);
        n.setScreen(screen);
        n.setName(name);
        n.setBrand(brand);
   
        noteMap.put(n.getId(),n);
        notebook.noteList();
        notebook.notebookAdList();        

    }

    public static void cikarma() {

        notebook.noteList();
        System.out.print("Lütfen Çıkarmak İstediğiniz Ürünün ID kodunu giriniz: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        noteMap.remove(id);
        notebook.noteList();        
        notebook.notebookAdList();        
    }
}

