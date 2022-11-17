package Hafta_3;

import java.util.Scanner;

public class RecursiveFibonacci {

    /*
        Fibonacci = 1 1 2 3 5 8 13 21 34...

        recursive fibonacci => f(1) = 1
                               f(2) = 1
                               f(3) = f(2) + f(1) = 2
                               f(4) = f(3) + f(2) = 3
                               f(5) = f(4) + f(3) = 5
                               f(n) = f(n-1) + f(n-2)
     */

    static int fibonacci(int numb){

        if(numb == 1 ||numb == 2){
            return 1;
        }

        return fibonacci(numb - 1) + fibonacci(numb - 2);
    }

    public static void main(String[] args) {

        int numb;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayı girin: ");
        numb = inp.nextInt();

        System.out.println( "f(" + numb + "): " + fibonacci(numb));
    }
}
