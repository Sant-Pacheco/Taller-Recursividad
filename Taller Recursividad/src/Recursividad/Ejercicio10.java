public class Ejercicio10 {
    public static int multiplicacionesSucesivas(int a, int b){
        if(b == 0){
            return 0;
        }
        if(b < 0){
            return -multiplicacionesSucesivas(a, -b);
        }
        return a + multiplicacionesSucesivas(a, b - 1);
    }
}
