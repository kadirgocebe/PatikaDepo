import java.util.Scanner;
public class burc {

    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);

        System.out.print("Lütfen Doğduğunuz ayı sayı olarak giriniz  : ");
        int ay = input.nextInt();
        if(ay<1 || ay>12){

            System.out.println("Yanlış bir sayı girdiniz");
            System.exit(0);
                         }
        System.out.print("Lütfen Doğduğunuz günü sayı olarak giriniz  : ");  
        int gun = input.nextInt();
        if(gun<1 || gun>31){
            System.out.println("Yanlış bir sayı girdiniz");
            System.exit(0);
                            }

        if((gun>=21 && ay == 1) ==true || (gun<=19 && ay==2) ==true)
            System.out.println("Burcunuz = Kova");
        else if((gun>=20 && ay==2)==true || (gun<=20 && ay==3) ==true)
        System.out.println("Burcunuz = Balık");
       else if((gun>=20 && ay==3)==true || (gun<=20 && ay==4) ==true)
        System.out.println("Burcunuz = Koç");
       else if((gun>=20 && ay==4)==true || (gun<=20 && ay==5) ==true)
        System.out.println("Burcunuz = Boğa");
       else if((gun>=20 && ay==5)==true || (gun<=20 && ay==6) ==true)
        System.out.println("Burcunuz = İkizler");
       else if((gun>=20 && ay==6)==true || (gun<=20 && ay==7) ==true)
        System.out.println("Burcunuz = Yengeç");
       else if((gun>=20 && ay==7)==true || (gun<=20 && ay==8) ==true)
        System.out.println("Burcunuz = Aslan"); 
       else if((gun>=20 && ay==8)==true || (gun<=20 && ay==9) ==true)
        System.out.println("Burcunuz = Başak"); 
       else if((gun>=20 && ay==9)==true || (gun<=20 && ay==10) ==true)
        System.out.println("Burcunuz = Terazi");
       else if((gun>=20 && ay==10)==true || (gun<=20 && ay==11) ==true)
        System.out.println("Burcunuz = Akrep");
       else if((gun>=20 && ay==11)==true || (gun<=20 && ay==12) ==true)
        System.out.println("Burcunuz = Yay");
       else if((gun>=20 && ay==12)==true || (gun<=20 && ay==1) ==true)
        System.out.println("Burcunuz = Oğlak");
       
    }
}





















/*

Kova Burcu : 22 Ocak - 19 Şubat 122 -219

Balık Burcu : 20 Şubat - 20 Mart 220 - 320

Koç Burcu : 21 Mart - 20 Nisan 321 - 420

Boğa Burcu : 21 Nisan - 21 Mayıs 421 - 521

İkizler Burcu : 22 Mayıs - 22 Haziran 522-622

Yengeç Burcu : 23 Haziran - 22 Temmuz 623-722

Aslan Burcu : 23 Temmuz - 22 Ağustos 723-822

Başak Burcu : 23 Ağustos - 22 Eylül 823 - 922

Terazi Burcu : 23 Eylül - 22 Ekim 923 - 1022

Akrep Burcu : 23 Ekim - 21 Kasım 1023 -1121

Yay Burcu : 22 Kasım - 21 Aralık 1122 -1221

Oğlak Burcu : 22 Aralık - 21 Ocak 1222 - 121

*/ 
