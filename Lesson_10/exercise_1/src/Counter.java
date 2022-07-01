public class Counter {
    private int current;
    public Counter(int current){
        this.current = current;
    }
    //increases the value of the field value by one
    public void inc(){
         current++;
    }
    //getCurrent that returns the current value
    public int getCurrent() {
        return current;
    }
}
