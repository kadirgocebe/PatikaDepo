import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Teacher t1 = new Teacher("mahmut","0484903","TRH");
            Teacher t2 = new Teacher("Ahmet", "3843123", "FZK");
            Teacher t3 = new Teacher("muhammet", "23423423","MAT");
         
            
            Course tarih  = new Course("Tarih","101","TRH");
            Course fizik = new Course("Fizik", "102", "FZK");
            Course matematik = new Course("Matematik", "101", "MAT");

           
            tarih.addTeacher(t1);
            fizik.addTeacher(t2);
            matematik.addTeacher(t3);

            Student s1 = new Student("kadir","12345","2",tarih,fizik,matematik);
            
            Scanner input = new Scanner(System.in); 
            System.out.print("Lütfen öğrencinin Tarih sözlü notunu giriniz : ");
            int tarihSozlu = input.nextInt();
            if(tarihSozlu<0 || tarihSozlu>100){
                System.out.println("Limitler içerisinde Bir Sayı Girmediniz Baştan Başlayın !");
            System.exit(0);
            }
            System.out.print("Lütfen öğrencinin Fizik sözlü notunu giriniz : ");
            int fizikSozlu = input.nextInt();
            if(fizikSozlu<0 || fizikSozlu>100){
                System.out.println("Limitler içerisinde Bir Sayı Girmediniz Baştan Başlayın !");
                System.exit(0);
            }

           System.out.print("Lütfen öğrencinin Matematik sözlü notunu giriniz : ");
            int matSozlu = input.nextInt();
            if(matSozlu<0 || matSozlu>100){
                System.out.println("Limitler içerisinde Bir Sayı Girmediniz Baştan Başlayın !");
                System.exit(0);
            }

            s1.addBulkExamNote(80, 70, 90);
            s1.sozluNotu(tarihSozlu, fizikSozlu, matSozlu);
            s1.isPass();
         
        }

    }
    

