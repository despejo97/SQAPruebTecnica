package co.com.automation.utils;


public class TimerClass {
    private TimerClass(){

    }
    public static void generarTiempo(int tiempo){
        try {
            Thread.sleep(tiempo*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
