public class Main {
    public static void main(String[] args) {
        for (DangerLevel value : DangerLevel.values()) {
            System.out.println(value.name() + " " + value.getDangerLevel());
        }

        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
        System.out.println(high.getDangerLevel() > medium.getDangerLevel()); // true
    }
}