import java.util.Scanner;
 
public class siralama {
 
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("ilk sayiyi giriniz  : ");
		int a = input.nextInt();
		System.out.print("İkinci sayiyi giriniz  : ");
		int b = input.nextInt();
		System.out.print("Üçüncü sayiyi giriniz  : ");
		int c = input.nextInt();
		
		 if (a >= b){ 
	            if (b >= c)
	                System.out.print("Üç sayının sıralaması: " + c + " "+ b + " " + a);
 
	            else if  (c >= a)
	                System.out.print("Üç sayının sıralaması: " + b + " "+ a + " " + c);
 
	            else if (a > c)
	                System.out.print("Üç sayının sıralaması: " + b + " " + c + " " + a);
	    }
 
	    if (b > a){
	        if (c >= b)
	            System.out.print("Üç sayının sıralaması: " + a + " " + b + " "+ c);
	        else if (c >= a)
	            System.out.print("Üç sayının sıralaması: " + a + " " + c + " " + b);
	        else if (a > c)
	            System.out.print("Üç sayının sıralaması: " + c + " " + a + " " + b);   
	    }
		
 
	}
 
}
