import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ints = {8,2,5,3,4,6,1};

        sort(ints);
    }

    public static void sort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {
            int min_idx = i;
            for (int j = i; j < ints.length; j++) {
                if (ints[min_idx] > ints[j]) {
                    min_idx = j;
                }
                if (!(min_idx == i)) {
                    int a = ints[i];
                    ints[i] = ints[min_idx];
                    ints[min_idx] = a;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
