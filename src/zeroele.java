public class zeroele {
    public static void main(String[] args) {
        int arr[] = {2, 88, 6, 0, 0, 5, 0, 0, 2, 4, 0, 0, 5, 6};
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (; count < n; count++) {
            arr[count] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
