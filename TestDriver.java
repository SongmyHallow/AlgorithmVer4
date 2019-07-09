import java.util.Arrays;

public class TestDriver{
    public static void main(String[] args) {
        int[] arr = {12,2,3,4,5};
        int key = 3;
        BinarySearch sol = new BinarySearch();
        System.out.println(sol.rank(key, arr));
        int[] whitelist = In.readInts("tinyW.txt");
        System.out.println(Arrays.toString(whitelist));
    }
}