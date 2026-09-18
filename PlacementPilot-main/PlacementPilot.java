import java.util.*;
import java.io.*;

public class PlacementPilot {
    private static Scanner sc = new Scanner(System.in);
    private static List<Company> companies = new ArrayList<>();
    private static Student currentStudent;

    public static void main(String[] args) {
        setupData(); // Initialize with some sample data
        System.out.println("=== Welcome to PlacementPilot 2026 ===");
        
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.print("Current Backlogs: ");
        int backlogs = sc.nextInt();
        
        currentStudent = new Student(name, name.toLowerCase() + "@example.com", cgpa, backlogs);

        while (true) {
            System.out.println("\n1. View All Companies\n2. Check Eligibility\n3. Save & Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> companies.forEach(System.out::println);
                case 2 -> checkAllEligibility();
                case 3 -> {
                    saveReport();
                    System.out.println("Report saved to data/eligibility_report.txt. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void setupData() {
        companies.add(new Company("Google", 8.5, 0));
        companies.add(new Company("Infosys", 7.0, 2));
        companies.add(new Company("Zomato", 8.0, 1));
    }

    private static void checkAllEligibility() {
        System.out.println("\n--- Eligibility Status for " + currentStudent.name + " ---");
        for (Company c : companies) {
            String status = c.isEligible(currentStudent) ? "[ELIGIBLE]" : "[NOT ELIGIBLE]";
            System.out.println(status + " " + c);
        }
    }

    private static void saveReport() {
        // Implementation of File I/O for data persistence
        try (PrintWriter writer = new PrintWriter(new FileWriter("eligibility_report.txt"))) {
            writer.println("Placement Eligibility Report for " + currentStudent.name);
            for (Company c : companies) {
                writer.println(c.toString() + " - " + (c.isEligible(currentStudent) ? "Eligible" : "Not Eligible"));
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}