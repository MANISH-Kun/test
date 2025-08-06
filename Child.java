public class Child extends Parent {
    String name;

    public Child(int id, int a, String name) {
        super(id, a); 
        this.name = name;
    }

    public void show() {
        display(); 
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        
    }
}

