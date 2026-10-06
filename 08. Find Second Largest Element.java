8. Find Second Largest Element
Code
public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 60};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}
Output
Second Largest = 60
