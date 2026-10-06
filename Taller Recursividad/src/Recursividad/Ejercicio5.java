public class Ejercicio5 {
    public static int sumatoriaHastaN(int n){
        if(n <= 1){
            return n;
        }
        return n + sumatoriaHastaN(n - 1);
    }
}
