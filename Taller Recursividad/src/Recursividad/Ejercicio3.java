public class Ejercicio3 {
    public static double sumatoriaArmonica (int n){
        if(n <= 1){
            return 1.0;
        }
        return (1.0 / n)+ sumatoriaArmonica(n - 1);
    }
}
