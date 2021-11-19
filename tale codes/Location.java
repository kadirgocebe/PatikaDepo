import java.util.Random;
import java.util.Scanner;

public class Location {

    public static void locationSelector(String Location){
        

        if (Location == "forest"){
            Random rand = new Random();
            int number = rand.nextInt(4)+1;
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
            System.out.println("You entered into FOREST...");
            System.out.println("You encounter with " + number +" BEAR...!!!");
            System.out.println("What will you do ?\n");
            System.out.println("Remember every fight promises a reward...!!!");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
            System.out.println("\n Fight : 1 - Flee : 2");
            System.out.print("\nChoose What to Do... : ");
            Scanner input = new Scanner(System.in);
            int fofSelect = input.nextInt();
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            while (fofSelect < 1 || fofSelect > 2){
                System.out.println(" ");
                System.out.println("You choose something wrong...! ");
                System.out.println("Please choose wisely... ");
                System.out.print("\nChoose what to do... : ");
                fofSelect = input.nextInt();
            }
            if(fofSelect==1){
                Monster bearFighter = new Bear();
                Battle.fight(number,"f");
            }else 
            if(fofSelect==2){
                Battle.Flee();
            }
            }
    
        if (Location == "mountain"){
            Random rand = new Random();
            int number = rand.nextInt(4)+1;
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
            System.out.println("You climb up to the MOUNTAIN...");
            System.out.println("You encounter with " + number +" ZOMBIES...!!!");
            System.out.println("What will you do ?\n");
            System.out.println("Remember every fight promises a reward...!!!");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println("\n Fight : 1 - Flee : 2");
            System.out.print("\nChoose What to Do... : ");
            Scanner input = new Scanner(System.in);
            int fofSelect = input.nextInt();
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            
            while (fofSelect < 1 || fofSelect > 2){
                System.out.println(" ");
                System.out.println("You choose something wrong...! ");
                System.out.println("Please choose wisely... ");
                System.out.print("\nChoose what to do... : ");
                fofSelect = input.nextInt();
            }
            if(fofSelect==1){
            Monster zombieFighter = new Zombie();
                Battle.fight(number,"m");
            }else 
            if(fofSelect==2){
                Battle.Flee();
            }
            }
    
        if (Location == "cave"){
            Random rand = new Random();
            int number = rand.nextInt(4)+1;
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
            System.out.println("You walk through the CAVE...");
            System.out.println("You encounter with " + number +" VAMPIRES...!!!");
            System.out.println("What will You Do ?\n");
            System.out.println("Remember Every Fight Promises a Reward...!!!");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println("\n Fight : 1 - Flee : 2");
            System.out.print("\nChoose What to Do... : ");
            Scanner input = new Scanner(System.in);
            int fofSelect = input.nextInt();
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            
            while (fofSelect < 1 || fofSelect > 2){
                System.out.println(" ");
                System.out.println("You choose something wrong...! ");
                System.out.println("Please choose wisely... ");
                System.out.print("\nChoose what to do... : ");
                fofSelect = input.nextInt();
            }
    
            if(fofSelect==1){
            Monster vampireFighter = new Vampire();
            Battle.fight(number, "c");
            }else 
            if(fofSelect==2){
                Battle.Flee();
            }
            }
    
     }   

