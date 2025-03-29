public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World!";
        int length = str.length();
        String reversed = "";
        for(int i=length-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string is: " + reversed);
    }
}
