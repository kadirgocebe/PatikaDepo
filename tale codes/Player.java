public  class Player {
    
//paladin   damage-10, ,health-30, money-5, block-28,
//elfPrince  damage 7, health 25, money 20,block 30 
//barbarian  damage 12,health 40,money 12,block 18


public static String playerName;
private static int damage;
private static int health;
private static int money;
private static int playerBlock;
public static int playerInitHealth;



public Player(String playerName, int damage, int health, int money, int  playerBlock, int playerInitHealth)
         {
    Player.damage=damage;
    Player.health=health;
    Player.money=money;
    Player.playerBlock=playerBlock;
    Player.playerName = playerName;
    Player.playerInitHealth=playerInitHealth;

}


public static void setPlayerName(String playerName) {
    Player.playerName = playerName;
}

public static String getPlayerName() {
    return playerName;
}

public static int getInitHealth(){
    return playerInitHealth;
}

public static void setInitHealth(int playerInitHealth){
    Player.playerInitHealth=playerInitHealth;
}

public static int getDamage() {
    if(damage<100){
        return damage;
    }
    return 100;
}

public static void setDamage(int damage) {
    Player.damage = damage;
}

public static int getHealth() {
    if(health<100){
        return health;
    }
    return 100;
}

public static void setHealth(int health) {
    Player.health = health;
}

public static int getMoney() {
    return money;
}

public static void setMoney(int money) {
    Player.money = money;
}

public static int getPlayerBlock() {
    if(playerBlock<50){
        return playerBlock;
    }
    return 50;
}

public static void setPlayerBlock(int playerBlock) {
    Player.playerBlock = playerBlock;
}


}
