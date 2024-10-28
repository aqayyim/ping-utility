package tugas4;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * Class untuk menyimpan hasil dari operasi ping ke suatu host.
 * Class ini menyimpan informasi seperti nama host, alamat IP, dan status keterjangkauan.
 * 
 */
class PingUtility {
    private static final int DEFAULT_TIMEOUT = 5000; // 5 seconds

    public static List<PingResult> pingHosts(String[] hosts) {
        List<PingResult> results = new ArrayList<>();

        for (String host : hosts) {
            PingResult result = pingHost(host);
            if (result.getIpAddress().equals("Unknown") || !result.isReachable()) {
                System.out.println("Skipping unreachable host: " + host);
                continue;
            }
            results.add(result);
        }

        return results;
    }

    private static PingResult pingHost(String host) {
        try {
            InetAddress address = InetAddress.getByName(host);
            boolean reachable = address.isReachable(DEFAULT_TIMEOUT);
            return new PingResult(host, address.getHostAddress(), reachable);
        } catch (IOException e) {
            System.out.println("Error pinging " + host + ": " + e.getMessage());
            return new PingResult(host, "Unknown", false);
        }
    }
}