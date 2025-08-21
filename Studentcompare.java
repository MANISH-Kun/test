public class Studentcompare {
        int id;
        String name;
        int age;

        public Studentcompare(int id,String name,int age){
            this.id=id;
            this.name=name;
            this.age=age;
        }

        public String toString(){
            return id+" "+name+" "+age;
        }

        public boolean equals(Object obj){
            Student s=(Student) obj;
            if(this.name==s.name && this.name.equals(s.name)&&this.age==s.age){
                return  true;
            }
            return false;
        }
    }

