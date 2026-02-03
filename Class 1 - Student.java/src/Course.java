public class Course {
    public String courseName;
    public Student[] students; // Array for 6 students

    public Course(String name) {
        courseName = name;
        students = new Student[6]; // Room for 6 students
    }
}
