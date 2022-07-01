public class RegularEmployee extends Employee {
    protected long salary; protected String hireDate;
    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        super(name, birthDate);// corrected from this -> super
        this.salary = salary; // corrected from super -> this
        this.hireDate = hireDate;
    }
}