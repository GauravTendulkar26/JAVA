class Employee {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Instance variables
    private String name;
    private String position;
    private double salary;

    // Default constructor
    public Employee() {
        // Increment the object count
        objectCount++;
        // Display object count after each object is created
        System.out.println("Object created. Total objects: " + objectCount);
    }

    // Parameterized constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;

        // Increment the object count
        objectCount++;

        // Display object count after each object is created
        System.out.println("Object created. Total objects: " + objectCount);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }

    // Static method to get the object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Employee employee1 = new Employee("John Doe", "Software Engineer", 80000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Jane Smith", "Project Manager", 100000);
        System.out.println(employee2);

        // Display the contents of each object
        System.out.println("\nDetails of Employee 1:");
        System.out.println(employee1);

        System.out.println("\nDetails of Employee 2:");
        System.out.println(employee2);
    }
}
public class Employee {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Instance variables
    private String name;
    private String position;
    private double salary;

    // Default constructor
    public Employee() {
        // Increment the object count
        objectCount++;
        // Display object count after each object is created
        System.out.println("Object created. Total objects: " + objectCount);
    }

    // Parameterized constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;

        // Increment the object count
        objectCount++;

        // Display object count after each object is created
        System.out.println("Object created. Total objects: " + objectCount);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }

    // Static method to get the object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Employee employee1 = new Employee("John Doe", "Software Engineer", 80000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Jane Smith", "Project Manager", 100000);
        System.out.println(employee2);

        // Display the contents of each object
        System.out.println("\nDetails of Employee 1:");
        System.out.println(employee1);

        System.out.println("\nDetails of Employee 2:");
        System.out.println(employee2);
    }
}

