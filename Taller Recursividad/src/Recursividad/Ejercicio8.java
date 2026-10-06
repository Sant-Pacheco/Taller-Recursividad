public class Ejercicio8 {
    public static String copiarCadena(String original){
        return copyMetodo(original, 0);
    }
    public static String copyMetodo(String original, int index){
        if(index == original.length()){
            return "";
        }
        return original.charAt(index) + copyMetodo(original, index + 1);
    }
}
