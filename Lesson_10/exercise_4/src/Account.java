public class Account {
    private long balance;
    private String ownerName;
    private boolean locked;

    // getter & setter for balance
    public long getBalance(){
        return balance;
    }
    public void setBalance(long val){
        balance = val;
    }
    // getter & setter for locked
    public boolean getLocked(){
        return locked;
    }
    public void isLocked(boolean val){
        locked = val;
    }
    // getter & setter for ownerName
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String val){
        ownerName = val;
    }
}
