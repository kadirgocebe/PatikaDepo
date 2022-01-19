import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int i,j,m,n,r,k,nfac=1, rfac=1, kfac=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen İlk Sayıyı Giriniz  :");
        n=input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz  :");
        r=input.nextInt();

        k=n-r;

        for(i=1; i<=n; i++){
            nfac*=i;
        }
        for(j=1; j<=r; j++){
            rfac*=j;
        }
        for(m=1; m<=k; m++){
            kfac*=m;
        }

        int toplam = nfac/(rfac*(kfac));
        System.out.println(n+" Sayısı ile "+r +" Sayısının Kombinasyonu : " +toplam);

    }
}




//C(n,r) = n! / (r! * (n-r)!)

