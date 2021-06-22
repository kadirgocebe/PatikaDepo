import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int mat;  
        int fiz;
        int kim; 
        int tur; 
        int tar; 
        int muz;

            System.out.print(" Matematik Notunu giriniz : ");
            mat = girdi.nextInt();

            System.out.print(" Fizik Notunu giriniz : ");
            fiz = girdi.nextInt();

            System.out.print(" Kimya Notunu giriniz : ");
            kim = girdi.nextInt();

            System.out.print(" Türkçe Notunu giriniz : ");
            tur = girdi.nextInt();

            System.out.print(" Tarih Notunu giriniz : ");
            tar = girdi.nextInt();

            System.out.print(" Müzik Notunu giriniz : ");
            muz = girdi.nextInt();
      
            int toplam = (mat+fiz+kim+tur+tar+muz);
      int ort = toplam/6;

      System.out.println(" Ortalama notunuz : " + ort);

      switch(ort){
          case 60: 
          case 61:
          case 62:
          case 63:
          case 64:
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 91:
          case 92:
          case 93:
          case 94:
          case 95:
          case 96:
          case 97:
          case 98:
          case 99:
          case 100:
                System.out.println("Geçtin");
          break;
        default:
        System.out.println(" Kaldın ");

      }


}

}
