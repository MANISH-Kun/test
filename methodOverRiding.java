public class methodOverRiding {
    public static void main(String[] args) {
        System.out.println("addition of  numbers : "+add(10,20, 30,40));
        System.out.println("addition of  numbers : "+add(10,20, 30));
        System.out.println("addition of  numbers : "+add(10,20));
    }
    public static int add(int a,int b,int c,int d) {
        return a+b+c+d;
        
    }
    public static int add(int a,int b,int c) {
        return a+b+c;
    
    }
    public static int add(int a,int b) {
        return a+b;
        
    }

}
