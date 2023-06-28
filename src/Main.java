// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ansh",100.0,200.0,1000);
        employee.displayEmployeeRole();
        employee.displayTotalSalary();

        Engineer engineer = new Engineer("Ansh",200.0,100.0,10,100);
        engineer.displayEmployeeRole();
        engineer.displayTotalSalary();
    }
}