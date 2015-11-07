import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class Main extends WebSocketServer {

	public Main() throws UnknownHostException {
		super(new InetSocketAddress(3000));
		System.out.println("constructor");
	}

	@Override
	public void onClose(WebSocket arg0, int arg1, String arg2, boolean arg3) {
		System.out.println("Close");
	}

	@Override
	public void onError(WebSocket arg0, Exception arg1) {
		System.out.println("error");
		arg1.printStackTrace();
	}

	@Override
	public void onMessage(WebSocket ws, String arg1) {
		System.out.println("message");
		ws.send("Hello world!");
	}

	@Override
	public void onOpen(WebSocket arg0, ClientHandshake arg1) {
		System.out.println("open");
	}
	
	public static void main(String[] args) {
		try {
			Main m = new Main();
			m.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
