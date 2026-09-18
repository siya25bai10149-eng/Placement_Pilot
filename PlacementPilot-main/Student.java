public class Student extends User {
    private double cgpa;
    private int backlogs;

    public Student(String name, String email, double cgpa, int backlogs) {
        super(name, email);
        this.cgpa = cgpa;
        this.backlogs = backlogs;
    }

    @Override
    public void displayProfile() {
        System.out.println("Student: " + name + " | CGPA: " + cgpa + " | Backlogs: " + backlogs);
    }

    // Getters for eligibility logic
    public double getCgpa() { return cgpa; }
    public int getBacklogs() { return backlogs; }
}