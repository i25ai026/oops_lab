package LAB4;
class ThreeDMatrix {
    private int X, Y, Z;
    private int[] arr;

    ThreeDMatrix(int X, int Y, int Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        arr = new int[X * Y * Z];
    }

    public void set(int value, int x, int y, int z) {
        int index = x * (Y * Z) + y * Z + z;
        arr[index] = value;
    }

    public int get(int x, int y, int z) {
        int index = x * (Y * Z) + y * Z + z;
        return arr[index];
    }
}

public class matrix {
    public static void main(String[] args) {
        ThreeDMatrix m = new ThreeDMatrix(3, 9, 8);
        m.set(10, 0, 0, 4);
        m.set(25, 1, 2, 2);
        m.set(50, 2, 1, 7);

        System.out.println(m.get(0, 0, 4));
        System.out.println(m.get(1, 2, 2));
        System.out.println(m.get(2, 1, 7));
    }
}

