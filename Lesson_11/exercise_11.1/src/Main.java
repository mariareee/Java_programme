/*Days of the week
* declare an enum named DayOfWeek.It should include all days of the week
* in uppercase: MONDAY...SUNDAY*/
public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}