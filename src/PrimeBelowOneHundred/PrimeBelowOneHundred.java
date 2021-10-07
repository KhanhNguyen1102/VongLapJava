package PrimeBelowOneHundred;

public class PrimeBelowOneHundred {
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

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
