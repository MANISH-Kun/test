public class StudentManagement {
    private int id;
    private String name;
    private double marks;

    public StudentManagement(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }

    public void setId(int id){
        
        if(id>=0){
            this.id=id;
 
        }
        else{
            System.out.println("enter id gretaer than 0");
        }

    }
    public  void setName(String name){
        
        if(name!=null || !name.equals("name")){
            this.name=name;

        }
        else{
            System.out.println("name shouldnt be null ");
        }
    }

    public void setMarks(double  marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("marks should be in btw 0 and 100");
        }
    }

    public String toString(){
        return id+" "+name+" "+marks;

    }
    




    
}
