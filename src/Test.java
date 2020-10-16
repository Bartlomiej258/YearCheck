public class Test {

    public static void main(String[] args) {

        YearCheck yearCheck = new YearCheck();
        int year1 = 2012;
        int year2 = 2005;
        int year3 = 2054;


        boolean aaa = yearCheck.hasLeap(year1);
        System.out.println(aaa);
        boolean bb = yearCheck.hasLeap(year2);
        System.out.println(bb);
        boolean cc = yearCheck.hasLeap(year3);
        System.out.println(cc);
    }
}
