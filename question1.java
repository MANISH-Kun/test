// write a java program  to check wether the no is same,if not find largest no
public class question1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(!(a==b)){
            if (a>b) {
                System.out.println("the largest :"+a);
                
            } else {
                System.out.println("the largest"+b);
                
            }

        }
        else{
            System.out.println("both are equal");
        }
    }
    
}
