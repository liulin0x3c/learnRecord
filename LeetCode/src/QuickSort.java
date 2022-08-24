import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l>=r) return;
        int pivot = halfQuickSort(arr, l, r);
        quickSort(arr, l, pivot - 1);
        quickSort(arr, pivot + 1, r);
    }

    private int halfQuickSort(int[] arr, int l, int r) {
        int randomIdx = new Random().nextInt(r - l + 1) + l;
        swap(arr, randomIdx, l);
        int pivot = arr[l];
        int idx = r;
        while(l < r) {
            if(arr[idx] <= pivot) {
                arr[l] = arr[idx];
                ++l;
                idx = l;
            }else {
                arr[r] = arr[idx];
                --r;
                idx = r;
            }
        }
        //l = r;
        arr[l] = pivot;
        return l;
    }

    private void swap(int[] arr, int idxA, int idxB) {
        int temp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = temp;
    }



    public static void main(String[] args) {
        for (int j = 0; j < 1000; j++) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(100);
            }
            System.out.println(Arrays.toString(arr));
            new QuickSort().quickSort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }
}
