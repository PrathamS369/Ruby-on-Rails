package CoreJava;

class Student {
    int rollno;
    String name;
    float marks;
}

public class object {

    public static void main(String a[]) {

        Student S1 = new Student();
        S1.rollno = 1;
        S1.name = "Pratham";
        S1.marks = 85.6f;

        Student S2 = new Student();
        S2.rollno = 2;
        S2.name = "Purnima";
        S2.marks = 85.5f;

        Student S3 = new Student();
        S3.rollno = 3;
        S3.name = "Reena";
        S3.marks = 95.6f;

        Student students[] = new Student[3]; // array of students

        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for (Student stud : students) {

            System.out.println(stud.name + ":" + stud.rollno);

        }

    }
}