    public static void safeHouse(){

        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        System.out.println("You reach your SAFE HOUSE... Finally you could get some rest...");
        System.out.println("Your health will REGENERATE with the spell of resurrection inside your safe house...");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Your current health is : "+Player.getHealth());
        if( Player.getHealth() < Player.getInitHealth()){
            Player.setHealth(Player.playerInitHealth);
            System.out.println("Your Health Regenerated : "+Player.getHealth());
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("You can choose the destiny of your journey... ");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("1 - Go to DWARF'S SHOP to buy some improvements \n2 - Get back on road \n3 - End your journey ");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("\nChoose What to Do... : ");
        
            
    
        Scanner input = new Scanner(System.in);
        int safeHouseKey = input.nextInt(); 
        while (safeHouseKey < 1 || safeHouseKey > 3){
            System.out.println(" ");
            System.out.println("You choose something wrong...! ");
            System.out.println("Please choose wisely... ");
            System.out.print("\nChoose what to do... : ");
            safeHouseKey = input.nextInt();
        }
        switch (safeHouseKey) {
            case 1:
                Location.shop();
                break;
            case 2:
            Game.journey();
                break;    
            case 3:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("-------------------------------------------------------");
                System.out.println("########################################################################");
                System.out.println("-------------------------------------------------------");
                System.out.println(" ");
                System.out.println("YOU CHOOSE TO END YOUR JOURNEY... !");
                System.out.println(" ");
                System.out.println("-------------------------------------------------------");
                System.out.println(" ");
                System.out.println("THIS NOT FOR EVERYONE...");
                System.out.println(" ");
                System.out.println("-------------------------------------------------------");
                System.out.println(" ");
                System.out.println("FAREWELL STRANGER... !");
                System.out.println(" ");
                System.out.println("-------------------------------------------------------");
                System.out.println("########################################################################");
                System.out.println("-------------------------------------------------------");

                System.exit(0);
                break;
        
            default:
                break;
        }
    }
    
     public static void shop() {
    
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("Welcome to the DWARF'S SHOP... You can buy some improvements or you can turn back to your safe house");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("1 - Weapon Talisman : Adds 5 to your DAMAGE for 20 coin");
    System.out.println("2 - Armor Talisman : Adds 5 to your PARRY Ability for 30 coin ");
    System.out.println("3 - Health Talisman : Adds 5 to your HEALTH for 40 coin");
    System.out.println("4 - Back To Your SAFE HOUSE");
    System.out.println(" ");
    System.out.println(" ------------------------------------------ ");
    System.out.println(" ------------------------------------------ ");
    System.out.println("Your Balance is : " + Player.getMoney()); 
    System.out.println("Your Current Damage is : "+Player.getDamage());
    System.out.println("Your Current Block is : "+Player.getPlayerBlock());
    System.out.println("Your Current Health is : "+Player.getInitHealth());
    System.out.println(" ------------------------------------------ ");
    System.out.println(" ------------------------------------------ ");

    System.out.print("\nChoose What to Do... : ");
    
    Scanner input = new Scanner(System.in);
        int shopKey = input.nextInt(); 
    
        while (shopKey < 1 || shopKey > 4){
            System.out.println(" ");
            System.out.println("You choose something wrong...! ");
            System.out.println("Please choose wisely... ");
            System.out.print("\nChoose what to do... : ");
            shopKey = input.nextInt();
        }
        switch (shopKey) {
            case 1:
                if(Player.getMoney() < 20){
                System.out.println("You have NOT ENOUGH Money...!");
                System.out.println("Your Balance is : " + Player.getMoney());  
                Location.shop();
            }
            else{
                if(Player.getDamage()>=100){
                    System.out.println("You Reach Your MAXIMUM Damage");
                    Player.setDamage(100);
                    Location.shop(); 
                }
                    else{
                int newDamage = Player.getDamage() + 5;
                Player.setDamage(newDamage);
                System.out.println("Your NEW DAMAGE is : "+Player.getDamage());
    
                int balance = Player.getMoney() - 20;
                Player.setMoney(balance);
                System.out.println("Your NEW BALANCE is : "+ Player.getMoney());  
                Location.shop();    } 
            }
                break;
    
            case 2:
            if(Player.getMoney() < 30){
                System.out.println("You Have NOT ENOUGH Money...!");
                System.out.println("Your Balance is : " + Player.getMoney());  
                Location.shop();
            }
            else{
                if(Player.getPlayerBlock()>=50){
                    System.out.println("You Reach Your MAXIMUM Parry Ability");
                    Player.setPlayerBlock(50);
                    Location.shop(); 
                }
                    else{
                int newBlock = Player.getPlayerBlock() + 5;
                Player.setPlayerBlock(newBlock);
                System.out.println("Your NEW BLOCK ability is : "+Player.getPlayerBlock());
            
                int balance = Player.getMoney() - 30;
                Player.setMoney(balance);
                System.out.println("Your NEW BALANCE is : "+ Player.getMoney());   
                Location.shop();   }
            }
                break;
           
            case 3:
            if(Player.getMoney() < 40){
                System.out.println("You Have NOT ENOUGH Money...!");
                System.out.println("Your Balance is : " + Player.getMoney());  
                Location.shop();
            }
            else{
                if(Player.getHealth()>=100){
                    System.out.println("You Reach Your MAXIMUM Health");
                    Player.setHealth(100);
                    Location.shop(); 
                }
                    else{
                int newHealth = Player.getHealth() + 5;
                Player.setInitHealth(newHealth);
                System.out.println("Your NEW HEALTH is : "+Player.getInitHealth());
    
                int balance = Player.getMoney() - 40;
                Player.setMoney(balance);
                System.out.println("Your NEW BALANCE is : "+ Player.getMoney());     
                Location.shop(); }
            }
                break;
            
            case 4:
                Location.safeHouse();    
                break;
    
            default:
                break;
        }
    
    }
    
}
