public class GameCharmain {
    public static void main(String[] args) {
        GameChar g = new GameChar();
        GameChar g1 = new GameChar("akash");
        GameChar g2 = new GameChar("suda","dendro");
        GameChar g3 = new GameChar("sahnks","hydro",50);
        GameChar g4 = new GameChar("bumbu","geo",60,2300);

        System.out.println(g.name+" "+g.type+" "+g.health+" "+g.powerLevel);
        System.out.println(g1.name+" "+g1.type+" "+g1.health+" "+g1.powerLevel);
        System.out.println(g2.name+" "+g2.type+" "+g2.health+" "+g2.powerLevel);
        System.out.println(g3.name+" "+g3.type+" "+g3.health+" "+g3.powerLevel);
        System.out.println(g4.name+" "+g4.type+" "+g4.health+" "+g4.powerLevel);
       

    }
}
