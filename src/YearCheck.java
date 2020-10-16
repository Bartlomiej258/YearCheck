public class YearCheck {

    private int year;
    private boolean leap;

    public YearCheck(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return leap;
    }

    public void setLeap(boolean leap) {
        this.leap = leap;
    }

    void hasLeap() {
        if (getYear() % 4 == 0) {
            if (getYear() % 100 == 0) {
                if (getYear() % 400 == 0) {
                    leap = true;
                } else leap = false;
            } else leap = true;
        } else leap = false;
        if (isLeap() == true) {
            System.out.println(getYear() + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

