 class Employee {
    final int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "John");
        e1.display();
    }
}