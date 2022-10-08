public class Employee {
    private String employeeName;
    private double employeeSalary;
    private int workHours;
    private int hireYear;

    public Employee(String employeeName, double employeeSalary, int workHours, int hireYear) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee() {}

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax;
        if (getEmployeeSalary() >= 1000) {
            tax = (getEmployeeSalary() * 3) / 100;
        } else {
            tax = 0;
        }
        return tax;
    }
}
