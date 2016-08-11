package core.CommonActions;

import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * This class aids to generate some random data to test
 *
 * @author otorandell on 12/02/2016
 */
@SuppressWarnings({"unused", "UnusedAssignment"})
public class DataGenerator {

    /**
     * Method that generates a random alphanumeric sequence.
     *
     * @param length         Integer - Length of the returned String
     * @param lettersNumbers Boolean - Tells if the returned String can include or not numbers into it
     * @return random alphanumeric value {@code String}
     * @see Thread#sleep(long)
     * @see Random
     * @see GregorianCalendar#getTimeInMillis()
     */
    public static String getRandomAlphanumericSequence(int length, boolean lettersNumbers) {
        //how to call this method:
        // DataGenerator.getRandomAlphanumericSequence(3, true);
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sequence = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < length) {
            char c = (char) r.nextInt(255);
            if (lettersNumbers) {
                if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                    sequence += c;
                    i++;
                }
            } else {
                if (c >= 'A' && c <= 'Z') {
                    sequence += c;
                    i++;
                }
            }
        }
        return sequence;
    }

    /**
     * This method generates a random integer between the chosen range
     *
     * @param min Integer - minimum value the result can adquire
     * @param max Integer - maximum value the result can adquire
     * @return {@code int}
     * @see Math#floor(double)
     * @see Math#random()
     */
    public static int random(int min, int max) {
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (int) (Math.floor((int) (Math.random() * (max - min) + 1))) + min;

    }

    /**
     * This method generates and returns a String referent to the date of today
     *
     * @param driver TestDriver - This class manages all the information referent to the current test.
     * @param format String - Defines the date format of the result
     * @return {@code String} that represents the date of today
     * @see DateFormat#format(Date)
     * @see SimpleDateFormat
     */
    public static String getToday(TestDriver driver, String format) {
        String today = "";
        try {
            DateFormat myformat = new SimpleDateFormat(format);
            today = myformat.format(driver.getTestdate().getTime());
        } catch (Exception e) {
            String ecode = "--ERROR:getToday(): Unable to convert " + format + " to DateFormat please check that is inserted correctly.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
        return today;
    }

    /**
     * This method generates and returns a String referent to a relative date value
     *
     * @param driver       TestDriver - This class manages all the information referent to the current test.
     * @param originaldate String - The returned date value is relative to this parameter
     * @param format       String - Defines the date format of the result
     * @param incrmonth    Integer - Defines the increment of month value
     * @param incrday      Integer Defines the increment of month day value
     * @param incryear     Integer - Value that defines the increment of the year value
     * @return {@code String} representing a date value
     * @see DateFormat#format(Date)
     * @see SimpleDateFormat
     * @see Calendar
     */
    public static String getRelativeDate(TestDriver driver, String originaldate, String format, int incrmonth, int incrday, int incryear) {
        //HOW TO CALL THIS METHOD
        /*DataGenerator.getRelativeDate(driver, "dataname", //dataname
                "01/01/1990", "dd/MM/yyyy",0, 0, 0);*/ // original date // dateformat // increments (month, day, year)
        String today = "";
        try {
            Date fecha;
            Calendar cal = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fecha = dateFormat.parse(originaldate);
            cal.setTime(fecha);
            cal.add(Calendar.DAY_OF_MONTH, incrday);
            cal.add(Calendar.YEAR, incryear);
            cal.add(Calendar.MONTH, incrmonth);
            today = dateFormat.format(cal.getTime());

        } catch (Exception e) {
            String ecode = "--ERROR:getRelativeDate(): Unable to convert " + format + " to DateFormat please check that is inserted correctly.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
        return today;
    }

    /**
     * This method generates and returns a String referent to the date of today
     *
     * @param format    String - Defines the date format of the result
     * @param incrmonth Integer - Defines the increment of month value
     * @param incrday   Integer - Defines the increment of month day value
     * @param incryear  Integer - Value that defines the increment of the year value
     * @return {@code String} representing a date value
     * @see DateFormat#format(Date)
     * @see SimpleDateFormat
     * @see Calendar
     */
    public static String getRelativeDateToday(String format, int incrmonth, int incrday, int incryear) {
        String today = "";
        try {
            Calendar fecha = Calendar.getInstance();
            DateFormat myformat = new SimpleDateFormat(format);
            myformat.format(fecha.getTime());
            fecha.add(Calendar.DAY_OF_MONTH, incrday);
            fecha.add(Calendar.YEAR, incryear);
            fecha.add(Calendar.MONTH, incrmonth);
            today = myformat.format(fecha.getTime());
        } catch (Exception e) {
            String ecode = "--ERROR:getRelativeDateToday(): Unable to convert " + format + " to DateFormat please check that is inserted correctly.";
            today = "01/01/2015";
            e.printStackTrace();
            //ErrorManager.process(driver, ecode);
        }
        return today;
    }

    /**
     * This method generates and returns a String referent to the date of today
     *
     * @return {@code String} that represents the date of today
     * @see DateFormat#format(Date)
     * @see SimpleDateFormat
     */
    public static String getToday() {
        String today = "";
        try {
            Date testdate = new Date();
            DateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
            today = myformat.format(testdate.getTime());
        } catch (Exception e) {
            String ecode = "--ERROR:getToday(): An unexpected error has ocurred, please check.";
            e.printStackTrace();
            //ErrorManager.process(driver, ecode);
        }
        return today;
    }

    /**
     * This method change a string in uppercase, lowercase, capitalcase, firstletter string
     *
     * @param toConvert String - String to change
     * @param condition String - values to change: uppercase, lowercase, capitalcase, firstletter
     * @return {@code String} String change value
     */
    public static String caseConversion(String toConvert, String condition) {
        /*
        DataGenerator.caseConversion("String_to_convert","uppercase/lowercase/capitalcase/firstletter");
         */

        String converted = "";
        switch (condition) {
            case "uppercase":
                for (int i = 0; i < toConvert.length(); i++) {
                    if (toConvert.charAt(i) >= 97 && toConvert.charAt(i) <= 122) {
                        int value = ((int) toConvert.charAt(i)) - 32;
                        char character = (char) value;
                        converted = converted + character;

                    } else {
                        converted = converted + toConvert.charAt(i);
                    }
                }
                break;
            case "lowercase":
                for (int i = 0; i < toConvert.length(); i++) {
                    if ((int) toConvert.charAt(i) >= 65 && (int) toConvert.charAt(i) <= 90) {
                        int value = ((int) toConvert.charAt(i)) + 32;
                        char character = (char) value;
                        converted = converted + character;

                    } else {
                        converted = converted + toConvert.charAt(i);
                    }
                }
                break;
            case "capitalcase":
                for (int i = 0; i < toConvert.length(); i++) {
                    if ((i == 0) && ((int) toConvert.charAt(i) >= 97 && (int) toConvert.charAt(i) <= 122)) {
                        int value = ((int) toConvert.charAt(i)) - 32;
                        char character = (char) value;
                        converted = converted + character;
                    } else if ((i != 0) && ((int) toConvert.charAt(i) >= 97 && (int) toConvert.charAt(i) <= 122)) {
                        converted = converted + toConvert.charAt(i);
                    } else if ((i != 0) && ((int) toConvert.charAt(i) >= 65 && (int) toConvert.charAt(i) <= 90)) {
                        int value = ((int) toConvert.charAt(i)) + 32;
                        char character = (char) value;
                        converted = converted + character;
                    } else {
                        converted = converted + toConvert.charAt(i);
                    }
                }
                break;
            case "firstletter":
                for (int i = 0; i < toConvert.length(); i++) {

                    if ((i == 0) && ((int) toConvert.charAt(i) >= 97 && (int) toConvert.charAt(i) <= 122)) {//SI es el primero y minuscula
                        int value = ((int) toConvert.charAt(i)) - 32;
                        char character = (char) value;
                        converted = converted + character;
                    } else if ((i != 0) && ((int) toConvert.charAt(i) >= 97 && (int) toConvert.charAt(i) <= 122)) {//Si no es el primero y es minuscula
                        if (toConvert.charAt(i - 1) == ' ') {
                            int value = ((int) toConvert.charAt(i)) - 32;
                            char character = (char) value;
                            converted = converted + character;
                        } else {
                            converted = converted + toConvert.charAt(i);
                        }
                    } else if ((i != 0) && ((int) toConvert.charAt(i) >= 65 && (int) toConvert.charAt(i) <= 90)) {//Si no es el primero y es mayuscula
                        if (toConvert.charAt(i - 1) != ' ') {
                            int value = ((int) toConvert.charAt(i)) + 32;
                            char character = (char) value;
                            converted = converted + character;

                        } else {
                            converted = converted + toConvert.charAt(i);
                        }
                    } else {
                        converted = converted + toConvert.charAt(i);
                    }
                }
                break;
            default:
                break;
        }
        return converted;
    }
}
