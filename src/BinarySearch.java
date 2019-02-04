public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,8};
        int value = 3;

        search(ints, value);
    }

    public static void search(int[] ints, int value) {

        if (ints[0] == value) {
            System.out.println("first index: " + 0);
        } else if (ints[ints.length - 1] == value) {
            System.out.println("last index: " + (ints.length - 1));
        } else {
            search(ints, value, 0, ints.length - 1);
        }
    }

    public static void search(int[] ints, int value, int min_idx, int max_idx) {


        int b = (min_idx + max_idx + 1) / 2;
        if (ints[b] == value) {
            System.out.println("index: " + b);
        } else if (min_idx == b) {
            System.out.println("index not found");
        } else if (ints[b] > value) {
            search(ints, value, min_idx, b - 1);
        } else if (ints[b] < value) {
            search(ints, value, b + 1, max_idx);
        }
    }
}
