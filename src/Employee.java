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


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
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

    public void tax() {
        double afterTax;
        System.out.println("###########################");
        System.out.println("Salary Before Tax : " + getEmployeeSalary() + " TRY");
        if (this.getEmployeeSalary() < 1000) {
            this.getEmployeeSalary();
        } else {
            this.setEmployeeSalary(this.getEmployeeSalary() - ((this.getEmployeeSalary() * 3) / 100));
        }
        System.out.println("3% tax has been withheld from your salary.");
        System.out.println("Salary After Tax : " + getEmployeeSalary() + " TRY");
    }

    public void bonus() {
        System.out.println("###########################");
        System.out.println("Salary Before Bonus : " + getEmployeeSalary() + " TRY");
        if (getWorkHours() < 40) {
            this.getEmployeeSalary();
        } else {
            this.setEmployeeSalary(this.getEmployeeSalary() + ((this.getWorkHours() - 40) * 30));
        }
        System.out.println(("You've worked more than " + (this.getWorkHours() - 40) + " hours." +
                "You earned " + ((this.getWorkHours() - 40) * 30)) + " TRY overtime wage.");
        System.out.println("Salary After Bonus : " + getEmployeeSalary() + " TRY");

    }

    public void raiseSalary() {
        int currentYear = 2021;
        System.out.println("###########################");
        System.out.println("Salary Before Raise : " + getEmployeeSalary() + " TRY");
        if ((currentYear - this.getHireYear()) < 10) {
            this.setEmployeeSalary(this.getEmployeeSalary() + ((this.getEmployeeSalary() * 5) / 100));
        } else if ((currentYear - this.getHireYear()) >= 10 && (currentYear - this.getHireYear()) < 20) {
            this.setEmployeeSalary(this.getEmployeeSalary() + ((this.getEmployeeSalary() * 10) / 100));
        } else {
            this.setEmployeeSalary(this.getEmployeeSalary() + ((this.getEmployeeSalary() * 15) / 100));
        }
        System.out.println("Salary After Raise : " + getEmployeeSalary() + "TRY");

    }

    public String toString() {
        return "Employee Name : " + getEmployeeName() +
                "\nEmployee Salary : " + getEmployeeSalary() + " TRY" +
                "\nEmployee Work Hours : " + getWorkHours() +
                "\nEmployee Hire Year : " + getHireYear();
    }
}
