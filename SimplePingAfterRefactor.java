package tugas4;

import java.util.List;

class PingResult {
    /* nama host yang diping */
    
  
    private String host;
    private String ipAddress;
    private boolean reachable;
    /**
     * Konstruktor untuk membuat objek PingResult baru.
     * 
     * @param host nama host yang di-ping (contoh: www.google.com)
     * @param ipAddress alamat IP dari host
     * @param reachable status keterjangkauan host (true jika bisa dijangkau)
     */

    public PingResult(String host, String ipAddress, boolean reachable) {
        this.host = host;
        this.ipAddress = ipAddress;
        this.reachable = reachable;
    }
   
    // Tambahkan getter methods ini
    public String getHost() {
        return host;
    }
     /**
     * Mendapatkan nama host.
     * 
     * @return nama host dalam bentuk String
     */
    

    /** Alamat IP dari host */
    public String getIpAddress() {
        return ipAddress;
    }
    /**
     * Mendapatkan alamat IP dari host.
     * 
     * @return alamat IP dalam bentuk String
     */
    
     /** Status keterjangkauan host */
    public boolean isReachable() {
        return reachable;
    }
     /**
     * Memeriksa apakah host dapat dijangkau.
     * 
     * @return true jika host dapat dijangkau, false jika tidak
     */



     
    @Override
    public String toString() {
        return "Host: " + host + "\n" +
               "IP Address: " + ipAddress + "\n" +
               "Status: " + (reachable ? "Reachable" : "Unreachable") + "\n";
    }
      /**
     * Menghasilkan representasi string dari hasil ping.
     * Format output:
     * Host: [nama_host]
     * IP Address: [alamat_ip]
     * Status: [Reachable/Unreachable]
     * 
     * @return string yang berisi informasi lengkap tentang hasil ping
     */
}

    
public class SimplePingAfterRefactor {
    public static void main(String[] args) {
        // Menggunakan host yang lebih mungkin untuk dijangkau
        String[] hosts = {"www.google.com", "www.github.com", "localhost", "8.8.8.8"};
        
        List<PingResult> results = PingUtility.pingHosts(hosts);
        
        System.out.println("Reachable Hosts:");
        for (PingResult result : results) {
            System.out.println(result);
        }
        
    }
}
