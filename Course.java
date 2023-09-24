public class Course {

    // class variable - private
    private String subject_name;
    private double grade;

    public Course(String s_name, double grade) {
        subject_name = s_name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String toString() {
        return subject_name;
    }
}
