public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("akash", 23, 'm', 1234567867986l, "167B2980", 670988l);
        Person p2 = new Person("suda", 33, 'm', 123456783l, "1672A984", 670989l);
        Person p3 = new Person("k", 33, 'm', 123456783l, 670989l);
        Person p4 = new Person("l", 33, 'm', "1672A984", 670989l);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p4.adharCard);
        System.out.println(p3.panCard);

    }
}
