package SumPrimeNonPrime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (true) {
            int countprime = 0;
            String comand = scan.nextLine();
            if (comand.equals("stop")) {
                break;
            }
            int numb = Integer.parseInt(comand);
            if (numb < 0) {
                System.out.printf("Number is negative.%n");
                continue;
            } else {
                for (int i = 1; i <= numb; i++) {

                    if (numb % i==0) {
                        countprime++;
                    }
                }


                if (countprime == 2) {
                    primeSum += numb;
                } else if(countprime>2) {
                    nonPrimeSum += numb;
                }
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);


    }
}
