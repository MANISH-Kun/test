

public class OnlineExamSystem {

    public static void startExam(String password,int timeLeft) throws InvalidLoginException,TimeOverException{
        if(password!="admin123"){
            throw new InvalidLoginException("invalid login excep");

        }
        if(timeLeft<=0){
            throw new TimeOverException("time out except");
        }




    }

    public static void main(String[] args) {
       try {
         startExam("admin1234", 30);
           
       } catch (InvalidLoginException e) {
        System.out.println("exception : "+ e);

       }
       catch (TimeOverException e) {
        System.out.println("exception : "+ e);

       }
       finally{
        System.out.println("exam ended");
       }
    }
    
}
