
import java.util.Random;
import java.util.Scanner;

public class MineSweeper { //Ana sınıfımız
int rowNum, colNum,size; 
String[][] map; //mayınlar konulmuş harita olacak
static String [][] board; // kullanıcının verdiği boyutlarda boş harita olacak 
boolean gameCheck=true;

Random rand = new Random(); // mayınları random koyabilmek için
Scanner scan = new Scanner(System.in);

MineSweeper(int rowNum, int colNum){ // constructor sınıfı

    this.rowNum = rowNum;
    this.colNum=colNum;
    this.map= new String [rowNum][colNum];
    this.board= new String [rowNum][colNum];
    this.size= (rowNum*colNum);
}
public static void main(String[] args) throws Exception { // main fonksiyonu
       
    Scanner input = new Scanner(System.in);
    int row , colomn;
    System.out.println("Lütfen oyun alanının boyutunu giriniz ! ");
    System.out.print("Yükseklik : ");
    row = input.nextInt();
    System.out.print("Genişlik : ");
    colomn = input.nextInt();

    MineSweeper mine = new MineSweeper(row,colomn);
    mine.run(); 
    

    }


public void run() { // oyunu çalıştıran sınf

    int userRow, userCol;
    int counter=0;

    // önce boş haritayı basan kısım
    
    prep(); // boş haritaya mayın ekleyen kısım
    System.out.println("Mayınların Konumu - istenildiğinde Kapatılabilir");
    print(map); // mayınlı haritayı basan
    System.out.println("--------------");
    System.out.println(" Oyun Tahtası aşağıdaki gibidir. İyi Şanslar!");
    print(board); 
    
    while (gameCheck) {
    System.out.print("Lütfen açmak istediğiniz satırı giriniz : ");
    userRow=scan.nextInt();
    System.out.print("Lütfen açmak istediğiniz sütunu giriniz : ");
    userCol=scan.nextInt();

    if(userRow<0 || userRow>= rowNum){ //kullanıcının girdiği sayının doğru aralıkta oldugunu kontrol ediyor
        System.out.println(" Geçersiz Bir Sayı Girdiniz ! Lütfen Tekrar Deneyin ");
        continue;
    }
    if(userCol<0 || userCol>= colNum){
        System.out.println(" Geçersiz Bir Sayı Girdiniz ! Lütfen Tekrar Deneyin ");
        continue;
    }

    if(map[userRow][userCol] != "*"){ //girilen sayının mayına denk gelip gelmediğinin kontrolü
        mineCheck(userRow, userCol); //mayına denk gelmediyse girilen sayının etrafında mayın var mı kontrolü
        counter++; // yoksa kazanmak için counter ı arttırıyoruz
        if(counter == (size - (size/4))){ // eğer hiç mayına denk gelmediyse her yeri açtıysa
            System.out.println("Tebrikler KAZANDINIZ !!!");
            break;
        }
    }else{  // mayına denk geldin kısmı
        gameCheck=false;
        System.out.println("  ");
        System.out.println("BOOOOM ");
        System.out.println("Üzgünüm Kaybettiniz ! ");
    }
    }
}



public void prep(){ // burası haritaya mayınları rastgele yerleştiren hazırlık kısmı
    int prepRow, prepCol, counter=0;
    while(counter != (size/4)){
        prepRow=rand.nextInt(rowNum);
        prepCol=rand.nextInt(colNum);
        if(map[prepRow][prepCol] != "*"){
            map[prepRow][prepCol] = "*";
            counter++;
        }
    }

}


public static void print(String[][] dizi){ // haritayı ve mayınlı haritayı bastıran kısım

    for (int i=0; i<dizi.length;i++){
        for(int j=0; j< dizi[0].length;j++){
            if(dizi[i][j]== null)
            dizi[i][j]="-";
            System.out.print(dizi[i][j]+" ");
        }
        System.out.println();
    } 
}

public void mineCheck(int r, int c){ // girilen kordinatın sağında solunda ne var diye kontrol eden kısım
    if(map[r][c]== "-"){

    if((c < colNum -1) && (map[r][c+1]== "*")){
        board[r][c]="1";
    }

    if((r< rowNum -1) && (map[r+1][c]== "*")){
        board[r][c]="1";
    } 
    if((r> 0) && (map[r-1][c]== "*")){
        board[r][c]="1";
    }

    if((c> 0) && (map[r][c-1]== "*")){
        board[r][c]="1";
    }
    

    if (board[r][c]== "-"){
        board[r][c] = "0";
    }
    
}
print(board);
}

}