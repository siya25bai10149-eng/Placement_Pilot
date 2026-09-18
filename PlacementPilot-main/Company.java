public class Company {
    private String companyName;
    private double minCgpa;
    private int maxBacklogs;

    public Company(String name, double minCgpa, int maxBacklogs) {
        this.companyName = name;
        this.minCgpa = minCgpa;
        this.maxBacklogs = maxBacklogs;
    }

    public boolean isEligible(Student s) {
        return s.getCgpa() >= this.minCgpa && s.getBacklogs() <= this.maxBacklogs;
    }

    @Override
    public String toString() {
        return companyName + " (Min CGPA: " + minCgpa + ")";
    }
}