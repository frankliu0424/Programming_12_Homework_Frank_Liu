import java.util.ArrayList;

public class Student {

    // class variable - private
    private String first_name;
    private static int sid = 0;
    private ArrayList<Course> courses = new ArrayList<>();


    public Student(String name) {
        first_name = name;
        sid += 1;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void showCourse() {
        System.out.println(courses);
    }

    public void avgGrade() {
        double total_grade = 0;
        for (int i = 0; i < courses.size(); i++) {
            total_grade += courses.get(i).getGrade();
        }
        double avg_grade = total_grade / courses.size();
        System.out.println(first_name + "'s average grade is: " + avg_grade);
    }

    public String toString() {
        return "Student Name: " + first_name + ", Student ID: " + sid;
    }
}
