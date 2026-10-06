public class Ejercicio4 {
    public static int sumarDigitos(int n){
        if(n < 10){
            return n;
        }
        return (n % 10) + sumarDigitos(n / 10);
    }
}
