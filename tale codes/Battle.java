import java.util.Scanner;

public class Battle {
    

    public static void fight(int monsterNum, String s) {
        

        for (int i=0; i< monsterNum; i++){

            System.out.println("This is number " + (i+1) + " of the " +Monster.getMonsterName()+ " you encounter");
        
            while(Player.getHealth() > 0 && Monster.getMonsterHealt()>0){
                
                Battle.status();
                double randomNumber = Math.random()*100;

                if(randomNumber>50){
                    Battle.playerHit();
                }else {
                    Battle.monsterHit();
                }
                
            }

            if(Player.getHealth() <= 0){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("-------------------------------------------------------");
                System.out.println("OH MY MIGHTY LORD...");
                System.out.println("YOU DIED...!\nAND YOUR SOUL PERISHED...!");
                System.out.println("WHAT A WASTE OF LIFE...");
                System.out.println(" ");
                System.out.println("-------------------------------------------------------");
                System.exit(0);
            } else {
                System.out.println("You collect " + Monster.getMonsterCoin() + " coin from this battle !");
                int moneyEarn = Player.getMoney() + Monster.getMonsterCoin();
                Player.setMoney(moneyEarn);
                System.out.println("Your current money is : " + Player.getMoney());
                System.out.println(" ");
                Monster.setMonsterHealt(Monster.getinitHealth());

            }
        }
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println("This battle was harsh but you manage to survive. \nNow continue to your journey...");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            double randomNumber = Math.random()*100;
            if(randomNumber < 90){
                if(s=="f"){
                    System.out.println(" ");
                    System.out.println("*********  *********  *********  ********  ********  ********  *******");
                    System.out.println(" ");
                    System.out.println("You found a valuable resource : WOOD ");
                    System.out.println("WOOD added to your inventory\nWhen you collect all resources you will finish the game...!");
                    System.out.println(" ");
                    System.out.println("*********  *********  *********  ********  ********  ********  *******");
                    Inventory.setWood(1);
                    Game.journey();
                }else
                if(s=="m"){
                    System.out.println(" ");
                    System.out.println("*********  *********  *********  ********  ********  ********  *******");
                    System.out.println(" ");
                    System.out.println("You found a valuable resource : FOOD ");
                    System.out.println("FOOD added to your inventory\nWhen you collect all resources you will finish the game...!");
                    System.out.println(" ");
                    System.out.println("*********  *********  *********  ********  ********  ********  *******");
                    Inventory.setFood(1);
                    Game.journey();
                }else
                if(s=="c"){
                    System.out.println(" ");
                    System.out.println("*********  *********  *********  ********  ********  ********  *******");
                    System.out.println(" ");
                    System.out.println("You found a valuable resource : WATER");
                    System.out.println("WATER added to your inventory\nWhen you collect all resources you will finish the game...!");
                    System.out.println(" ");
                    System.out.println("*********  *********  *********  ********  ********  ********  *******");
                    Inventory.setWater(1);
                    Game.journey();
                } 
            } else{
            Game.journey();}
            
    }

    public static int playerHit(){

    double randomNumber = Math.random()*100;
    if(randomNumber > Monster.getMonsterBlock()){
        int hit = Monster.getMonsterHealt() - Player.getDamage();
        System.out.println("You hit the monster with " + Player.getDamage());
        Monster.setMonsterHealt(hit);    
    }
        else{
            System.out.println("Monster Parry Your Hit !");
    }
return Monster.getMonsterHealt();
}

    public static int monsterHit(){

    double randomNumber = Math.random()*100;
    if(randomNumber > Player.getPlayerBlock()){
        int hit = Player.getHealth()- Monster.getMonsterDamage();
        System.out.println("Monster Hit you with "+ Monster.getMonsterDamage());
        Player.setHealth(hit);
    }
        else{
            System.out.println("You Parry the Hit !");
    }
    return Player.getHealth();
}

    public static void Flee(){

        System.out.println("-------------------------------------------------------");
        System.out.println("\nYou decided to turn back but still there is a choise you shall decide...");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("1 - Safe house\n2 - Hit back to road\n\nWhat would yo do :");
        Scanner input = new Scanner(System.in);
        int fleeKey = input.nextInt(); 
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");       
        while (fleeKey < 1 || fleeKey > 2){
            System.out.println(" ");
            System.out.println("You choose something wrong...! ");
            System.out.println("Please choose wisely... ");
            System.out.print("\nChoose what to do... : ");
            fleeKey = input.nextInt();
        }
    
        switch (fleeKey) {
            case 1:
            Location.safeHouse();    
                break;
            case 2:
            Game.journey();
                break;
            default:
                break;
        }
    }

    public static void status(){
        System.out.println("Player Health :" + Player.getHealth());
        System.out.println("Monster Health :" + Monster.getMonsterHealt());
        System.out.println(" ");

    }
}