public class Ejercicio2 {
    public static int invertirNumero(int n){
        return invertirHelper(n, 0);
    }

    public static int invertirHelper(int n, int invertido){
        if(n == 0){
            return invertido;
        }
        return invertirHelper(n / 10, invertido * 10 + (n % 10));
    }
}
