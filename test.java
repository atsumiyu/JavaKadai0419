package kadai0419;

public class test {
    public static void main(String[] args) {
        int num = 5;
        num = calc(num);
        System.out.println(num);
    }
    public static int calc1(int num) {
        num = calc2(num);
        return num += 50;
    }
    public static int calc2(int num) {
        return num *= 10;
    }
    public static int calc3(int num) {
        num = calc2(num);
        return num -= 100;
    }
    public static int calc(int num) {
        num = calc1(num);
        num = calc2(num);
        num = calc3(num);
        return num;
    }
}