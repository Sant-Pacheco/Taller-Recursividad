public class Ejercicio1 {
    public static int calcularFactorial(int n){
        if(n <= 1){
            return 1;
        } 
        return n * calcularFactorial(n -1); 
    }
}
