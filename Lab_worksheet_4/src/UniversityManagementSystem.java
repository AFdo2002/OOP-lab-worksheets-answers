public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department csDepartment = new Department("Computer Science");
        Degree softwareEngineering = new Degree("Software Engineering");
        Course oopCourse = new Course("Object-Oriented Programming", "Mandatory");

        Lecturer lecturer = new Lecturer("Dr. John Doe", "Professor", csDepartment);
        Student student = new Student("Alice", "S12345", "2nd Year", softwareEngineering);

        csDepartment.offerCourse(oopCourse);
        softwareEngineering.offerCourse(oopCourse);

        lecturer.addCourse(oopCourse);
        student.enrollCourse(oopCourse);

        csDepartment.appointDepartmentHead(lecturer);

        // Display information
        lecturer.displayInfo();
        lecturer.listCoursesTeaching();

        student.displayInfo();
        student.listCoursesEnrolled();

        csDepartment.displayInfo();
    }
}
