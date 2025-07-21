public class sumofalldigits {
    public static void main(String[] args) {
        int numbers = 123;
        int sum = 0;
        while(numbers>0){
            System.out.println("number initial"+numbers);
            sum=sum+numbers%10;
            System.out.println("sum"+sum);
            numbers=numbers/10;
            System.out.println("number after div"+numbers);
        }
        System.out.println(sum);
    }
    
}
