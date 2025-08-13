public class VehicleInterface {
    public interface  vehicle{
        int a = 30;

        void  move();
        default  void  move1(){

        }
    }



    static  class  Car implements vehicle{
        
        public void move(){
            System.out.println("car is moving");
        }

    }

    public static void main(String[] args) {
        Car c =  new Car();
        c.move();
        c.move1();
    }

    
}
