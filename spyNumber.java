public class spyNumber {
    
    public static void main(String[] args) {
        int number=123;
        int sum=0;
        int product=1;
        while(number>0){
            int lastDigit = number%10;
            sum=sum+lastDigit;
            product=product*lastDigit;
            number=number/10;

        }
        System.out.println(sum);
        System.out.println(product);
        if(sum==product){
            System.out.println("it is a spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}
