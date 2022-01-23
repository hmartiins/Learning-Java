package classAndMethods;

public class ValueVSReference {

    public static void main(String[] args) {
        double a = 2;
        double b = a; // attribution by value (primitive type)

        a++;
        b--;

        System.out.println(a + " " + b);

        Date d1 = new Date(23, 1, 2022); // attribution by reference (object)
        Date d2 = d1;                                    // both variables point to the same address in memory

        d1.day = 31;
        d2.month = 12;

        System.out.println(d1.getFormattedDate());
        System.out.println(d2.getFormattedDate());

        backDateToDefaultValue(d1); // changing the memory reference of the object passed by parameter
        System.out.println(d1.getFormattedDate());
        System.out.println(d2.getFormattedDate());
    }

    static void backDateToDefaultValue(Date d) {
        d.day = 1;
        d.month = 1;
        d.year = 1970;
    }


}
