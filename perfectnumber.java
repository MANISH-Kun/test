public class perfectnumber {
    public static void main(String[] args) {
        int number = 6;
        int factors=0;
        for(int i=1;i<=number-1;i++){
            if(number%i==0){
                factors=factors+i;

            }
        }
        if(factors==number){
            System.out.println("the number is perfect number");
    }
    else{
        System.out.println("not a perfect no");
    }
    System.out.println("done");

    }
}
