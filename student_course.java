public class student_course {
    public static void main(String[] args) {
        Student s1 = new Student("Frank");
        System.out.println(s1);
        Student s2 = new Student("");
        System.out.println(s2);

        Course c1 = new Course("Math", 100);
        System.out.println(c1);
        Course c2 = new Course("English", 83);
        System.out.println(c2);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.showCourse();
        s1.avgGrade();
    }
}
