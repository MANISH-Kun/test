
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsKeyword {

    public static void m1() throws FileNotFoundException{
        System.out.println("m1 starts");
        FileReader fr =  new FileReader("java.txt");
        System.out.println("mq stops");
        System.out.println("m1 ends");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main strt");
        m1();
        System.out.println("main ends");
        System.out.println("main stops");
        
    }
}
