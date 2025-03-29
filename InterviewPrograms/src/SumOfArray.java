
public class SumOfArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5}, sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Sum of array is: " + sum);
    }
}
