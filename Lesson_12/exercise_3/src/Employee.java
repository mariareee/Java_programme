public class Employee {
    protected String name;
    protected String email;
    protected int experience;

    public Employee(String name,String email,int experience){
        this.name = name;
        this. email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getEmail() {
        return email;
    }
}

