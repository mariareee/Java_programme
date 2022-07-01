public class Clock {
    int hours = 12;  //scale 1-12
    int minutes = 0; //scale 0-59 -> no am or pm

    public int next(){
        for (int minutes = 0; minutes < 60; minutes++) {
            minutes += 1;
        }
        for (int hours = 0; hours < 12; hours++) {
            hours += 1;
        }
    }
}
