import java.util.Scanner; 

public class notOrtalama {
    public static void main(String[] args) {
        int math, fiz, tur, kim, muz;
        double average=0;;

        Scanner input = new Scanner(System.in);

        System.out.println("Dikkat !!!  0 ile 100 arasında girilmeyen notlar ortalamaya dahil edilmeyecektir !!!");
        System.out.print("Matematik Notunuz  : ");
        math = input.nextInt();
        if(math<0 || math>100){
            System.out.println("Matematik notu dahil edilmeyecektir !");
            average=average;
        } else {
            average+=math;
        }
        System.out.print("Fizik Notunuz  : ");
        fiz = input.nextInt();
        if(fiz<0 || fiz>100){
            System.out.println("Fizik notu dahil edilmeyecektir !");
            average=average;
        } else {
            average+=fiz;
        }
        System.out.print("Türkçe Notunuz  : ");
        tur = input.nextInt();
        if(tur<0 || tur>100){
            System.out.println("Türkçe notu dahil edilmeyecektir !");
            average=average;
        } else {
            average+=tur;
        }
        System.out.print("Kimya Notunuz  : ");
        kim = input.nextInt();
        if(kim<0 || kim>100){
            System.out.println("Kimya notu dahil edilmeyecektir !");
            average=average;
        } else {
            average+=kim;
        }
        System.out.print("Müzik Notunuz  : ");
        muz = input.nextInt();
        if(muz<0 || muz>100){
            System.out.println("Müzik notu dahil edilmeyecektir !");
            average=average;
        } else {
            average+=muz;
        }
        if((average/5)<55){
            System.out.println("Kaldınız ! \n Ortalamanız : " +(average/5));}
                else{
                           System.out.println("Geçtiniz ! \n Ortalamanız : " +(average/5));
                    }
    }
}

