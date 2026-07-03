9. Copy One Array to Another
Code
public class CopyArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Copied Array: ");

        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
Output
Copied Array: 10 20 30 40 50
