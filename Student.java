import java.util.List;

public class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester, List<Course> courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getSemester() {
        return semester;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName() + ", Marks: " + course.getMarks());
        }
    }

    public void printLowScoringCourses() {
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println("Course: " + course.getCourseName() + ", Marks: " + course.getMarks());
            }
        }
    }

    public static void main(String[] args) {
        List<Course> courses = List.of(
            new Course("Math", 45),
            new Course("Science", 35),
            new Course("History", 50)
        );

        Student student = new Student("John Doe", "Engineering", 3, courses);
        student.printStudentDetails();
        System.out.println("\nCourses with marks less than 40:");
        student.printLowScoringCourses();
    }
}
