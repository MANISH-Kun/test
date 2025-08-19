
import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
       

       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
         
        double[] arr=new double[size];
        // double sum=0;
        double product=1;


        for(int i = 0;i<=size-1;i++){
            System.out.println("enter the values to be stored");
            arr[i]=sc.nextDouble();
        }
        

       
        // for(int j = 0 ; j<=arr.length-1;j++){
        //     if(arr[j]%2==0){
        //         System.out.println("even nos are:5");

            
        //             System.out.println("element "+arr[j]+" index"+j);
        //     }
                

        // for(int j = 0 ; j<=arr.length-1;j++){
        //     if(j%2==0){
        //         System.out.println("even index and its element are:");

            
        //             System.out.println("element "+arr[j]+" index"+j);
        //     }

         for(int j = 0 ; j<=arr.length-1;j++){
            // sum = sum + arr[j];
            product=product*arr[j];
          
            }

              System.out.println("total sum is: "+ product);


        
                

            
        }
        

    }

    