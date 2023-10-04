public class Array_swap {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] other = { 60, 70, 80, 90, 100 };
        System.out.println(arr[0] + " " + other[0]);
        swap(arr, other);
        System.out.println(arr[0] + " " + other[0]);
    }

    public static void swap(int[] a, int [] b) {
        int [] temp = a;
        a = b;
        b = temp;
    }
}

// The changes that are made are for the swap function and not the main function
// The variables in the swap function are new and not the variables of the main fucntion even if they carry the same name