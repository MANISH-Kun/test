public class xylemAndFlouemNumber {
    public static void main(String[] args) {
        

        int num=7234;
        int extremeSum=num%10;
        num = num/10;
        int middlesum=0;
        while(num>9){
            int lastDigit = num%10;
            middlesum=middlesum+lastDigit;
            num=num/10;
        }
        extremeSum=extremeSum+num;
        if(extremeSum==middlesum){
            System.out.println("it is xylum number");
        }
        else{
            System.out.println("it is phloem number");
        }


        
    }
    
}
