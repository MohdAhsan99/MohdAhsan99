package livecode;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class ipaddress {
	
	public static void main(String[] args) throws UnknownHostException{
		
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("My Ip Address:"+ip);
	}

}
