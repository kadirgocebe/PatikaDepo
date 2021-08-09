public class Match {
 
    Boksor f1;
    Boksor f2;
    int maxWeight;
    int minWeight;
    int counter=1;

    Match(Boksor f1, Boksor f2, int maxWeight, int minWeight){
    this.f1=f1;
    this.f2=f2;
    this.maxWeight=maxWeight;
    this.minWeight=minWeight;

}






void run(){
    if(isCheck()){
        while (this.f1.health>0 && this.f2.health>0) {
            System.out.println(" Round : " + counter);
            
            double randomNumber = Math.random()*100;

            if(randomNumber<50){
            this.f2.health=this.f1.vurus(this.f2);}
            else{
            this.f1.health=this.f2.vurus(this.f1);}
            counter++;
            System.out.println(" ");
        }
        isWin();
    }
    else{
        System.out.println("Boksörlerin Dövüşebilmeleri Uygun Siklette Olmaları Gereklidir !");
    }
}








boolean isCheck(){
    return ((this.f1.siklet >= minWeight && this.f1.siklet<=maxWeight)&&(this.f2.siklet>= minWeight && this.f2.siklet<=maxWeight));
}




boolean isWin(){
    if(this.f1.health <= 0){
        System.out.println(" ");
        System.out.println(this.f1.ad+" " + this.f1.soyad + " Knockout Oldu !");
        return true;
    } 
    if(this.f2.health <= 0){
        System.out.println(" ");
        System.out.println(this.f2.ad+" " + this.f2.soyad + " Knockout Oldu !");
        return true;
    }

    return false;
}



}
