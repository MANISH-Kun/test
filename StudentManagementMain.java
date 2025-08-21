public class StudentManagementMain {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement(12, "bro", 12);
        System.out.println(sm.getId());
        System.out.println(sm.getName());
        System.out.println(sm.getMarks());

        sm.setName(" ");

    }
}
