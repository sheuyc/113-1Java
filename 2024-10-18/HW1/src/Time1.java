public class Time1 {

    private int hour;
    private int minute;
    private int second;

    //方法：建構子(設定時、分、秒的初始值，需檢查資料是否格式正確)
    public Time1(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // 設定時
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("小時必須在 0 到 23 之間");
        }
        this.hour = hour;
    }

    // 取得時
    public int getHour() {
        return hour;
    }

    // 設定分
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("分鐘必須在 0 到 59 之間");
        }
        this.minute = minute;
    }

    // 取得秒
    public int getSecond() {
        return second;
    }

    // 設定秒
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("秒數必須在 0 到 59 之間");
        }
        this.second = second;
    }

    // 取得分
    public int getMinute() {
        return minute;
    }

    //方法：tick (增加時間)
    public void tick(int time) {
        if (time > 0){
            second += time;
            while (second >= 60 || minute >= 60 ||hour >= 24){
                if (second >= 60) {
                    second = second - 60;
                    minute++;
                    if (minute >= 60) {
                        minute = minute - 60;
                        hour++;
                        if (hour >= 24) {
                            hour = hour - 24;
                        }
                    }
                }
            }
            System.out.println("秒");
            System.out.println("過了"+time+"秒後：");
        }
        else {
            System.out.println("時間不為正，來亂的！");
        }
    }

    // 以24小時制輸出完整時間
    public String printUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // 以12小時制輸出完整時間
    public String printStandard() {
        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }
        String period = hour < 12 ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }
}
