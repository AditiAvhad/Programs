public class duplicatearr {
    public  static void main(String[] args){
        int arr[]={7,10,4,6,9,8,10,9,8};
        int n=arr.length;
        for(int i=0;i<n;i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                System.out.print(arr[i]+" ");
        }
    }
}
