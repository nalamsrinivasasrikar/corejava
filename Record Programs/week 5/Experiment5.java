package recordprog;
class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Default Constructor
    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Eligible";
    }

    // Parameterized Constructor
    Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + 
                           " | Designation: " + designation + 
                           " | Salary: " + salary + 
                           " | Promotion: " + promotionStatus);
    }
    

    public static void main(String[] args) {
        // Using Default Constructor
        Employee e1 = new Employee();
        e1.display();

        // Using Parameterized Constructor
        Employee e2 = new Employee("Srikar", 101, "Developer", 45000, "Eligible");
        e2.display();
    }
}

