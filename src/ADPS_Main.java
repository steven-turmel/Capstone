/*
* @author Steven Turmel
* @version 0.1 2017 Dec 12
*/


public class ADPS_Main extends Thread {

    public static void main(String args[]) {
        ADPS_Main main = new ADPS_Main();
        main.start();
        System.out.println("Supported commands are 'newuser', 'login' or 'exit'.");
    }

    public void start() {
        InputHandler ih = new InputHandler();
        ih.start();
    }
}