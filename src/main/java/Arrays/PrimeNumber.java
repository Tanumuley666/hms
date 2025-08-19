package Arrays;


public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100");
        for (int num = 2; num <= 100; num++) {
            if(isPrime(num)){
                System.out.println(num + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return  false;
        for (int i= 2; i*i <= n; i++)
        {
            if (n % i == 0) return
            false;
        }
        return true;
    }
}
