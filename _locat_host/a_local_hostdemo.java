package _locat_host;

import java.net.InetAddress;

public class a_local_hostdemo {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local hostname: " + localhost.getHostName());
            System.out.println("Local IP: " + localhost.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
