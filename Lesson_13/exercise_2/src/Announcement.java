public class Announcement extends Publication {
    private int daysToExpire;
    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }
    // written  code
    @Override
    public String getDetails() {
        return "(days to expire - " + daysToExpire + "):";
    }
}
