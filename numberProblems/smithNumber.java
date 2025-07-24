public class smithNumber {
    public static void main(String[] args) {
        int number=666;
        int copy=number;
        int sum=0;
        while(number>0){
            int lastdig = number%10;
            sum=sum+lastdig;
            number=number/10;
        }
        System.out.println(sum+" sum of the number");
    }
}
