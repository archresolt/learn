package day18;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// ����˼���8888�Ķ˿� ���пͻ��˳�������8888�Ķ˿ڵ�ʱ�� �ͻ�
		// ���ӵ��÷�����
		ServerSocket server = new ServerSocket(8888);
		// ����ͻ��˵�����
		Socket client = server.accept();
		System.out.println("�ҽ��յ��˿ͻ��˵Ľ���");
		// �ӿͻ��˵��������ж�ȡ����
		InputStream is = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = is.read(bs);

		System.out.println(new String(bs, 0, len));
		is.close();
		server.close();
	}

}
