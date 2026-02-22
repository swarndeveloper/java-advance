package AdvanceJava;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum Month {
    JANUARY(31, "Jan"),
    FEBRUARY(28, "Feb"),
    MARCH(31, "Mar"),
    APRIL(30, "Apr"),
    MAY(31, "May"),
    JUNE(30, "Jun"),
    JULY(31, "Jul"),
    AUGUST(31, "Aug"),
    SEPTEMBER(30, "Sep"),
    OCTOBER(31, "Oct"),
    NOVEMBER(30, "Nov"),
    DECEMBER(31, "Dec");

    private int days;
    private String shortName;

    Month(int days, String shortName) {
        this.days = days;
        this.shortName = shortName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}

public class EnumExample {

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        switch (today) {
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            default:
                System.err.println("Invalid day.");
                break;
        }

        Month month = Month.FEBRUARY;

        System.out.println("Month: " + month);
        System.out.println("Short Name: " + month.getShortName());
        System.out.println("Days: " + month.getDays());

       if (month == Month.FEBRUARY) {
           month.setDays(29); // Leap year adjustment
       }
         System.out.println("Updated Days in " + month + ": " + month.getDays());
    }
}
