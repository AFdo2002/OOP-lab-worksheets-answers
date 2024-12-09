class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;

    public Course(String name, String enrollType) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = 0;
    }

    public String getName() {
        return name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void displayInfo() {
        System.out.println("Course: " + name + " (" + enrollType + ")");
    }
}
