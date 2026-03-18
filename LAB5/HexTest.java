package LAB5;
class NotHexException extends Exception {
    public NotHexException(String msg) {
        super(msg);
    }
}

public class HexTest {

    static void checkHex(String str) throws NotHexException {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!((ch >= '0' && ch <= '9') ||
                  (ch >= 'A' && ch <= 'F') ||
                  (ch >= 'a' && ch <= 'f'))) {

                throw new NotHexException("Not a Hexadecimal Number");
            }
        }

        System.out.println(str + " is a valid Hexadecimal Number");
    }

    public static void main(String[] args) {

        String number = "1A3F";

        try {
            checkHex(number);
        } catch (NotHexException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Ending the program");
        }
    }
}