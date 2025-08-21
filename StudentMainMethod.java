public class StudentMainMethod {
    public static void main(String[] args) {
        Studentcompare s1=new Studentcompare(12, "cobra", 1);
        Studentcompare s2=new Studentcompare(12, "cobra", 1);

        // System.out.println(s1.name==s2.name);
        // System.out.println(s1.age==s2.age);
        System.out.println(s1.name.equals(s2.name));
        if(s1.name==s2.name && s1.name.equals(s2.name)&&s1.age==s2.age ){
            System.out.println("all are same");
        }
        else{
            System.out.println("not same");
        }

    }
}
