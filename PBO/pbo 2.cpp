#include <iostream>

int main() {
    int num;
    bool isPrime = true;

    std::cout << "Masukkan angka: ";
    std::cin >> num;

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
        std::cout << num << " adalah bilangan prima." << std::endl;
    }
    else {
        std::cout << num << " bukan bilangan prima." << std::endl;
    }

    return 0;
}

