import java.util.Scanner;

public class Game {


    public static void start(){

        Scanner input = new Scanner (System.in);
        System.out.println("Select a character to control. Remember each character has different traits...");
        System.out.println("-------------------------------------------------------");
        System.out.println("1 - Paladin : A fearless protector of realm. Champion of sword \n"+
        "2 - Elf Prince : A celestial creature. Master of archery \n" + 
        "3 - Barbarian : A deadly combination of muscle and anger. Unstoppable with an axe" );
        System.out.println("-------------------------------------------------------");
        System.out.print("Its time to choose your destiny... : ");
        int playerSelect = input.nextInt();
        while (playerSelect < 1 || playerSelect >3){
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println("You choose something wrong...! ");
            System.out.println("Please choose wisely... ");
            System.out.print("\nChoose what to do... : ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
            playerSelect = input.nextInt();
        }
        
        switch (playerSelect) {
            case 1:
                System.out.println("-------------------------------------------------------");
                System.out.println("\nChampion of the crown\nProtector of the realm \nA PALADIN...\nUse your sword to find your way...");
                System.out.println("-------------------------------------------------------");
                Player knight = new Paladin();
                break;

                case 2:
                System.out.println("-------------------------------------------------------");
                System.out.println("\nPrince of a celestial kingdom\nMost divine of all creatures \nAN ELF PRINCE...\nUse your bow and arrows to find your way...");
                System.out.println("-------------------------------------------------------");   
                Player elf = new ElfPrince();
                break;

                case 3:
                System.out.println("-------------------------------------------------------");
                System.out.println("\nA Fearless warrior\nPure streght and dedication\nA BARBARIAN...\nUse your axe to find your way...");
                System.out.println("-------------------------------------------------------"); 
                Player barbar = new Barbarian();
                break;

            default:
            break;
        }
        
    }

    public static void journey(){

        if(Inventory.isWin() == true){
            Game.finish();
        }else 
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Your journey continues...");
        System.out.println("You walk around day and night...");
        System.out.println(" ");
        System.out.println("Now there is a sign in the road says you should choose a path...");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Where would you go...? \n"); 
        System.out.println("1- Into The FOREST : Where wild BEARS awaits\n\n2- Over the MOUNTAIN : Where ZOMBIES wander around\n\n3- Through the CAVES : Where bloodthirst VAMPIRES lurking in"); 
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        System.out.print("\nChoose your way... : ");
        
        
        Scanner input = new Scanner (System.in);
        int locationSelect = input.nextInt();
        while (locationSelect < 1 || locationSelect > 3){
            System.out.println(" ");
            System.out.println("You choose something wrong...! ");
            System.out.println("Please choose wisely... ");
            System.out.print("\nChoose what to do... : ");
            locationSelect = input.nextInt();
        }

        switch (locationSelect) {
            case 1:           
            System.out.println("\nFOREST : Into the land of mighty trees and all kinds of creapy creatures...");
            System.out.println("-------------------------------------------------------\n");
            Location.locationSelector("forest");
                break;
            case 2:
            System.out.println("\nMOUNTAIN : Up up and up again till there is no such life exists...");
            System.out.println("-------------------------------------------------------\n");
            Location.locationSelector("mountain");
                break;
            case 3:
            System.out.println("\nCAVES : To the deeper than your deepest fears...");
            System.out.println("-------------------------------------------------------\n");
            Location.locationSelector("cave");
                break;

            default:
                break;
        }
}
    
    public static void finish(){

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println(" ");
    System.out.println("-------------------------------------------------------");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("Congratulations! You fought your way to the salvation...");
    System.out.println(" ");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("You've found every piece of valuable resource your people needs and safely return to the village...");
    System.out.println(" ");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("YOU SAVE THE PEOPLE OF MITTLEHEIM...!!! ");
    System.out.println(" ");
    System.out.println("Your name will echo in songs through the generations");
    System.out.println(" ");
    System.out.println("LONG LIVE " +Player.getPlayerName() + " THE GREAT WARRIOR AND THE SAVIOR OF MITTELHEIM...!" );
    System.out.println(" ");
    System.out.println("-------------------------------------------------------");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.out.println("*********  *********  *********  ********  ********  ********  *******");
    System.exit(0);
    
}

    }


