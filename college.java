public class college {
    static  int b =10;

    public static void main(String[] args) {
        Student s = new Student("manish",20,'m',"mitk");
        Student s1 = new Student("manish",20,'m',"mitk");
        Student s2 = new Student("manish",20,'m',"mitk");
        Student s3 = new Student("manish",20,'m',"mitk");

        
        System.out.println(s.name);
        s.printMarks(40);
        s.lunchTime("1pm");

        s1.marks=10;
        s1.time="1pm";

        System.out.println(s.marks);
        System.out.println(b);
    }
    
    
}
