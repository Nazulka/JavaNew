package DMJava.Session1;


import java.util.Arrays;

//Best tie to buy and sell stock
public class Problem1 {
    public static void main(String[] args) {


    }
}

class Session1 {
    public boolean isAnagram(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        return Arrays.equals(aa, bb);
    }
}
