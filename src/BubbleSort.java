import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {8,2,5,3,4,6,1};

        sort(ints);
    }

    public static void sort(int[] ints) {
        int step = 0;
        for (int i = 0; i < ints.length; i++) {
            step++;
            boolean changed = false;
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    changed = true;
                    int a = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = a;
                }
            }
            if (!changed) {
                break;
            }
            System.out.printf("step %2d: " + Arrays.toString(ints), step);
            System.out.println();
        }
        System.out.println("result:  " + Arrays.toString(ints));
    }

}
