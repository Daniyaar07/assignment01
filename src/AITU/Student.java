package AITU;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private double[] grades;

    private static int nextID = 250001;
    private static String domain = "astanait.edu.kz";

    public Student() {
        this.firstname = "John";
        this.lastname = "Wick";
        this.id = nextID++;
        this.grades = new double[0];
    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextID++;
        this.grades = new double[0];
    }

    public Student(String firstname, String lastname, double[] grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextID;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double[] getGrades() {
        return grades;
    }

    public static int getNextID() {
        return nextID;
    }

    public static String getDomain() {
        return domain;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public double getGPA(){
        double sum = 0;
        for(int i = 0; i < grades.length; i++ ) {
            double g = grades[i];
            sum+= g;
        }
        return sum / grades.length;
    }
    public boolean Honors(){
        return getGPA() >= 3.5;
    }
    public String getEmail(){
        return id + "@" + domain;
    }
    public void addGrade(double grade){
        double[] newGrades = new double[grades.length + 1];
        for (int i = 0; i < grades.length; i++){
            newGrades[i] = grades[i];
        }
        newGrades[grades.length] = grade;
        grades = newGrades;
    }
}