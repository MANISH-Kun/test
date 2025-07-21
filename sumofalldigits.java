public class sumofalldigits {
    public static void main(String[] args) {
        int numbers = 123;
        int sum = 0;
        while(numbers>0){
            sum=sum+numbers%10;
            numbers=numbers/10;
        }
        System.out.println(sum);
    }
    
}
