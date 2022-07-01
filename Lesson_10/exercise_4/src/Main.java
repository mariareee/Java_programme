public class Main {
    public static void main(String[] args) {
        Account user1 = new Account();
        user1.setBalance(13000);
        user1.setOwnerName("Harry");
        user1.isLocked(true);

        System.out.println("Owner's name: " + user1.getOwnerName() +
                " and the balance is " + user1.getBalance() + ".The account is locked : "
                + user1.getLocked());
    }
}