package AITU;

public class StudentTest {
    public static void main (String[] args){
        Student[] students = new Student[2];
        students[0] = new Student("Ali" , "Khan");
        students[0].addGrade(3.5);
        students[0].addGrade(2.9);
        students[0].addGrade(3.0);
        students[0].addGrade(2.8);
        students[0].addGrade(3.1);

        students[1] = new Student("Amina" , "Nur");
        students[1].addGrade(3.9);
        students[1].addGrade(3.5);
        students[1].addGrade(3.1);
        students[1].addGrade(3.0);
        students[1].addGrade(3.4);

        System.out.println("ID firstname lastname Email GPA");
        for (int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println(
                    s.getId() + " " + s.getFirstname() + " " + s.getLastname() + " " + s.getEmail() + " " + s.getGPA()

            );
        }
    }
}
