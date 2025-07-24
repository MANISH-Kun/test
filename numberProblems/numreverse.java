public class numreverse {
    public static void main(String[] args) {
        int number = 005;
        int reversenum = 0;
        while(number>0){
            int ld = number%10;

            reversenum=reversenum*10+ld;
            number/=10;

        
        }
        System.out.println(reversenum);

        
    }
}
