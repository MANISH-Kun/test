public class ATMFetch {
    public static void main(String[] args) {
        ATM a =  new ATM("suda",2345,20000.00,1234);
        // a.setBalance(400000.00);
        // System.out.println(a.name);
        a.resetPin(2345,1224);
        

    //    System.out.println(a.withdraw(124)); 
    // a.setBalance(40000);
    //    System.out.println(a.getBalance(124)); 
       a.withdraw(2345,1224, 300.00);
    }
}
