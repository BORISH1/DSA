package quick_review_of_arrays_in_java;

public class factorial {
    public static int fact(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f = f * i;

        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fact(7));
    }
}
