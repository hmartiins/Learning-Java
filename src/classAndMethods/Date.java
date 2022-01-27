package classAndMethods;
public class Date {

    int day;
    int month;
    int year;

    Date() {
        this(1, 1, 1970);
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String getFormattedDate() {
        final String format = "%d/%d/%d";
        return String.format(format, this.day, month, year);
    }

    void printFormattedDate() {
        System.out.println(this.getFormattedDate());
    }

}
