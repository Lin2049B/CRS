package models;
public class Courses {
    private int id;
    private String title;
    private int creditHours;
    private String department;
    private String prerequisites;
    private int maxCapacity;

    public Courses(int id, String title, int creditHours, String department, String prerequisites, int maxCapacity) {
        this.id = id;
        this.title = title;
        this.creditHours = creditHours;
        this.department = department;
        this.prerequisites = prerequisites;
        this.maxCapacity = maxCapacity;
    }

    // Getters & Setters
}
