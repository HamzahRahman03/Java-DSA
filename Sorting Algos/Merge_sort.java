public class Merge_sort {   //space complexity O(n)
    public static void main(String[] args) {
        int[] arr = { 7, 5, 3, 2, 6 };
        int[] ans = Sort(arr, 0, arr.length - 1);

        for(int i =0; i<arr.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] Sort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;

        }

        int mid = (si + ei) / 2;
        int[] f = Sort(arr, si, mid);
        int[] s = Sort(arr, mid+1, ei);

        return Merge(f, s);
    }

    public static int[] Merge(int[] a1, int[] a2) {
        int[] ans = new int[a1.length + a2.length];
        int i = 0;
        int j = 0, k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                ans[k] = a1[i];
                i++;
                k++;
            }

            else {
                ans[k] = a2[j];
                j++;
                k++;
            }
        }

        while (i < a1.length) {
            ans[k] = a1[i];
            i++;
            k++;
        }

        while (j < a2.length) {
            ans[k] = a2[j];
            j++;
            k++;
        }

        return ans;
    }
}
