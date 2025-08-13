public class Student1 {
    String name;
    int age;
    int id;
    public Student1(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;

    }

    
    public String toString(){
        return id+" "+ name+" "+age;
    }


    public static void main(String[] args) {
        Student1 s= new  Student1(10,"man",10);
        Student1 s1= new  Student1(10,"huh",10);
        Student1 s2= new  Student1(10,"marawn",10);
        Student1 s3= new  Student1(10,"rawr",10);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }
}
