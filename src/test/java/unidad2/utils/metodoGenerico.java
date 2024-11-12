package unidad2.utils;

import java.util.Random;

public class metodoGenerico {
    public static char letraAleatoria(){
        Random random = new Random();
        return (char) ('A' + random.nextInt(26));
    }
    public static String correoAleatorio(){
        String nombreusuario = String.valueOf(letraAleatoria());
        String arroba = "@";
        String dominio = String.valueOf(letraAleatoria());
        String lugar = ".cl";
        return nombreusuario + arroba + dominio + lugar;
    }
}
