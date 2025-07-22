public class strongNumber {
    public static void main(String[] args) {
        int number=14;
       
        int reversenum=0;
        int sum=0;
        while(number>0){
             int factorial=1;
            int last=number%10;
            for(int i=last;i>0;i--){
                factorial=factorial*i;
                
            }
            
            number=number/10;
            
            sum=sum+factorial;
            System.out.println(factorial);
        }
        System.out.println(sum);
        
    }
    
}
