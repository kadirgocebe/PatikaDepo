import java.util.Scanner;

public class recFibo {

    static int fibo(int a){
        
        if (a == 1 || a == 2) {
            return 1;
        }
            
            else{
                 int result= fibo(a - 1) + fibo(a - 2);
                 return result;
                
                }
                
    }

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hesaplanmasını istediğiniz Fibonacci Basamağını Yazınız  : ");
        int sayi= input.nextInt();
        for(int i =1; i<=sayi;i++){
            System.out.print(fibo(i)+" ");
        }
} 
}


