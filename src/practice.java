public class practice {
      public static void main(String[] args){

          int arrlen[]= {1,2,3,4,5};
          int n=arrlen.length;
          int newArr[]=new int[n];
         // System.out.println("Original Array");
          for(int i=0;i<n;i++){
              newArr[i]=arrlen[n-i-1];
          }
          for(int i=0;i<n;i++){
          System.out.println(newArr[i]+" ");
          }
      }
}
