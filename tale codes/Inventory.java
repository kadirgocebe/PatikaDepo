
public class Inventory {
    
 static int water = 0;
 static int food= 0;
 static int wood = 0;



public Inventory(int water, int food, int wood) {

    Inventory.water = water;
    Inventory.food = food;
    Inventory.wood = wood;
   
}

public static int getWater() {
    return water;
}

public static void setWater(int water) {
    Inventory.water = water;
}

public static int getFood() {
    return food;
}

public static void setFood(int food) {
    Inventory.food = food;
}

public static int getWood() {
    return wood;
}

public static void setWood(int wood) {
    Inventory.wood = wood;
}

public static boolean isWin(){
    while(wood==0 || food==0 || water== 0){
        return false;
    }
    return true;
}

}
