public class DataAnalyst extends Employee {
    protected boolean phd;
    protected String[] methods;

    public DataAnalyst(String name,String email,int experience,boolean phd, String[] methods){
        super(name, email, experience);
        this.methods = methods;
        this.phd = phd;
    }

    public String[] getMethods() {
        return methods;
    }

    public boolean isPhd() {
        return phd;
    }
}
