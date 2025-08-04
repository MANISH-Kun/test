public class Student {
    String name;
    int age;
    char gender;
    String collegeName;
    int marks;
    String time;

    public Student( String name,int age,char gender,String collegeName) { //,int marks,String time
        this.name=name;
        this.age=age;
        this.gender = gender;
        this.collegeName= collegeName;
        this.marks=marks;
        this.time=time;
    }

    public void  printMarks(int marks){
        this.marks=marks;
        System.out.println("student marks "+this.marks);
    }
     public void  lunchTime(String time){
        this.time=time;
        System.out.println("lunch time "+this.time);
    }

    
}
