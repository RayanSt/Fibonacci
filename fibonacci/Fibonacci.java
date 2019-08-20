package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño de la serie");
        int n = sc.nextInt();
        System.out.print("Recursiva: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }

        System.out.println("");
        System.out.print("Iterativa: ");
        fibonacciIter(n);

    }

    //funcion iterativa
    public static void fibonacciIter(int n) {
        int tem = 0;
        int imp = 0;
        for (int i = 0; i < n+1; i++) {
            if (i >= 2) {
                imp = tem + imp;
                tem = imp - tem;
                System.out.print(imp + " ");
            } else if (i == 1) {  
                tem = 1;
            } else if (i == 0) {  
                System.out.print("0 ");
                tem = 0;
            }

        }
    }

    //funcion recursiva
    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  
        } else if (n == 1) { 
            return 1;
        } else if (n == 0) { 
            return 0;
        } else { 
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
}
