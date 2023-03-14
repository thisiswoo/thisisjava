package ch19.network_io;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소 : " + local);

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : iaArr) {
                System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // 출력 ----------------------------------------
        // 내 컴퓨터 IP 주소 : thisiswoo-mbp.local/127.0.0.1
        // www.naver.com IP 주소 : 23.201.36.184
    }
}
