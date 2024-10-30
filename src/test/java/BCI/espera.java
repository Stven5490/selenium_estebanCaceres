package BCI;

public class espera {
    private static int fiveSegundos = 5000;
    private static int tenSegundos = 10000;
    private static int fifhtSegundos = 15000;
    public static void espera5Seg() throws InterruptedException {
        Thread.sleep(fiveSegundos);
    }
    public static void esperar10Seg() throws InterruptedException{
        Thread.sleep(tenSegundos);
    }
    public static void esperar15Seg() throws InterruptedException {
        Thread.sleep(fifhtSegundos);
    }
}
