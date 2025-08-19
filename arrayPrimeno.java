
import java.util.Scanner;

public class arrayPrimeno {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in array:");
       
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j = 0;j<arr.length;j++){
            if(isPrime(arr[j])){
                System.out.println(arr[j]+"is a prime number");
            }
            else{
                System.out.println(arr[j]+"is not a prime number");
            }
           
                
            
            
        }
    }

    public static boolean isPrime(int num) {
       
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
