#include <iostream>
using namespace std;

int main() {
    int n;
    std::cout << "Masukkan panjang array: ";
    std::cin >> n;

    int arr[n];
    int sum = 0;

    std::cout << "Masukkan elemen-elemen array: ";
    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
    }

    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }

    std::cout << "Hasil penjumlahan elemen-elemen array: " << sum << std::endl;

    return 0;
}

