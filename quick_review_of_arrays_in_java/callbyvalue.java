package quick_review_of_arrays_in_java;

public class callbyvalue {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 32;
        swap(num1,num2);
    }
}
