package observer;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        ClockTimer clockTimer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(clockTimer);
        DigitalClock digitalClock = new DigitalClock(clockTimer);

        while(true){
            Thread.sleep(1);
            clockTimer.tick();
        }
	}
}

