import java.util.Queue;

public class Producer implements Runnable{
    private static final int MAX_QUEUE_SIZE = 5;
    private final Queue<String> messageQueue;

    public Producer(int messageQueue){
        this.messageQueue = messageQueue;
    }
    @Override
    public void run() {
        int messageCounter = 1;

        while (true){
            synchronized (messageQueue){
                while (messageQueue.size() >= MAX_QUEUE_SIZE){
                    try{
                        messageQueue.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                String message = "Message" + messageCounter;
                messageQueue.add(message);
                System.out.println("Producer producer: "+ message);
                messageCounter++;

                messageQueue.notifyAll();
            }
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
