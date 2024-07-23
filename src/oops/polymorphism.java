package oops;

//Method overloading
public class polymorphism {
    int Add(int a,int b){
        return a+b;
    }
    float Add(float a,int b, int c){
        System.out.println(a);
        return b+c;

    }

    public static void main(String[] args) {
        polymorphism obj = new  polymorphism();
        System.out.println(obj.Add(20,30));
        System.out.println(obj.Add(2.31f,22,55));
        System.out.println(obj.Add(1,2,3));

    }
}

