import java.util.Scanner;

/*public class Main {


    
    public static void main(String[] args) {
        
    Student<String> stu = new Student<>();
    stu.insert("Kadir Gocebe");
    stu.select();
 


    }
}
*/

public class Main {

    public static void main(String[] args) {
        MyList<String> mylist = new MyList<String>(5);
        mylist.add("java");
        mylist.add("patika");
        mylist.add("Kadir");
        mylist.add("Gocebe");
        mylist.add("Javacı");
        mylist.add("Patikası");
        mylist.add("K");
        mylist.add("A");
        mylist.add("D");
        mylist.add("I");
        mylist.add("R");
        mylist.add("Advance Patika Ödevi");


        System.out.println("Listenin Şu anki Boyutu : "+mylist.getSize());
        System.out.println("Listenin Şu anki Kapasitesi : " +mylist.getCapacity());
        System.out.println("------------------------------------------------");
        mylist.isEmpty();
        System.out.println("------------------------------------------------");
        System.out.println("Listenin Öğeleri : ");
        System.out.println("------------------------------------------------");
        mylist.printString();
        System.out.println("------------------------------------------------");

        System.out.print("Bakılacak indexi Giriniz: " );
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        
        System.out.println("------------------------------------------------");
        String s1 = mylist.get(a);
        System.out.println("------------------------------------------------");
        mylist.contains(s1);
        System.out.println("------------------------------------------------");
        System.out.println(s1+ " elemanının indexi : " + mylist.indexOf(s1));
        System.out.println("------------------------------------------------");

        mylist.clear();
        
        




    }
}