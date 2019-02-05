import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {8, 3, 5, 0, 4, 6, 1, 2, 7};

        sort(ints);
    }

    public static void sort(int[] ints) {
        sort(ints, 0, ints.length - 1);
        System.out.println("result:  " + Arrays.toString(ints));
    }

    public static void sort(int[] ints, int min_idx, int max_idx) {

        int pivot_idx;
        int middle_idx = (min_idx + max_idx + 1) / 2;
        int min = Math.min(Math.min(ints[min_idx], ints[middle_idx]), ints[max_idx]);
        int max = Math.max(Math.max(ints[min_idx], ints[middle_idx]), ints[max_idx]);
        if(!(ints[min_idx] == min) && !(ints[min_idx] == max)) {
            pivot_idx = min_idx;
        } else if(!(ints[middle_idx] == min) && !(ints[middle_idx] == max)) {
            pivot_idx = middle_idx;
        } else {
            pivot_idx = max_idx;
        }

        {
            int a = ints[max_idx];
            ints[max_idx] = ints[pivot_idx];
            ints[pivot_idx] = a;
            pivot_idx = max_idx;
        }

        for (int i = min_idx; i < max_idx; i++) {
            if (ints[i] > ints[pivot_idx]) {
                for (int j = max_idx - 1; j > i; j--) {
                    if (ints[j] < ints[pivot_idx]) {
                        int a = ints[i];
                        ints[i] = ints[j];
                        ints[j] = a;
                        break;
                    }
                }
            }
        }
        for (int i = min_idx; i < max_idx; i++) {
            if (ints[i] > ints[pivot_idx]) {
                int a = ints[i];
                ints[i] = ints[pivot_idx];
                ints[pivot_idx] = a;
                pivot_idx = i;
                break;
            }
        }

        System.out.println("pivot: " + ints[pivot_idx] + " " + Arrays.toString(ints));

        if (min_idx < pivot_idx - 1) {
            sort(ints, min_idx, pivot_idx - 1);
        }
        if (max_idx > pivot_idx + 1) {
            sort(ints, pivot_idx + 1, max_idx);
        }
    }
}
