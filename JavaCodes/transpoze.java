import java.util.Scanner;

public class transpoze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1,s2;
        int i, j;
        System.out.println("Oluşturulacak satır sayısını giriniz : ");
        s1 = input.nextInt();
        System.out.println("Oluşturulacak sütun sayısını giriniz : ");
        s2 = input.nextInt();
        int[][] matris = new int[s1][s2]; 
        int[][] transpoz = new int[s1][s2];
        for (i = 0; i < s1; i++) {
            for (j = 0; j < s2; j++) {
                System.out.println("Lütfen sayı giriniz : ");
                matris[i][j] = input.nextInt();
                transpoz[i][j] = matris[i][j];
            }
        }
        System.out.println("Girdiğiniz Dizi : ");
        for (i = 0; i < s1; i++) {  
            for (j = 0; j < s2; j++) {
                System.out.print(matris[i][j] + " ");

            }

            System.out.println("");

        }
        System.out.println("");
        System.out.println("Girdiğiniz Dizinin Transpoze Hali : ");
        
        for (i = 0; i < s2; i++) {
            for (j = 0; j < s1; j++) {
                System.out.print(transpoz[j][i] + " "); 

            }

            System.out.println("");

        }
        

    }

}

