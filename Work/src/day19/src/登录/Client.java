package ��¼;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("Localhost",8080);
		OutputStream os = client.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(new Userinfo("����","123"));
		client.shutdownOutput();
		oos.close();
		os.close();
		client.close();
	}

}
