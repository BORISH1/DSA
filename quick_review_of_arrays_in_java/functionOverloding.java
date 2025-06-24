package quick_review_of_arrays_in_java;

public class functionOverloding {

    public static  int sum(int a , int b){
        return  a+b;
    }
    public static float sum( float a, float b){
        return a+b;
    }
    public static   int sum(int a , int b, int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(23,32));
        System.out.println(sum(12.3f,42.5f));
        System.out.println(sum(12,32,43));

    }
}
