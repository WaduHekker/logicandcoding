import java.util.Arrays;
import java.util.Scanner;
public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        Scanner boi = new Scanner(System.in);
        for (int i = 2; i < 1000; i++) {//This is what we wrote btw
            for(int j = i * 2;j < 1000; j+=i) {
                sieve[j] = false;
            }
        }
        int[] jesus = collectPrimes();
        System.out.println("Gimme an integer, Bro!");
        int input = boi.nextInt();
        printPrimeFactors(input, jesus);
    }
    public static int[] collectPrimes() {        
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (sieve [i] == true) {
                count++;
            }
        }
        int [] prime = new int [count];
        int h = 0;
        for (int j = 0; j < 1000; j++) {
            if (sieve [j] == true) {
                prime [h] = j;
                h++;
            }
        }
        return prime;
    }
    public static void printPrimeFactors(int senpai, int[] loveMe) {
        System.out.println("The prime factorization of " + senpai + "is:");
        for (int i = 0; i < senpai; i ++) {
            int waifu = 0;
            while (senpai % loveMe [i] == 0) {
                senpai = senpai / loveMe [i];
                waifu++;
            }
            if(waifu > 0) {
                System.out.println(loveMe [i] + ": " + waifu);
            }
        }
    }
}

