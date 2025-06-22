package quick_review_of_arrays_in_java;

public class factorial {
    public static int fact(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f = f * i;

        }
        return f;
    }

    public static int facto(int n , int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr=fact(n-r);
        return fact_n/(fact_r*fact_nmr);
    }

    public static void main(String[] args) {
        System.out.println(facto(5,2));
    }
}
