public class findevenandoddcountinnumber {
    public static void main(String[] args) {
        int number = 1234;
        int evencount = 0;
        int oddcount = 0;
        int num=0;
        while(number>0){
            // System.out.println("number:"+number);
            num=num+number%10;

            if(num%2==0){
                evencount+=1;
            }
            else{
                oddcount+=1;
            }
            number=number/10;
        }
        System.out.println("even count"+evencount);
        System.out.println("odd count:"+oddcount);
    }
}
