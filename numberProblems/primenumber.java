public class primenumber {
    public static void main(String[] args) {
        int numbers=441;
        int divcount=0;
        for(int  i=1;i<=numbers;i++){
            
           
            if(numbers%i==0){

                // System.out.println(i+" is factor of :"+numbers);
                divcount+=1;
                
                
            }
           
            

        }
         if(divcount==2){
                    System.out.println(numbers+"is a prime number");
                }
        else{
            System.out.println("<:> :)"+numbers+" is not a prime number");
        }
    }
}
