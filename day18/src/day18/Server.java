package day18;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// 服务端监听8888的端口 当有客户端尝试连接8888的端口的时候 就会
		// 连接到该服务器
		ServerSocket server = new ServerSocket(8888);
		// 接入客户端的请求
		Socket client = server.accept();
		System.out.println("我接收到了客户端的接入");
		// 从客户端的输入流中读取数据
		InputStream is = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = is.read(bs);

		System.out.println(new String(bs, 0, len));
		is.close();
		server.close();
	}

}
