package LAB4;
class PasswordChecker {
    public boolean isValid(String password) {
        if (password.length() < 5 || password.length() > 12)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                return false;

            if (!Character.isLetterOrDigit(ch))
                return false;

            if (Character.isLowerCase(ch))
                hasLower = true;

            if (Character.isDigit(ch))
                hasDigit = true;
        }

        if (!hasLower || !hasDigit)
            return false;

        int n = password.length();
        for (int len = 1; len <= n / 2; len++) {
            for (int i = 0; i + 2 * len <= n; i++) {
                String s1 = password.substring(i, i + len);
                String s2 = password.substring(i + len, i + 2 * len);
                if (s1.equals(s2))
                    return false;
            }
        }

        return true;
    }
}

public class password {
    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker();

        String[] tests = {
            "a49898an1",
            "abADFRGT1se",
            "12123",
            "adfa5j+++df",
            "Aasdfasd12",
            "abc12"
        };

        for (String p : tests) {
            System.out.println(p + " : " + pc.isValid(p));
        }
    }
}
