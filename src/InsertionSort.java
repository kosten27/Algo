import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = {8, 2, 5, 3, 4, 6, 1};

        sort(ints);
    }

    public static void sort(int[] ints) {
        int step = 0;
        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i] < ints[j]) {
                    step++;
                    int a = ints[j];
                    ints[j] = ints[i];
                    ints[i] = a;
                    System.out.printf("step %2d: " + Arrays.toString(ints), step);
                    System.out.println();
                 }
            }
        }
        System.out.println("result:  " + Arrays.toString(ints));
    }
}
