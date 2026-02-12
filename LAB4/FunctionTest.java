package LAB4;
interface Function {
    int evaluate(int x);
}
class Half implements Function {
    public int evaluate(int x) {
        return x / 2;
    }
}
public class FunctionTest {
    static int[] process(int[] arr) {
        Half h = new Half();
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            res[i] = h.evaluate(arr[i]);

        return res;
    }
    public static void main(String[] args) {
        int[] a = {10, 25, 40, 7};
        int[] b = process(a);

        for (int x : b)
            System.out.print(x + " ");
    }
}

