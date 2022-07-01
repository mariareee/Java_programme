public class Employee {
    protected String name;
    protected String birthDate;
    public Employee(String name, String birthDate) {
        this.name = name; // corrected from super -> this
        this.birthDate = birthDate;// corrected from super -> this
    }
}