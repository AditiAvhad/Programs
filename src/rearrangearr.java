
public class rearrangearr {
    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n=arr.length;
            int[] newarr = new int[arr.length];
            for(int i=0;i<n;i++){
                newarr[i]=-1;

            }
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                int temp=arr[i];
                newarr[temp]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}


