public class Programmer {
    private int numProgrammer;

    public Programmer(){ //1
       numProgrammer = 1;
       employ();
    }
    public Programmer(int numProgrammer) {
        this.numProgrammer = numProgrammer;
        employ();
    }
    private void employ() { //changed to private -> to not have override
        System.out.println(numProgrammer + " programmer");
    }
}
