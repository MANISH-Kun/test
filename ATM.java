

public class ATM {
     private double balance ;
     private int pin ;
     String name;
     long accNo;
     

     
     

     

    public ATM(String name,long accNo,double balance,int pin) {
        this.name=name;
        this.accNo=accNo;
        this.balance=balance;
        this.pin=pin;

        
    }
    public int resetPin(long accNo,int pin){
        if(this.accNo==accNo){
            if(pin>1000 && pin<9999){
                this.pin=pin;
                System.out.println("pin reseted sucesfully");
               
            }
              
        }
        else{
            System.out.println("incorrect acc no");
            return -1;

        }
        return this.pin;

        
    }
    public double setBalance(double balance){
        this.balance+=balance;
        return this.balance;
        
    }

    

    public double withdraw(long accNo,int pin ,double  balance){
        if(this.pin == pin ){
            this.balance-=balance;
            System.out.println("bal after withdraw is:"+this.balance);
            return this.balance;

        }
        else{
            System.out.println("incorrect");
            return -1;
        }
    }

    public double getBalance(int pin){
        if(this.pin==pin){
            return balance;
        }
        else{
            return  -1;
        }
        
    }

    
}
