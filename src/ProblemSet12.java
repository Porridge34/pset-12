import java.util.ArrayList;

public class ProblemSet12 {
    public long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public long fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long triangle(int rows) {
        if (rows < 0) {
            return -1;
        }
        if (rows == 0) {
            return 0;
        }
        return triangle(rows - 1) + rows;
    }

    public long sumDigits(int n) {
        if (n < 0) {
            return -1;
        }
        if (n / 10 == 0) {
            return n;
        }
        return sumDigits(n / 10) + n % 10;
    }

    public long powerN(int base, int exponent) {
        if (base < 1 || exponent < 1) {
            return -1;
        }
        if (exponent == 1) {
            return base;
        }
        return powerN(base, exponent - 1) * base;
    }

    public String changeXY(String text) {
        if (text == null) {
            return null;
        }
        if (text.length() == 0) {
            return text;
        }
        else if (text.charAt(0) == 'x') {
            return "y" + changeXY(text.substring(1));
        }
        return text.substring(0, 1) + changeXY(text.substring(1));
    }

    public int array11(int[] data, int index) {
        if (data == null || index < 0 || index >= data.length) {
            return -1;
        }
        if (index == data.length - 1) {
            if (data[index] == 11) {
                return 1;
            }
            return 0;
        }
        if (data[index] == 11) {
            return 1 + array11(data, index + 1);
        }
        return array11(data, index + 1);
    }

    public int strCount(String text, String sub) {
        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }
        if (text.length() < sub.length()) {
            return 0;
        }
        if (text.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(text.substring(sub.length()), sub);
        }
        return strCount(text.substring(1), sub);
    }

    public boolean strCopies(String text, String sub, int n) {
        if (text == null || sub == null || sub.length() == 0 || n < 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        if (text.length() < sub.length()) {
            return false;
        }
        if (text.substring(0, sub.length()).equals(sub)) {
            return strCopies(text.substring(1), sub, n - 1);
        }
        return strCopies(text.substring(1), sub, n);
    }

    public int strDist(String text, String sub) {
        if (text == null || sub == null || sub.length() == 0){
            return -1;
        }
        if (text.length() < sub.length()) {
            return 0;
        }
        if (text.substring(0, sub.length()).equals(sub)) {
            return text.lastIndexOf(sub) + sub.length();
        }
        return strDist(text.substring(1), sub);
    }
}
