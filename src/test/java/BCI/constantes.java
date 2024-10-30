package BCI;

public class constantes {
    private static String urlBCI = "https://www.bci.cl/personas";
    private static String rut = "17417954-9";
    private static String noDoc = "123456789";
    private static String noFono = "96605236";
    private static String email = "est.caceres@tsoftglobal.cl";
    public static String BCI(){
        System.out.println("Dirigiendo a sitio BCI");
        return urlBCI;
    }
    public static String ingresarRUT(){
        return rut;
    }
    public static String ingresarNoDocu(){
        return noDoc;
    }
    public static String ingresarNoFono(){
        return noFono;
    }
    public static String ingresarEmail(){
        return email;
    }
}
