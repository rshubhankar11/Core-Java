import java.util.Scanner;

/*
 * 
 * This will be the implemnetaion of Java interview quesiton
 * 
 * Q.Convert any Number for ex 1,2,3,4 etc to String Number ex One , Two , Three , Four ?
 * 
 */
class AnyIntegerNumberToStringNumber {


    public static void main(String[] args) {

        String[] numbers =
                {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number one to ten: ");
        int number = scanner.nextInt();

        System.out.println(numbers[number - 1]);



    }
}

/*
 * 
 * 
 * This will convert any number to word
 * 
 */


class NumberToWord {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens =
            {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        String numberInWords = convertNumberToWords(number);
        System.out.println("The number in words is: " + numberInWords);
    }

    public static String convertNumberToWords(long number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWords(-number);
        }

        if (number <= 19) {
            return ones[(int) number];
        }

        if (number <= 99) {
            return tens[(int) (number / 10)] + ((number % 10 != 0) ? " " : "")
                    + ones[(int) (number % 10)];
        }

        if (number <= 999) {
            return ones[(int) (number / 100)] + " hundred" + ((number % 100 != 0) ? " and " : "")
                    + convertNumberToWords(number % 100);
        }

        if (number <= 999999) {
            return convertNumberToWords(number / 1000) + " thousand"
                    + ((number % 1000 != 0) ? " " : "") + convertNumberToWords(number % 1000);
        }

        if (number <= 999999999) {
            return convertNumberToWords(number / 1000000) + " million"
                    + ((number % 1000000 != 0) ? " " : "") + convertNumberToWords(number % 1000000);
        }

        return "number too large";
    }
}

/*
 * O/P:
 * 
 * Enter a number: 100
 * 
 * The number in words is: one hundredzero
 */

