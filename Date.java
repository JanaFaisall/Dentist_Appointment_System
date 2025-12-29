public class Date {

    private int Day;
    private int Month;
    private int Year;
    private int Hour;
    private int Minute;

    public Date(int Hour, int Minute, int Day, int Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
        this.Hour = Hour;
        this.Minute = Minute;
    }

    public Date() {
        this(0, 0, 0, 0, 0);
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int Hour) {
        if (Hour >= 0 && Hour <= 23) {
            this.Hour = Hour;
        } else {
            this.Hour = 0;
        }

    }

    public int getMinute() {
        return Minute;
    }

    public void setMinute(int Minute) {
        if (Minute >= 0 && Minute <= 59) {
            this.Minute = Minute;
        } else {
            this.Minute = 0;
        }
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        if (Day >= 1 && Day <= 31) {
            this.Day = Day;
        } else {
            this.Day = 0;
        }
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return String.format("Date: %02d/%02d/%04d %nTime: %02d:%02d %n", Day, Month, Year, Hour, Minute);
    }

}
