
import java.util.ArrayList;
import java.util.HashSet;

public class autoBoxing {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("rawr");
        al.add(null);
        al.add(true);
        al.add(28.453);
        al.add(new Student("goat", 2, 'm', null));
        System.out.println(al);

        ArrayList<String> name = new ArrayList<String>();
        name.add("manish");
        name.add("1");
        System.out.println(name);

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        // hs.add("e");
        hs.add(2);
        hs.add(3);
        hs.add(1);
        System.out.println(hs);


    }
}
