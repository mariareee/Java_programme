public class Patient {
    private String name;

    Patient(String name){
        this.name = name;
    }

    public void say(){
        System.out.println("Hello, my name is " + name +".I need a doctor");
    }
}
