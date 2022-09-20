package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        System.out.println(year%4==0 && year!=1900? "leap": "not leap");
    }
}
