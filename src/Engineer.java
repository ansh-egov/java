public class Engineer extends Employee {
    private double Benefits;
    public Engineer(String name, double baseSalary, double gratuity, long joiningDate, double Benefits) {
        super(name, baseSalary, gratuity, joiningDate);
        this.Benefits = Benefits;
    }

    public void displayTotalSalary(){
        double totalSalary = super.addSalary() + Benefits;
        System.out.println("Total salary is: " + totalSalary + " per month");
    }
    public void displayEmployeeRole(){
        String instance = this.getClass().getSimpleName();
        System.out.println("I am an "+ instance +" of the type employee, I can do anything!");
    }
}
