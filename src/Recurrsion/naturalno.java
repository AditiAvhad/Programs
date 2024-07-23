package Recurrsion;

public class naturalno {
    void fun(int n){
        if(n>0)
            return;
        System.out.print(n+" ");
        fun(n-1);
    }

    public static void main(String[] args) {
        naturalno obj=new naturalno();
        obj.fun(100);
    }
}
