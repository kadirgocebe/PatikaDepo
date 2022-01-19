



public class Arrayler {

    public static void main(String[] args) {
      
        int[] liste = {1, 2, 3, 4, 5};
        int elemansay = liste.length;
        double sum = 0;
        double harmoni = 0;

        for (int i = 0; i <= liste.length; i++) {
             harmoni += (1.0/liste[i]);
             System.out.println(harmoni);
        }

        harmoni+=1.0;

        sum = elemansay/ harmoni;

        System.out.println("orta =" + sum);


    }}

       



