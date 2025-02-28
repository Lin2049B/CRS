package models;
public class Enrollment {
    private int id;
    private int studentId;
    private int courseId;
    private String grade;

    public Enrollment(int id, int studentId, int courseId, String grade) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }

    // Getters & Setters
}
