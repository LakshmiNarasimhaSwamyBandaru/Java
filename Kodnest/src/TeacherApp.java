public class TeacherApp {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.id=122;
        t1.name="Bhaskar";
        t1.subject="anatomt";
        t1.teach();
        t1.motivate();
        t1.giveAssignments();
        System.out.println(t1.id);
        System.out.println(t1.name);
        System.out.println(t1.subject);
    }
}
