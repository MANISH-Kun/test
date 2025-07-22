public class perfectnumber {
    public static void main(String[] args) {
        int number = 255;
        int factors=0;
        for(int i=1;i<=number-1;i++){  // for optimized code for(int i=1;i<=number/2;i++)
            if(number%i==0){
                factors=factors+i;

            }
        }
        if(factors==number){
            System.out.println(number+"the number is perfect number");
    }
    else{
        System.out.println("not a perfect no");
    }
    System.out.println("done");

    }
}
