public class print {
        
public static void phonePrintHeader() {
        
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("| ID | Ürün Adı           | Fiyat      | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
}

public static void notePrintHeader() {
        
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı          | Fiyat     | Marka     | Depolama   | Ekran     | RAM       |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        }

        /* 
Cep Telefonu Listesi

--------------------------------------------------------------------------------------------------------------------------------------
| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      | 
--------------------------------------------------------------------------------------------------------------------------------------
| 1  | SAMSUNG GALAXY A51            | 3199.0 TL | Samsung   | 128       | 6.5       | 32        | 4000.0    | 6         | Siyah     | 
| 2  | iPhone 11 64 GB               | 7379.0 TL | Apple     | 64        | 6.1       | 5         | 3046.0    | 6         | Mavi      | 
| 3  | Redmi Note 10 Pro 8GB         | 4012.0 TL | Xiaomi    | 128       | 6.5       | 35        | 4000.0    | 12        | Beyaz     | 
--------------------------------------------------------------------------------------------------------------------------------------

*/ 
public static void printPhoneList(phone obj1) {
System.out.printf("|%-4d | %-17s | %-10.2f | %-8s | %-10d | %-9.2f | %-9d | %-9.2f | %-9d | %-10s |\n", obj1.P_id,obj1.name,obj1.price,obj1.brand,obj1.P_storage,obj1.P_screen,obj1.P_camera,obj1.P_battery,obj1.P_ram,obj1.color);     
}

public static void printNoteList(notebook obj1) {
        System.out.printf( "|%-4d | %-17s | %-10.2f | %-8s | %-10d | %-9.2f | %-9d |\n", obj1.id,obj1.name,obj1.fiyat,obj1.brand,obj1.storage,obj1.screen,obj1.ram);
}

}



/* 
----------------------------------------------------------------------------------------------------
| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |
----------------------------------------------------------------------------------------------------
| 1  | HUAWEI Matebook 14            | 7000.0 TL | Huawei    | 512       | 14.0      | 16          |
| 2  | LENOVO V14 IGL                | 3699.0 TL | Lenovo    | 1024      | 14.0      | 8           |
| 3  | ASUS Tuf Gaming               | 8199.0 TL | Asus      | 2048      | 15.6      | 32          |
----------------------------------------------------------------------------------------------------
*/ 