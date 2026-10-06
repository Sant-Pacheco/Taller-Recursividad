public class Ejercicio7 {
    public static int mcdMetoEuclides(int m, int n){
        if(n == 0){
            return m;
        }
        return mcdMetoEuclides(n, m % n);
    }
}
