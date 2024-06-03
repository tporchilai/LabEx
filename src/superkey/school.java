package superkey;

public class school{
    int student_roll_no;
    int teacher_id_no;
    String student_name;
    String teacher_name;
    String student_dept;
    String teacher_dept;
void display(){
    System.out.println("This is information about the student");
    System.out.println("Student roll no -> " +student_roll_no);
System.out.println("Student name -> "+ student_name);
System.out.println("Student department -> " + student_dept);
}

    void display1(){
        System.out.println("This is information about the student");
        System.out.println("Student roll no -> " +student_roll_no);
        System.out.println("Student name -> "+ student_name);
        System.out.println("Student department -> " + student_dept);

    }

     static class student extends school{

     student(int student_roll_no,  String student_name, String student_dept){

        this.student_roll_no=student_roll_no;
        this.student_name=student_name;
        this.student_dept=student_dept;

    }}
    static class teacher extends school {
        teacher(int teacher_id_no, String teacher_name, String teacher_dept) {
            this.teacher_id_no = teacher_id_no;
            this.teacher_name = teacher_name;
            this.teacher_dept = teacher_dept;

        }
    }
    public static void main(String[] args) {
    student s1 = new student(101,"Ash", "Computer Science");
s1.display();

teacher t1 = new teacher(111, "Kala", "Mathematics");
t1.display1();
    }

    }

