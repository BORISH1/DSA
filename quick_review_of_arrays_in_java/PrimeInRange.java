package quick_review_of_arrays_in_java;

public class PrimeInRange {

    public static boolean primeRange(int n){
        for(int i = 2 ; i<=n;i++){
            if(n%i==0){
                return false;
            }
            break;
        }
        return true;
    }
public static void printNumber(int n){
    for(int i = 2; i<=n ;i++){
        if(primeRange(i)){
            System.out.print(i+" ");
        }
    }
}
    public static void main(String[] args) {
        printNumber(10);
    }
}
