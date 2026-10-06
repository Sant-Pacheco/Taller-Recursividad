public class Ejercicio9 {
    public static int cocienteRestas(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        if(a < b){
            return 0;
        }
        return 1 + cocienteRestas(a - b, b);
    }
}
