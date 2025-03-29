
public class SwapNumber {

    public static void main(String a[]) {
        int number1 = 10, number2 = 20;
        System.out.println("Before swap: number1 = " + number1 + ", number2 = " + number2);
        number1 = number1 + number2; //30
        number2 = number1 - number2; //10
        number1 = number1 - number2; //20
        System.out.println("After swap: number1 = " + number1 + ", number2 = " + number2);
    }
}
