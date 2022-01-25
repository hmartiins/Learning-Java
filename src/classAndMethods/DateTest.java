package classAndMethods;

public class DateTest {

    public static void main(String[] args) {

        Date d1 = new Date();
        d1.year = 2021;

        var d2 = new Date(31, 12, 2020);

        String dateFormatted = d1.getFormattedDate();

        System.out.println(dateFormatted);
        System.out.println(d2.getFormattedDate());

    }
}