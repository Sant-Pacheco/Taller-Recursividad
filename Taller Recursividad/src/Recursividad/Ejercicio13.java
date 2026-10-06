public class Ejercicio13 {
    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void imprimir(int limite){
        metodoImprimirFibonacci(limite, 0);
    }

    public static void  metodoImprimirFibonacci(int limite, int n){
        int val = fibonacci(n);
        if(val > limite){
            return;
        }
        System.out.println(val + " ");
        metodoImprimirFibonacci(limite, n + 1);
    }
}
