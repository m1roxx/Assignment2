class Person implements Comparable<Person>, Payable {
    private static int idCounter = 0;
    private String name;
    private String surname;
    private int id;
    public Person() {
        this.id = ++idCounter;
    }
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
    public double getPaymentAmount() {
        return 0.0;
    }
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String getPosition() {
        return "Student";
    }
}
