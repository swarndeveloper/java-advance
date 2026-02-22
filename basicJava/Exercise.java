package basicJava;
// TODO: Create an class called Employee



class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDetails(String name, double salary, String department) {
        return "Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + department;
    }
}


public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee emp = new Employee("Alice", 50000.0);
        System.out.println(emp.getDetails("Alice", 50000.0));
        // TODO: Print their details using getDetails()
        Manager mgr = new Manager("Bob", 80000.0, "IT");
        System.out.println(mgr.getDetails("Bob", 80000.0, "IT"));
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails(String name, double salary) {
        return "Name: " + this.name + ", Salary: " + this.salary;
    }
}