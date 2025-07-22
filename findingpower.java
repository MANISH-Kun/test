public class findingpower {
    public static void main(String[] args) {
        int number = 123;
        int power = 0;
        int tempNum=number;
        
        int total=0;
         while(tempNum>0){
            int lastDigit = tempNum%10;
           power=power+1;
            tempNum=tempNum/10;
            

            
        }
        System.out.println("power to be calculated:"+power);
              

        
        
        while(number>0){
            int lastDigit = number%10;
            int sum=1;
            for(int k=1;k<=power;k++){
                sum=sum*lastDigit;
            }
            total=total+sum;
            number=number/10;
            

            
        }
        System.out.println("the sum of power of all the numbers is:"+total);
    }
    
}
