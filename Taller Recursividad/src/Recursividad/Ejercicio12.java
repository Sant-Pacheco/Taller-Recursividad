public class Ejercicio12 {
    public static int sumarMatriz(int[][] matriz){
        return matrizMetodo(matriz, 0, 0);
    }
    public static int matrizMetodo(int[][] matriz, int fila, int columna){
        if(fila == matriz.length){
        return 0;
        }
        int siguienteFila = (columna + 1 == matriz[fila].length) ? fila + 1: fila;
        int siguienteColumna = (columna + 1 == matriz[fila].length) ? 0: columna + 1;

        return matriz[fila][columna] + matrizMetodo(matriz, siguienteFila, siguienteColumna);
    }
}
