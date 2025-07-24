public class happyNumber {
    public static void main(String[] args) {
        int number = 14;
       
        int product=0;
        while(number!=1&&number!=4){
             int sum = 0;
       
            while(number>0){ 
            int lastdig = number%10;
            product=lastdig*lastdig;
            sum=sum+product;
            number=number/10;
            System.out.println(product);
            


            }
    
        number=sum;
    }
    if(number==1){
            System.out.println("happy number");
        }  
        else{
            System.out.println("not a happy number");
        } 
        
        
    }
}
