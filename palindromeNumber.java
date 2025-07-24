public class palindromeNumber {
    public static void main(String[] args) {
        int number=121;
        int copy=number;
        int reverse = 0;
        while(copy>0){
            int lastDigit=copy%10;
            reverse=reverse*10+lastDigit;
            copy=copy/10;

        }
        if(number==reverse){
            System.out.println("the given number "+number+" is a palindrome");
        }
        else{
            System.out.println("the given number "+number+" is not a palindrome");

        }

    }
}
