public class Boksor {
    String ad;
    String soyad;
    int damage;
    int health;
    int siklet;
    int blok;

Boksor(String ad, String soyad, int damage, int health, int siklet, int blok){
    this.ad=ad;
    this.soyad=soyad;
    this.damage=damage;
    this.health=health;
    this.siklet=siklet; 
    this.blok=blok;
}

int vurus(Boksor rakip){

    if(rakip.isDodge()){
        System.out.println(rakip.ad + " "+rakip.soyad + " Gelen Yumruğu Blokladı !");
        return rakip.health;
    }
    System.out.println(this.ad + " "+this.soyad+" rakibi " +rakip.ad + " "+rakip.soyad + "'a " +this.damage +" ile vurdu ");
    
    return rakip.health - this.damage;  
}

boolean isDodge(){

    double randomNumber = Math.random()*100;
    return randomNumber<= this.blok;
}
}
