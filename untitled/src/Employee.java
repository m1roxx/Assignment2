class Employee extends Person {
    private static int idCounter = 0;
    private String name;
    private String surname;
    private String position;
    private double salary;
    private int id;
    public Employee() {
        this.id = ++idCounter;
    }
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public double getPaymentAmount() {
        return salary;
    }
    public String toString() {
        return "Employee: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
