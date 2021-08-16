import java.util.Arrays;
import java.util.Scanner; 
public class diziSiralama {
 
    public static void main(String[] args) {

        int a, b=0;
        
        
        System.out.println("Lütfen kaç elemanlı bir dizi yaratacağınızı giriniz : ");
        Scanner input = new Scanner(System.in);
        a= input.nextInt();
        int[] dizi= new int[a];

        for(int i =0; i<dizi.length; i++){
            System.out.println("Lütfen dizinin "+(i+1) +" 'inci elemanını giriniz : ");
            b=input.nextInt();
            dizi[i]=b;
        
        }

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
          
        
    }
}
