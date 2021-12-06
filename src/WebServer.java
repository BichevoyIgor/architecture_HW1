
public class WebServer {

    public static void main(String[] args) {
        SocketInit socketInit = new SocketInit();
        while (true) {
            HandleRequest handleRequest = new HandleRequest(socketInit.getSocket());
            new Thread(() -> handleRequest.request()).start();
        }
    }
}
