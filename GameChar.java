public class GameChar {
    String name;
    String type;
    int health;
    int powerLevel;
 public GameChar() {
        
    }
    public GameChar(String name) {
        this.name=name;
    }
    public GameChar(String name,String type) {
        
        this(name);
        this.type=type;
    }
    public GameChar(String name,String type,int health) {
        this(name,type);
        this.health=health;
    }
    public GameChar(String name,String type,int health,int powerLevel) {
        this(name,type,health);
        this.powerLevel=powerLevel;
    }
    

    
}
