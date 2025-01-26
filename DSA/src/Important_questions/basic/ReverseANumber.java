package Important_questions.basic;

public class ReverseANumber {

    public static void main(String[] args) {


        printReverse(120820);
        revereANumber(120820);

    }

    public static void printReverse(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;
        }
        System.out.println();
    }

    private static void revereANumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number = number / 10;
        }

        System.out.println("Reversed Number is : " + reversedNumber);
    }
}
