package TwentyFirstPrime;

import java.util.Scanner;


public class TwentyFirstPrime {

    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố muốn in :");
        numbers = scanner.nextInt();
        int count=0;
        for(int N=2;count<numbers;N++){
            if(isPrimeNumber(N)){
                System.out.println(N);
                count++;
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}