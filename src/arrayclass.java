import java.util.*;
public class arrayclass {
    public static void main(String[]args) {
        int arr[]={1,2,3,4,6,7};
        //int diff=1;
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println("missing element " +(arr[i] + 1));

            }
        }
        }
    }


