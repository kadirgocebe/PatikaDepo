import java.util.Scanner;
public class recUstHesaplama {



    static int ustel(int a, int b){
        
        if (b==0)
        return 1;
        else if(a==1)
        return 1;
        else 
        return a*ustel(a,b-1);

    }

public static void main(String[] args) {
    
Scanner girdi = new Scanner(System.in);
System.out.print("Lütfen Taban Sayısını Giriniz  : ");
int taban = girdi.nextInt();
System.out.print("Lütfen Üstel Sayıyı Giriniz  : ");
int ust = girdi.nextInt();

System.out.println(taban +" üzeri "+ ust + " = " + ustel(taban,ust));


}
    
}

