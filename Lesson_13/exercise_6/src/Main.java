/*You are given a class named User. It has three string fields: login, firstName,
lastName. Override the method toString() in the class to return string representations
of users. The overridden method must return a string including all field-value pairs
separated by commas.
Example: "login=javagod,firstName=James,lastName=Gosling"*/
public class Main {
    public static void main(String[] args) {
        User user = new User("java_expert", "James","Gosling");
        System.out.println(user);
    }
}