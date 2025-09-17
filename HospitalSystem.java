abstract class Staff {
    private String name;
    private double baseSalary;

    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();
}


class Doctor extends Staff {
    private double consultationFees;

    public Doctor(String name, double baseSalary, double consultationFees) {
        super(name, baseSalary);
        this.consultationFees = consultationFees;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public double calculateSalary() {
        return getBaseSalary() + consultationFees;
    }
}


class Nurse extends Staff {
    private int extraHours;
    private double ratePerHour;

    public Nurse(String name, double baseSalary, int extraHours, double ratePerHour) {
        super(name, baseSalary);
        this.extraHours = extraHours;
        this.ratePerHour = ratePerHour;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return getBaseSalary() + (extraHours * ratePerHour);
    }
}


class AdminStaff extends Staff {
    private double bonus;

    public AdminStaff(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}


public class HospitalSystem {
    public static void main(String[] args) {
        Staff doctor = new Doctor("Dr. Rahul", 50000, 15000);
        Staff nurse = new Nurse("Nurse Anu", 30000, 10, 500);
        Staff admin = new AdminStaff("Alex", 25000, 4000);

        printSalary(doctor);
        printSalary(nurse);
        printSalary(admin);
    }

    public static void printSalary(Staff staff) {
        System.out.println(staff.getName() + "'s Total Salary: " + staff.calculateSalary());
    }
}
