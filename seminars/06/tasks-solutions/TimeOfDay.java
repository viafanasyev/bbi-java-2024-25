public class TimeOfDay {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeOfDay(int hours, int minutes, int seconds) {
        this(hours * 60 * 60 + minutes * 60 + seconds);
    }

    public TimeOfDay(int seconds) {
        setFromSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void changeSeconds(int delta) {
        int newSeconds = hours * 60 * 60 + minutes * 60 + seconds + delta;
        setFromSeconds(newSeconds);
    }

    public void changeMinutes(int delta) {
        int newSeconds = hours * 60 * 60 + (minutes + delta) * 60 + seconds;
        setFromSeconds(newSeconds);
    }

    public void changeHours(int delta) {
        int newSeconds = (hours + delta) * 60 * 60 + minutes * 60 + seconds;
        setFromSeconds(newSeconds);
    }

    public String to24HourString() {
        // String.format имеет тот же смысл, что и printf, но возвращает отформатированную строку, а не выводит её
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String to12HourString() {
        if (hours < 12) {
            return String.format("%02d:%02d:%02d AM", hours, minutes, seconds);
        } else {
            return String.format("%02d:%02d:%02d PM", hours - 12, minutes, seconds);
        }
    }

    public boolean equals(TimeOfDay other) {
        return hours == other.hours &&
                minutes == other.minutes &&
                seconds == other.seconds;
    }

    // Вспомогательный метод, устанавливающий значение полей из секунд
    private void setFromSeconds(int seconds) {
        seconds = normalizeSeconds(seconds);
        this.seconds = seconds % 60;
        this.minutes = (seconds / 60) % 60;
        this.hours = ((seconds / 60) / 60) % 24;
    }

    // Вспомогательный метод, приводящий секунды к корректному значению в рамках одних суток
    private static int normalizeSeconds(int seconds) {
        seconds %= 24 * 60 * 60;
        if (seconds < 0) {
            // Если кол-во секунд отрицательное - считаем это смещением относительно 00:00:00 во "вчерашний" день
            seconds += 24 * 60 * 60;
        }
        return seconds;
    }
}
