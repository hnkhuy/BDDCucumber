package Utilities;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class GeneralUtilities {
    public static void waitSomeSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
