public class Program42 {
    public static void main(String[] args) {
        for (int n = 100; n <= 500; n++) {
            int temp = n, sum = 0;
            while (temp != 0) {
                int d = temp % 10;
                sum += d * d * d;
                temp /= 10;
            }
            if (sum == n) System.out.println(n);
        }
    }
}
