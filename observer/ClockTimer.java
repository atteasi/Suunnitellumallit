package observer;

public class ClockTimer extends Subject {
    
    private static int hour, minute, second;

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    };

    void tick(){
        second++;
        System.out.println(second);
        if(second >= 60){
            minute++;
            second = 0;
            if(minute >= 60){
                minute = 0;
                hour++;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        notifyTimer();
    }
}
