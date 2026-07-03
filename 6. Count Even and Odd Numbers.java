6. Count Even and Odd Numbers
Code
public class EvenOddCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int even = 0;
        int odd = 0;

        for (int num : arr) {

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);
    }
}
Output
Even Numbers = 3
Odd Numbers = 3
