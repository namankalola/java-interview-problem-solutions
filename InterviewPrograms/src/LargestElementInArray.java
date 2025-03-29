public class LargestElementInArray {
    public static void main(String[] args) {
        int a[] = {11, 2, 3, 4, 5};
        int number = a[0];
        for (int i : a) {
            if(i>number){
                number = i;
            }
        }
        System.out.println("Largest number in array is: " + number);
    }
}
