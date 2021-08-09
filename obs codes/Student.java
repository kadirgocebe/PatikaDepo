public class Student {
    String name;
    String stuNo;
    String sinif;
    Course c1,c2,c3;
    double tarihAverage,matAverage,fizikAverage,average;
    boolean isPass;
    int tarihSozlu,fizikSozlu,matSozlu;


Student(String name, String stuNo, String sinif, Course c1, Course c2, Course c3){
    this.name=name;
    this.stuNo=stuNo;
    this.sinif=sinif;
    this.c1=c1;
    this.c2=c2;
    this.c3=c3;
    this.average=0.0;
    this.isPass=false;
}

void addBulkExamNote(int note1, int note2, int note3 ){

    if (note1 >=0 && note1 <= 100){
        this.c1.note=note1;
    }else{
        System.out.println("Girilen " +c1.name + " Notu Olması gereken Değerler Arasında Değil !");
    }
    if (note2 >=0 && note2 <= 100){
        this.c2.note=note2;
    }else{
        System.out.println("Girilen " +c2.name + " Notu Olması gereken Değerler Arasında Değil !");
    }
    if (note3 >=0 && note3 <= 100){
        this.c3.note=note3;
    }else{
        System.out.println("Girilen " +c3.name + " Notu Olması gereken Değerler Arasında Değil !");
    }
    
}

void sozluNotu(int tarihSozlu,int fizikSozlu, int matSozlu){
    this.tarihSozlu=tarihSozlu;
    this.fizikSozlu=fizikSozlu;
    this.matSozlu=matSozlu;

}

 void calcAvarage() {
    this.tarihAverage = (this.c1.note*0.8 + this.tarihSozlu*0.2);
    this.fizikAverage=(this.c2.note*0.8+this.fizikSozlu*0.2);
    this.matAverage=(this.c3.note*0.8+this.matSozlu*0.2);

    this.average=(tarihAverage+fizikAverage+matAverage)/3;
}

void isPass(){

    calcAvarage();
    if( this.average>=55){
        System.out.println("Sınıfı Geçtiniz !\n");
    }
        else{
            System.out.println("Sınıfta Kaldınız !\n");
        }
        printNote();
    
}

void printNote(){
    System.out.println(this.c1.name +" Notu  " + this.c1.note );
    System.out.println(this.c2.name +" Notu  " + this.c2.note );
    System.out.println(this.c3.name +" Notu  " + this.c3.note );
    System.out.println("Notların Ortalaması :" + this.average);
}
}


