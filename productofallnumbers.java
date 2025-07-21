public class productofallnumbers {
    public static void main(String[] args) {
        int  numbers = 12345;
        int product = 0;
        while(numbers>0){
            product=product+numbers%10;
            numbers=numbers/10;
        }
        System.out.println("product:"+product);
    }
}
