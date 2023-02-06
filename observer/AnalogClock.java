package observer;

public class AnalogClock implements Observer{
    private ClockTimer timer;

    public AnalogClock(ClockTimer ct) {
        timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Subject s) {
        if (s == timer) {
            draw();
        }
    }


    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getHour();
        int second = timer.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
