import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.print("Masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Hasil penjumlahan elemen-elemen array: " + sum);

        input.close();
    }
}
