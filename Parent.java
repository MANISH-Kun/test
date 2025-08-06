public class Parent {
    int id;
    static int a = 20;

    public Parent(int id, int a) {
        this.id = id;
        Parent.a = a; 
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Static A: " + a);
    }
}


