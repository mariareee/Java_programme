public class Maria {
    private static int countingInstances = 0;

    Maria(){
        countingInstances++;
    }

    public static int getprintCounter(){
        return countingInstances;
    }
}
