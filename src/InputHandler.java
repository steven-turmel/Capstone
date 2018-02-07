import java.util.BitSet;
import java.util.Scanner;
import java.io.*;

public class InputHandler extends Thread {
    private Scanner sc = new Scanner(System.in);
    private AuthenticationHandler ah = new AuthenticationHandler();
    private StorageHandler sh = new StorageHandler();
    private boolean cont = true;

    public void start() {
        while (cont) {
            System.out.print("ADPS:>");
            String tempStr = sc.nextLine();
            decode(tempStr);
        }
    }
    private void decode(String input) {
        String uname;
        BitSet pass;
        switch (input.toLowerCase()) {
            case "login":

                ah.login(uname, pass);
                break;
            case "newuser":
                ah.addUser();
                break;
            case "help":
                printHelp();
                break;
            case "exit":
                sh.writeToDisk();
                break;
        }
    }

    private void printHelp() {
        System.out.println("Supported commands include: 'newuser', 'login' and 'exit'.");
    }


}
