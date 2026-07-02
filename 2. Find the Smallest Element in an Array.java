2. Find the Smallest Element in an Array
Code
public class SmallestElement {

    public static void main(String[] args) {

        int[] arr = {12, 45, 8, 67, 23};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Element = " + smallest);
    }
}
Output
Smallest Element = 8
