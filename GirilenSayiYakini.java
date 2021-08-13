import java.util.Scanner;
import java.util.Arrays;
public class GirilenSayiYakini {
    public static void main(String[] args) {
        
        int[] list = {15,12,788,1,-1,-778,2,0};
        int counter1=0;
        int counter2=0;

        System.out.println("Lütfen Bir Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        Arrays.sort(list);
        System.out.print("Kullanılan Dizi : ");
        for(int i= 0; i<list.length;i++){ 
            
            System.out.print(+list[i]+" ");
            if(list[i]<a){
                 counter1++;
            }
           

        }
        System.out.println(" ");
        System.out.println("Girilen sayıdan büyük en yakın sayı :" +list[counter1]);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" +list[counter1-1]);
      

        
    }

}
