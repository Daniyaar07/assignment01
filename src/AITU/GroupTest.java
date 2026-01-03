package AITU;

public class GroupTest {
    public static void main(String[] args){
        Group g = new Group("BDA-2601");
        Student s1 = new Student("Ali", "Khan");
        s1.addGrade(3.8);
        s1.addGrade(3.6);
        s1.addGrade(3.9);
        Student s2 = new Student("Amina", "Nur");
        s2.addGrade(3.2);
        s2.addGrade(3.4);
        s2.addGrade(3.1);
        Student s3 = new Student ("Dias" , "Bek");
        s3.addGrade(3.7);
        s3.addGrade(3.8);
        s3.addGrade(4.0);
        g.addStudent(s1);
        g.addStudent(s2);
        g.addStudent(s3);

        System.out.println(g.toString());
        System.out.println("AVG GPA:" + g.getAverageGpa());
        g.printHallOfFame();
        boolean removed = g.removeStudent(s2.getId());

        System.out.println(g.toString());
    }
}
