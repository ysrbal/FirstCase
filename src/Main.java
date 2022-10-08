public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Yasar BAL", 9000, 50, 2019);

        String print = employee.toString();
        System.out.println(print);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
    }
}