import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int SERVER_PORT = 12345; // Cổng kết nối

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
             Socket socket = serverSocket.accept();
             InputStream inputStream = socket.getInputStream()) {
            System.out.println("Client connected.");

            while (true) {
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                if (bytesRead == -1) {
                    break;
                }
                String message = new String(buffer, 0, bytesRead);
                System.out.println("Received: " + message);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during communication: " + e.getMessage());
            // Ghi log file
            // ...
        }
    }
}