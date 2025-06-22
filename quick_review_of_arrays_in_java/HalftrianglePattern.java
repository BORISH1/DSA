package quick_review_of_arrays_in_java;

public class HalftrianglePattern {
    public static void main(String[] args){
        for(int i = 0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
