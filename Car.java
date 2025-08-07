public class Car extends Vehicle {

    String model;
    int numOfDorrs;

    public Car(String brand,int maxSpeed,String model,int numOfDorrs) {
        super(brand,maxSpeed);
        this.model=model;
        this.numOfDorrs=numOfDorrs;

    }
    
    

    void playMusic(){
        System.out.println("Playing music.....");
    }

    void  displayInfo(){
        System.out.println("brand :"+brand+" \nmodel :"+model+"\nmaxspeed :"+maxSpeed+"km/h");

    }

    
}
