public class Find_element { //find index
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8, 5, 2, 5, 11 };
        int item = 5;
        System.out.println(get_element(arr, item, 0));
    }

    public static int get_element(int[] arr, int item, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == item) {
            return index;
        }

        return get_element(arr, item, index + 1);
    }
}
