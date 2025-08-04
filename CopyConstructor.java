
public class CopyConstructor {
    public static  class demo{
          int a ;
        public demo(int a) {
            this.a = a;
            System.out.println(this.a);
          

        }

        public demo(demo d) {
            this.a=d.a;
            System.out.println(this.a);

        }
        
        
    }
    public static void main(String[] args) {
        demo d = new demo(10);
        System.out.println(d.a);
        
    }
}
