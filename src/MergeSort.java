import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] ints = {8, 3, 5, 0, 4, 6, 1, 2, 7};

        sort(ints);
    }

    public static void sort(int[] ints) {
        sort(ints, 0, ints.length - 1);
        System.out.println("result: " + Arrays.toString(ints));
    }

    public static void sort(int[] ints, int min_idx, int max_idx) {

        int middle_idx = (min_idx + max_idx + 2) / 2;
        if (max_idx - min_idx > 1) {
            if (middle_idx - 1 - min_idx > 0) {
                sort(ints, min_idx, middle_idx - 1);
            }
            if (max_idx - middle_idx > 0) {
                sort(ints, middle_idx, max_idx);
            }
        }

        int[] temp_ints = new int[max_idx - min_idx + 1];
        int a = min_idx;
        int b = middle_idx;
        for (int i = 0; i < temp_ints.length; i++) {
            if ((a < middle_idx) && (b > max_idx || (ints[a] < ints[b]))) {
                temp_ints[i] = ints[a];
                a++;
            } else {
                temp_ints[i] = ints[b];
                b++;
            }
        }
        for (int i = 0; i < temp_ints.length; i++) {
            ints[min_idx + i] = temp_ints[i];
        }
        System.out.println(Arrays.toString(ints));

    }
}
