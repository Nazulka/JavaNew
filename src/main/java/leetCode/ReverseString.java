package leetCode;

public class ReverseString {
    public void reverseString(char[] input) {
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            char tmp = input[i];
            input[i] = input[j];
            input[j] = tmp;
            i++;
            j--;
        }
//        return null;
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();

        char[] test = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before: " + new String(test));

        rs.reverseString(test);

        System.out.println("After:  " + new String(test));
    }
}
