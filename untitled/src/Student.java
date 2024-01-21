class Student extends Person {
    private static final double STIPEND_AMOUNT = 36660.00;
    private static int idCounter = 0;
    private int id;
    private String name;
    private String surname;
    private double gpa;
    public Student() {
        this.id = ++idCounter;
    }
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND_AMOUNT : 0.0;
    }
    public String toString() {
        return "Student: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
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
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
}
