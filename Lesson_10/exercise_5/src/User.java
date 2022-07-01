public class User {
    private String firstName;
    private String lastName;
    public User() {
        this.firstName = "";
        this.lastName = "";
    }
    public void setFirstName(String firstname){
        if(firstName != null){
            this.firstName = firstname;
        } else{
            this.firstName = " ";
        }
    }
    public void setLastName(String lastName){
        if(lastName != null){
            this.lastName = lastName;
        } else{
            this.lastName = " ";
        }
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty() ){
            return "Unknown";
        }
        else if(firstName.isEmpty() || lastName.isEmpty()){
            return lastName.isEmpty() ? firstName : lastName;
        }
        return firstName + " " + lastName;
    }
}

