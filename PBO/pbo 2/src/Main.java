import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int num = input.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " adalah bilangan prima.");
        }
        else {
            System.out.println(num + " bukan bilangan prima.");
        }

        input.close();
    }
}
