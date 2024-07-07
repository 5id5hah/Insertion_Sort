import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 8, 2, 3, 10, 11, -122, -1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Insertion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+ 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else {
                    break;
                }

            }
        }


    }
}
