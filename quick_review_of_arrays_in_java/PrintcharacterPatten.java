package quick_review_of_arrays_in_java;

public class PrintcharacterPatten {
    public static void main(String[] args) {
        char value = 'A';
        int n = 5;
        for(int i =1 ; i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
