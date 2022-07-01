public enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int dangerLevel;
    DangerLevel(int dangerLevel){
        this.dangerLevel = dangerLevel;
    }
    public int getDangerLevel(){
        return dangerLevel;
    }
}
