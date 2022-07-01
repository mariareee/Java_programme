/*Write a class named User. It must have three string
fields: login, firstName,lastName and a constructor with
 three parameters to initialize these fields
 - Create an instance of User class inside main method*/
public class Main {
    public static void main(String[] args) {
        User user = new User("J_Wayne", "Wanye", "Johnes");
        //print the msg
        System.out.println("Login : " + user.login + " First Name: " + user.firstName + " Last name:"+ user.lastName);
    }
}