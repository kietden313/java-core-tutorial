import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class Client {
    private static final String SERVER_IP = "192.168.137.1"; // Địa chỉ IP của máy B
    private static final int SERVER_PORT = 12345; // Cổng kết nối

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             OutputStream outputStream = socket.getOutputStream()) {
            System.out.println("Connected to server.");

            while (true) {
                String message = generateRandomString();
                outputStream.write(message.getBytes());
                System.out.println("Sent: " + message);
                Thread.sleep(1000); // Gửi một chuỗi mới sau mỗi giây
            }
        } catch (IOException e) {
            System.err.println("An error occurred during communication: " + e.getMessage());
            // Ghi log file
            // ...
        } catch (InterruptedException e) {
            System.err.println("Interrupted.");
        }
    }

    private static String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = random.nextInt(10) + 1; // Độ dài chuỗi từ 1 đến 10 ký tự
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}