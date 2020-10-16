public class Test {

    public static void main(String[] args) {

        YearCheck yearCheck = new YearCheck();
        int year1 = 2012;
        int year2 = 2005;
        int year3 = 2045;

        boolean isLeap = yearCheck.hasLeap(year1);
        System.out.println(isLeap);
        boolean isLeap1 = yearCheck.hasLeap(year2);
        System.out.println(isLeap1);
        boolean isLeap2 = yearCheck.hasLeap(year3);
        System.out.println(isLeap2);
    }
}
