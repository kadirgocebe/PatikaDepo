import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kelime giriniz: ");
        String kelime = input.nextLine();
        String yenikelime = "";
        
        for(int i = (kelime.length()-1); i >= 0; i--)
        {
            yenikelime += kelime.charAt(i);
        }
        if(yenikelime.equals(kelime)) {
            System.out.println("Girilen " +kelime +" Kelimesi Palindrom bir kelimedir.");
        }
        else {
            System.out.println("Girdiginiz " +kelime+ " Kelimesi Palindrom bir kelime degildir.");
        }
    }
}
