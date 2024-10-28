package tugas4;

import java.io.IOException;
import java.net.InetAddress;

public class SimplePingBeforeRefactor {
    public static void main(String[] args) {
        String[] hosts = {"google.com", "github.com", "localhost"};
        int timeout = 5000; // 5 seconds

        for (String host : hosts) {
            try {
                InetAddress address = InetAddress.getByName(host);
                boolean reachable = address.isReachable(timeout);
                
                System.out.println("Host: " + host);
                System.out.println("IP Address: " + address.getHostAddress());
                System.out.println("Status: " + (reachable ? "Reachable" : "Unreachable"));
                System.out.println();
            } catch (IOException e) {
                System.out.println("Error pinging " + host + ": " + e.getMessage());
            }
        }
    }
}