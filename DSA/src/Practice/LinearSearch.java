package Practice;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {12, 43, 56, 33, 6, 7, 22, 67};

        int index = linearSearch(numbers, 10);

        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found at index : " + index);
        }
    }

    public static int linearSearch(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
