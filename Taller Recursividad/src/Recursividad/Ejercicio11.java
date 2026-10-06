public class Ejercicio11 {
    public static int sumaVector (int[] vector){
        return vectorMetodo(vector, 0);
    }
    public static int vectorMetodo(int[] vector, int index){
        if(index == vector.length){
            return 0;
        }
        return vector[index] + vectorMetodo(vector, index + 1);
    }
}
