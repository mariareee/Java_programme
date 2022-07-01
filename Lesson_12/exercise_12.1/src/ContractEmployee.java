public class ContractEmployee extends Employee {
    protected long payPerHour;
    protected String contractPeriod;
    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        super(name, birthDate); // added this field
        this.payPerHour = payPerHour; // corrected from super -> this
        this.contractPeriod = contractPeriod;
    }
}