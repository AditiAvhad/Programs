public class leaderarr {
    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        int[] ans = new int[arr1.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < ans.length; j++) {
                if (arr1[i] > arr1[j]) {
                    flag = true;
                } else {
                    flag=false;
                    break;
                }
            }
                   if (flag) {
                    ans[count] = arr1[i];
                    count++;

                }
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }


