package quick_review_of_arrays_in_java;

public class IsPrimeOrNot {

    public  static boolean isPrimae(int n){
        boolean isPrime = true;
        for(int i =2; i<=n-1 ;i++){
            if( n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimae(5));
    }
}
