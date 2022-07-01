public class TeamLead extends Programmer{
    private int numTeamLead; //1
    public TeamLead(int numTeamLead) {
        super(numTeamLead); // java can create autom super, but is not ok for this case
        this.numTeamLead = numTeamLead;
        employ();
    }
    protected void employ() {
        System.out.println(numTeamLead + " teamlead");
    }
}
