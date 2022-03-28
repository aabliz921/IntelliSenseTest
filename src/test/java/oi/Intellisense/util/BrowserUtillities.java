package oi.Intellisense.util;

public class BrowserUtillities {

    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
