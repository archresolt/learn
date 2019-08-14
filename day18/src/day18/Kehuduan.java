package day18;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Kehuduan {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// 创建客户端，设定要连接的服务器ip地址和端口号
		Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
		// 创建输出流
		OutputStream os = socket.getOutputStream();
		// 发送请求数据
		byte[] bs = "你好，在么?".getBytes();
		// 把请求数据bs写入流中
		os.write(bs);
		// 告诉服务器我写完了
		socket.shutdownOutput();
		// 关闭流
		os.close();
	}

}
