public class Test {

    public static void main(String[] args) {

        YearCheck yearCheck = new YearCheck(1900);
        YearCheck yearCheck1 = new YearCheck(2012);
        YearCheck yearCheck2 = new YearCheck(2100);

        yearCheck.hasLeap();
        yearCheck1.hasLeap();
        yearCheck2.hasLeap();
    }
}
