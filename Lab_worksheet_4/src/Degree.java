import java.util.ArrayList;

class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name) {
        this.name = name;
        this.numberOfStudents = 0;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering() {
        System.out.println("Courses offered under " + name + ":");
        for (Course course : coursesOffering) {
            course.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Degree: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
    }
}
