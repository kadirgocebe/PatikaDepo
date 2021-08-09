public class Main {
    public static void main(String[] args)  {
        
        Boksor f1 = new Boksor("Anthony", "Joshua", 20, 100, 110,30);
        
        Boksor f2 = new Boksor("Deontay", "Wilder", 19, 100, 105,30);
        
        Match dovus = new Match(f1, f2, 120, 90);
        dovus.run();
    }
}
