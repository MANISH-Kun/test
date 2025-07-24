public class twistedprimenumber {
    public static void main(String[] args) {
        int number=77;
        int rev =0;
        int divcount=0;
        
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i+"is the factor of :"+number);
                divcount+=1;
            }

        }
        if(divcount==2){
            System.out.println(number+"is prime");
            System.out.println("now last reverse:");
        while(number>0){
            int lastnumber=number%10;
            rev=rev*10+lastnumber;
            number=number/10;
        }
        System.out.println("reverse of :"+number+"is"+rev);

        for(int i=1;i<=rev;i++){
            if(rev%i==0){
                System.out.println(i+"is factor of :"+rev);
                divcount+=1;
            }
        }
        if(divcount==2){
            System.out.println(rev+"is also the prime number");
            System.out.println("so the "+number+"is twisted prime no");
        }
        }
        


        
    }
    
}
