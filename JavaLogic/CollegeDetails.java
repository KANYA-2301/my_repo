class   Student{
    String name;
    int mark;
    String college;
}
public class CollegeDetails {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Kanya";
        s.mark=100;
        s.college="KNCET";
        System.out.println(s.name);
        System.out.println(s.mark);
        System.out.println(s.college);
    }
}
