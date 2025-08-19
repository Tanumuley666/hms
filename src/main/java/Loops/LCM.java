package Loops;

public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18, lcm;
        for (lcm = Math.max(a,b); ; lcm++) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
        }
        System.out.println(lcm);
    }
}
