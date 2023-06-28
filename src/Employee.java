public class Employee {
    private String name;
    private double baseSalary;
    private double gratuity;
    private long joiningDate;

    public Employee(String name,double baseSalary,double gratuity,long joiningDate){
        this.name = name;
        this.baseSalary = baseSalary;
        this.gratuity = gratuity;
        this.joiningDate = joiningDate;
    }

//    public Employee(String name) {
//        this(name,0,0,0);
//    }

    public double addSalary(){
        double totalSalary = baseSalary + gratuity;
        return totalSalary;
    }
    public void displayTotalSalary(){
        double totalSalary = addSalary();
        System.out.println("Total salary is: " + totalSalary + " per month");
    }

    public void displayEmployeeRole(){
        String instance = this.getClass().getSimpleName();
        System.out.println("I am an "+ instance +" of the type employee, I can do anything!");
    }
}
