package unidad2.utils;

import java.nio.charset.StandardCharsets;

public class encoding {
    public static String corregirEncoding(String textoIncorrecto) {
        byte[] bytes = textoIncorrecto.getBytes(StandardCharsets.ISO_8859_1);
        String textoCorregido = new String(bytes, StandardCharsets.UTF_8);
        return textoCorregido;
    }
}