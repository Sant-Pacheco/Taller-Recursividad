public class Main {
    public static void main(String[] args) {
        System.out.println("TALLER DE RECURSIVIDAD");

        // 1. Factorial
        System.out.println("1. Factorial de 5: " + Ejercicio1.calcularFactorial(5));

        // 2. Invertir Número
        System.out.println("2. Invertir 123: " + Ejercicio2.invertirNumero(123));

        // 3. Sumatoria Armónica
        System.out.println("3. Sumatoria armónica de 3: " + Ejercicio3.sumatoriaArmonica(3));

        // 4. Suma de Dígitos
        System.out.println("4. Suma dígitos de 456: " + Ejercicio4.sumarDigitos(456));

        // 5. Sumatoria hasta N
        System.out.println("5. Sumatoria hasta 4: " + Ejercicio5.sumatoriaHastaN(4));

        // 6. Potencia
        System.out.println("6. Potencia 2^3: " + Ejercicio6.calcularPotencia(2, 3));

        // 7. MCD por Euclides
        System.out.println("7. MCD de 48 y 18: " + Ejercicio7.mcdMetoEuclides(48, 18));

        // 8. Copiar Cadena
        System.out.println("8. Copiar cadena 'Hola': " + Ejercicio8.copiarCadena("Hola"));

        // 9. Cociente por restas sucesivas
        System.out.println("9. Cociente de 10 entre 3: " + Ejercicio9.cocienteRestas(10, 3));

        // 10. Multiplicación por sumas sucesivas
        System.out.println("10. Multiplicación 4 * 3: " + Ejercicio10.multiplicacionesSucesivas(4, 3));

        // 11. Suma de elementos de un Vector
        int[] vector = {2, 4, 6, 8};
        System.out.println("11. Suma del vector [2, 4, 6, 8]: " + Ejercicio11.sumaVector(vector));

        // 12. Suma de elementos de una Matriz
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };
        System.out.println("12. Suma de la matriz 2x2: " + Ejercicio12.sumarMatriz(matriz));

        // 13. Fibonacci hasta un límite
        System.out.println("13. Serie Fibonacci hasta el límite 10:");
        Ejercicio13.imprimir(10);

        // 14. Función de Ackermann
        System.out.println("14. Ackermann(2, 2): " + Ejercicio14.ackermann(2, 2));

        System.out.println(" ");
    }
}
