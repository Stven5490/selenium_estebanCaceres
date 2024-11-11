package unidad1.configuraciones.driver;

import java.util.Random;

public class rutRandom {
    private static int minRandom = 8000000;
    private static int plusRandom = 12000001;
    private static int suma = 0;
    private static int factor = 2;
    public static int generarRutRandon(){
        Random random = new Random();
        return minRandom + random.nextInt(plusRandom);
    }
    public static int calcularDV(int DV){
        while (DV > 0){
            int digito = DV % 10;
            suma += digito * factor;
            DV /= 10;
            factor = (factor == 7) ? 2 : factor + 1;
        }
        int modulo = suma % 11;
        int digitoVerificador = (modulo == 0) ? 0 : 11 - modulo;
        return (digitoVerificador == 10) ? -1 : digitoVerificador;
    }
    public static String rut(){
        int RUT = generarRutRandon();
        int DV = calcularDV(RUT);
        return RUT + "-" + DV;
    }
}
