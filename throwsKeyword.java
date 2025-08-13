
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class throwsKeyword {

  
    public static void m1() throws FileNotFoundException{
        System.out.println("m1 starts");
        FileReader fr =  new FileReader("jav.txt");
        System.out.println("mq stops");
        System.out.println("m1 ends");
    }

    public static void  vote(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the age: ");
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("you can vote");
            }
            else{
                // try{
                    throw new AgeException("hekk");

                // }
            //     catch(AgeException e){
            //         System.out.println("Exception...");
            //     }
            // }


    }
}

    
    public static void main(String[] args) throws AgeException {     //FileNotFoundException,
        System.out.println("main strt");
        // m1();
        System.out.println("main ends");
        System.out.println("main stops");

        vote();
        
    }
}


