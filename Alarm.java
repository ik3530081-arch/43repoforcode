import java.time.LocalTime;

public class AlarmClock {
    public static void main(String[] args) throws InterruptedException {

        // Set alarm time (HH, MM, SS)
        int alarmHour = 14;
        int alarmMinute = 30;
        int alarmSecond = 0;

        System.out.println("Alarm set for " + alarmHour + ":" + alarmMinute);

        while (true) {
            LocalTime now = LocalTime.now();

            if (now.getHour() == alarmHour &&
                now.getMinute() == alarmMinute &&
                now.getSecond() == alarmSecond) {

                System.out.println("⏰ Alarm! Time reached!");
                break; // stop after alarm
            }

            Thread.sleep(1000); // check every second
        }
    }
}
