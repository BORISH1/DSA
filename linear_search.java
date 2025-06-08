import java.util.*;

public class linear_search {
    public static int linear(int n, int[] ar, int key) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the key element (element to search):");
        int key = sc.nextInt();
        int result = linear(n, ar, key);
        if (result == -1) {
            System.out.println("The given element is not found in the array.");
        } else {
            System.out.println("The position of the key element is: " + result);
        }
        sc.close();
    }
}
