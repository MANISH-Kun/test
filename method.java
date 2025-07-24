public class method {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("the result of mul is:"+mul(10,10));
        System.out.println("the result of add is:"+add(10,10));
         System.out.println("the result of add is:"+sub(10,10));
         System.out.println("the result of add is:"+div(10,10));
        
    }
    public static int mul(int a,int b){
        int result=a*b;
        
        return result;
    }
    public static int add(int a,int b){
        int result =a+b;
        return result;
    }
    public static int sub(int a,int b){
        int result =a-b;
        return result;
    }
    
    public static int div(int a,int b){
        int result =a/b;
        return result;
    }
    
    

}
