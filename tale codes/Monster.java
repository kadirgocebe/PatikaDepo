public abstract class Monster {
     
    private static int monsterDamage;
    private static int monsterHealt;
    private static int monsterBlock;
    private static String monsterName;
     private static int monsterCoin;
     public static int initHealth=monsterHealt;



    public Monster( int monsterDamage, int monsterHealt, int monsterBlock, String monsterName, int monsterCoin, int initHealth) {
        
        Monster.monsterDamage = monsterDamage;
        Monster.monsterHealt = monsterHealt;
        Monster.monsterName = monsterName;
        Monster.monsterCoin = monsterCoin;
        Monster.initHealth=initHealth;
    }


    public static int getinitHealth() {
        return initHealth;
    }

    public static int getMonsterDamage() {
        return monsterDamage;
    }

    public static void setMonsterDamage(int monsterDamage) {
        Monster.monsterDamage = monsterDamage;
    }

    public static int getMonsterHealt() {
        return monsterHealt;
    }

    public static void setMonsterHealt(int monsterHealt) {
        Monster.monsterHealt = monsterHealt;
    }

    public static int getMonsterBlock() {
        return monsterBlock;
    }


    public void setMonsterBlock(int monsterBlock) {
        Monster.monsterBlock = monsterBlock;
    }

    public static String getMonsterName() {
        return monsterName;
    }


    public static int getMonsterCoin() {
        return monsterCoin;
    }

    public void setMonsterCoin(int monsterCoin) {
        Monster.monsterCoin = monsterCoin;
    }
    
}
