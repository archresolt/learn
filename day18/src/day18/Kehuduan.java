package day18;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Kehuduan {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// �����ͻ��ˣ��趨Ҫ���ӵķ�����ip��ַ�Ͷ˿ں�
		Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
		// ���������
		OutputStream os = socket.getOutputStream();
		// ������������
		byte[] bs = "��ã���ô?".getBytes();
		// ����������bsд������
		os.write(bs);
		// ���߷�������д����
		socket.shutdownOutput();
		// �ر���
		os.close();
	}

}
