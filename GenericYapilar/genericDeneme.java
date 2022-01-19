public class genericDeneme {

    public static void main(String[] args) {

        String s1 = "patika";//class için tanımlandı
        Double d1 = 3.14;
        Integer a1 = 10;

        String [] a={"java","code","patika","dev"}; // metod için tanımlandı
        Integer [] b = {1,2,3,4};
        Character [] c = {'J','A','V','A'};
    
    printArray(a); // metod kullanımı
    System.out.println(" ");
    printArray(b);
    System.out.println(" ");
    printArray(c);
    System.out.println(" ");
    System.out.println(" ");

    Test<Integer,String,Double> testObj = new Test<Integer,String,Double>(a1, s1, d1); // class kullanımı
    testObj.showInfo();
}



public static <T> void printArray(T[] arr){//metod şeklinde yazma

    for(T i : arr){
        System.out.print(i+" ");
    }

}}