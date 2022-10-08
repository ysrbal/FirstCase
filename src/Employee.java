public class Employee {
    private String employeeName;
    private int employeeSalary;
    private int workHours;
    private int hireYear;

    public Employee(String employeeName, int employeeSalary, int workHours, int hireYear) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
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
}
